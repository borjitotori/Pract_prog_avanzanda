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
	static boolean userdetected = false;
	static boolean passdetected = false;
	static boolean menu = true;

	
	public static void main(String[]args) {
		
		static MainProxy mainproxy = new MainProxy();
		
		static String id;
		static String usuario = "";
		static String contra = "";
		static String mal;
		static String na;
		static String pass;
		
		//defino el usuario, los productos y las categorias
		Category libros = new Category("Libros", 0001);
		Category peliculas = new Category ("Peliculas", 0002);
		Product libro1 = new Product(01,"La torre Oscura", 9.95, true, libros);
		Product libro2 = new Product(02, "Cronicas del vacio", 7.90, true, libros);
		Product pelicula1 = new Product(03,"Deadpool", 20.00, true, peliculas);
		Scanner cap = new Scanner(System.in);
		
		//hago un switch con el cual se hara el menu
		System.out.println("1.Introduce nombre de usuario y contraseña");
		System.out.println("2.Mostrar productos");
		System.out.println("3.Cambiar nombre de usuario");
		System.out.println("4.Cambiar contraseña del usuario");
		System.out.println("5.Salir del programa");
		int choice = cap.nextInt();

		// if there's no user detected it forces the new user on create a new one
		while (!userdetected) {
			Scanner opt = new Scanner(System.in);
			
			System.out.println("Para entrar tendras que crear un usuario, una contraseña y un Id");
			System.out.println("");
			System.out.println("Introduce tu Id:");
			id = opt.nextLine();
			System.out.println("Introduce un nombre de usuario:");
			usuario = opt.nextLine();
			
			String proof = "";
				while(!passdetected) {
			
					System.out.println("Introduce una contraseña: ");
					contra = opt.nextLine();
					System.out.println("Introduce la contraseña otra vez: ");
					proof = opt.nextLine();
			
						if(contra.equals(proof)) {
							passdetected = true;
	
							mainproxy.setMainName(usuario);
							mainproxy.setMainId(id);
							mainproxy.setMainPassword(contra);
		}
		
		String newUser, newPass, newId;				
						
		while (menu) {
			switch (choice) {
					
			//test if user is registered
			case 1:
				Scanner log = new Scanner(System.in);
				String usuarioconf = "",pass = "";
				System.out.println("Introduce tu nombre de usuario.");
				usuarioconf = log.nextLine();
				System.out.println("Introduce your password.");
				pass = log.nextLine();
				if((usuarioconf.equals(mainproxy.getMainName()) || pass.equals(mainproxy.getMainPassword()) )) {
					confirmpass = true;
					confirmuser = true;
				}
					
			//shows prod
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
					
			//it allows to change username from proxy	
			case 3:
				if (confirmpass == true || confirmuser == false) {
					Scanner username = new Scanner(System.in);
					System.out.println("Introduce el nuevo nombre de usuario: ");
					newUser = username.nextLine();
					mainproxy.setMainName(newUser);
					break;
				}
				break;
			
			//it allows to change password from proxy
			case 4:
				if (confirmpass == true || confirmuser == false) {
					Scanner passpass = new Scanner(System.in);
					System.out.println("Introduce la nueva contraseña: ");
					newPass = passpass.nextLine();
					mainproxy.setMainPassword(newPass);
				}
				break;
				
			case 5:
				System.out.print("Gracias por su visita");
				menu = false;
				System.exit(0);
			}
		}
	}
}	
	
