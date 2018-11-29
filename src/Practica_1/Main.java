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
		
		int lenguage = 0;
		Scanner len = new Scanner(System.in);
		System.out.println("Elija idioma");
		System.out.println("1. English");
		System.out.println("2. Español");
		System.out.println("3. Français");
		lenguage = len.nextInt();
		
		if(lenguage == 1) {
			
			LenChoose.setCountry("US");
			LenChoose.setLanguage("en");
			
		}
		if(lenguage == 2) {
			
			LenChoose.setCountry("ES");
			LenChoose.setLanguage("es");
			
		}
		if(lenguage == 3) {
			
			LenChoose.setCountry("FR");
			LenChoose.setLanguage("fr");
			
		}
		
		if(lenguage !=1 && lenguage != 2 && lenguage!=3) {
			
			System.out.println("Valor invalido.");
			
		}
		
		while (!userdetected) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Para entrar tendras que crear un usuario, una contraseña y un Id");
			System.out.println("");
			System.out.println("Introduce tu Id:");
			id = sc.nextLine();
			Scanner sd = new Scanner(System.in);
			System.out.println("Introduce un nombre de usuario:");
			usuario = sd.nextLine();
			Scanner se = new Scanner(System.in);
			
			String proof = "";
				while(!passdetected) {
			
					System.out.println("Introduce una contraseña: ");
					contra = se.nextLine();
					Scanner st = new Scanner(System.in);
					System.out.println("Introduce la contraseña otra vez: ");
					proof = st.nextLine();
			
						if(contra.equals(proof)) {
							passdetected = true;
	
							mainproxy.setMainName(usuario);
							mainproxy.setMainId(id);
							mainproxy.setMainPassword(contra);
		}

		//hago un switch con el cual se hara el menu
		LenChoose.translate();
						
    	System.out.println(LenChoose.getSring5());
		System.out.println("1."+ LenChoose.getSring8());
		System.out.println("2."+ LenChoose.getSring5());
		System.out.println("3."+ LenChoose.getSring6());
		System.out.println("4."+ LenChoose.getSring7());
		System.out.println("5."+ LenChoose.getSringexir());  
	   	System.out.println(LenChoose.getSring4());
		int choice = cap.nextInt();

		

		
		String newUser, newPass, newId;				
						
		while (menu) {
			switch (choice) {
			//introduce el usuario y la contraseña comprobando si esta registrado
			
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
					Scanner username = new Scanner(System.in);
					System.out.println("Introduce el nuevo nombre de usuario: ");
					newUser = username.nextLine();
					mainproxy.setMainName(newUser);
					break;
				}
				break;
				
			case 4:

				Scanner passpass = new Scanner(System.in);
				System.out.println("Introduce la nueva contraseña: ");
				newPass = passpass.nextLine();
				mainproxy.setMainPassword(newPass);
				break;
				
			case 5:
				System.out.print("Gracias por su visita");
				menu = false;
				System.exit(0);
			}
		}
	}
}	
	
