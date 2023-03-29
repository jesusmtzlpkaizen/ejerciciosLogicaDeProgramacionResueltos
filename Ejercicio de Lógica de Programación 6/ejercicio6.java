package logica;
import java.util.Scanner;





public class Ejercicio6 {
	
	//Ejercicio 6
	
		 public static void palabra() {
			
			/*Pedimos la palabra*/
			Scanner frase = new Scanner(System.in);
			System.out.println("Ingresa una frase");
			String palabra = frase.nextLine();
			
			/*Realizamos las operaciones*/
			
			System.out.println("La palabra al reves es: "+ new StringBuilder(palabra).reverse().toString());
			
			
			
			/*Cerramos la escucha*/
			frase.close();
			
			
			
			
			
			
		} 
		 
		 public static void main(String[] args) {
				palabra();
			}

}