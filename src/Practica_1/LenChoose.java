package Practica_1;

import java.util.Locale;
import java.util.ResourceBundle;

public class LenChoose {
		
	static String language = System.getProperty("user.country");
    static String country = System.getProperty("user.language");
		
	    
    static String sring1;
    static String sring2;
	static String sring3;
    static String sring4;
	    
	    
    static String sring5;
    static String sring6;
    static String sring7;
    static String sring8;
	    
	    
	static String sringexir;
		
	protected static void setLanguage(String language ) {
		LenChoose.language = language;
	}

	protected static void setCountry(String country) {
		LenChoose.country = country;
	}

	public static void translate() {
		Locale currentLocale;
	    ResourceBundle messages;

		currentLocale = new Locale(language, country);

		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		sring1 = messages.getString("Intro");
		sring2 = messages.getString("Intro1");
		sring3 = messages.getString("Intro2");
		        
		sring5 = messages.getString("Prod");
		sring6 = messages.getString("Usr");
        sring7 = messages.getString("Pssw");
        sring8 = messages.getString("Log");
		        
        sring4 = messages.getString("Input");
        sringexir = messages.getString("Exit");	}
		
	protected static String getSring1() {
		return sring1;
	}

	protected static String getSring2() {
		return sring2;
	}

	protected static String getSring3() {
		return sring3;
	}
	protected static String getSring4() {
		return sring4;
	}
		
	protected static String getSring5() {
		return sring5;
	}
	protected static String getSring6() {
		return sring6;
	}
	protected static String getSring7() {
		return sring7;
	}
	protected static String getSring8() {
		return sring8;
	}
			
	protected static String getSringexir() {
		return sringexir;
	}		

}
