package logica;
import java.util.Scanner;

public class Ejercicio7 {
	//Ejercicio 7
	
	 public static void horas() {
		
		/*Pedimos los valores*/
		Scanner dia = new Scanner(System.in);
		System.out.println("Ingresa el dia en formato Lunes|Martes|Miercoles|Jueves|Viernes");
		String palabra = dia.nextLine();
		System.out.println("Ingresa la hora formato 24 horas");
		int hora = dia.nextInt();
		System.out.println("Ingresa los minutos");
		int minutos = dia.nextInt();
		
		//Variable para calculo de minutos
		int calculo = 5;
		
		/*Realizamos las operaciones*/
		
		switch (palabra) { 
	    case "Lunes":
	    	calculo -= 0;
	     break;
	    case "Martes":
	    	calculo -= 1;
	     break;
	    case "Miercoles":
	    	calculo -= 2;
	     break;
	    case "Jueves":
	    	calculo -= 3;
		     break;
	    case "Viernes":
	    	calculo -= 4;
		     break;
	    default:
	    	System.out.println("Valor dia invalido");
	  }
		calculo *= 24;
		calculo -= hora;
		calculo *= 60;
		calculo -= minutos;
		
		
		System.out.println("Faltan "+ calculo + " minutos para el fin de semana");
		
		
		
		/*Cerramos la escucha*/
		dia.close();
		
		
		
		
		
		
	} 
	 
	 public static void main(String[] args) {
			horas();
		}

}