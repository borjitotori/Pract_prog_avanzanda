package Practica_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Gestion {
	static Scanner cap = new Scanner(System.in);
	static List<Product> carrito = new ArrayList<Product>();
	
	public static void login(boolean confirmuser, boolean confirmpass, User user1){
		System.out.print("Introduce nombre de usuario");
		String name = cap.nextLine();
		while (confirmpass == true || confirmuser == true) {
			if (name == user1.userName()) {
				confirmuser = true;
				System.out.print("Introduce la contraseña");
				String password = cap.nextLine();
				if (password == user1.password()) {
					confirmpass = true;
					System.out.print("Saludos" + user1.userName());
				}else
					System.out.print("Contraseña incorrecta");
			}else
			System.out.print("Nombre de usuario incorrecto");
		}
		System.out.flush();
	}
	public static void errorLogin(boolean user,boolean pass) {
		if (user == false || pass == false)
			System.out.print("Error, porfavor ingrese como usuario en la pagina");
	}
	public static void pressAnyKeyToContinue()
	 { 
	        System.out.println("Press Enter key to continue...");
	        try
	        {
	            System.in.read();
	        }
	        catch(Exception e) {
	   
	        }
	 }
	public static void comprar (Product prod) {
		if(prod.stock() == true) {
			carrito.add(prod);
			System.out.print(prod.name() + " comprado");
		}
	}
	public static void showProd() {
	
	}
}	
