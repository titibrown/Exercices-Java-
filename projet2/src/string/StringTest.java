package string;


import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texte;
		texte = "Bonjour";
		System.out.println(texte);
		texte = "hello";
		System.out.println(texte);

		
		//nombre de caractère
		
		String str = "java c'est compliqué";
		System.out.println(str.length());
		
		//Mettre en majuscule
		String str2 = str.toUpperCase();
		System.out.println(str2);
		
		
		//Remplacer des carateres
		String str1 = str2.replace('a','e');
		System.out.println(str1);
		
		
		//extraction d'une sous chaine
		String str4 = str1.substring(0,4);
		System.out.println(str4);
		
		
		//suppression des blancs en début et fin de  chaine
		String str3 = str1.trim();
		System.out.println(str3);
		
		//comparaison de chaines
		String chaine1 = "test";
		String chaine2 ="test1";
		System.out.println(chaine1.equals(chaine2));			
		//String chaine1 = "test";
		//String chaine2 ="TEST";
		//System.out.println(chaine1.equalsIgnoreCase(chaine2));
		
		
		

		

		//Scanner sc = new Scanner (System.in);
		// sc.hasNext();

		// Math.addExact(1, 2);

	}

}
