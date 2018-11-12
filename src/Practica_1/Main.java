package Practica_1;

import java.awt.event.KeyEvent;
import java.awt.EventQueue;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
	
	static boolean confirmuser = false;
	static boolean confirmpass = false;
	static boolean menu = true;

	
	public static void main(String[]args) {
		//defino el usuario, los productos y las categorias
		Category libros = new Category("Libros", 0001);
		Category peliculas = new Category ("Peliculas", 0002);
		User user1 = new User(0001, "Admin","password");
		Product libro1 = new Product(01,"La torre Oscura", 9.95, true, libros);
		Product libro2 = new Product(02, "Cronicas del vacio", 7.90, true, libros);
		Product pelicula1 = new Product(03,"Deadpool", 20.00, true, peliculas);
		Scanner cap = new Scanner(System.in);
		//hago un switch con el cual se hara el menu
		System.out.print("1.Introduce nombre de usuario y contraseña\n2.Mostrar Categorias\n3.Comprar\n4. Salir\n");
		int choice = cap.nextInt();
		System.out.flush();
		while (menu) {
			switch (choice) {
			//introduce el usuario y la contraseña comprobando si esta registrado
			case 1:
				Gestion.login(confirmuser,confirmpass, user1);
				break;
				//muestra de productos
			case 2:
				if (confirmpass == true || confirmuser == false) {
					for(int i=0; i < Category.listproducts.size();i++) {
						System.out.print("[");
						System.out.print(i+1);
						System.out.print("]");
						System.out.println(Category.listproducts.get(i).name());
						Gestion.pressAnyKeyToContinue();
					}
				} else 
					Gestion.errorLogin(confirmuser, confirmpass);
				break;
			case 3:
				if (confirmpass == true || confirmuser == false) {
					
				}
				break;
			case 4:
				System.out.print("Gracias por su visita");
				menu = false;
				System.exit(0);
			}
		}
	}
}	
	
