package logica;
import java.util.Scanner;

public class Ejercicio8 {
	//Ejercicio 8
	
	 public static void primos() {
		 
		 //Declaramos el arreglo
		 String[] arreglo = new String [10];
		
		 
		 //declaramos la variable de un contador 
		 int cuenta = 0;
		 int dis= 9;
		 
		 //iniciamos un scanner
		 
		 Scanner numero = new Scanner(System.in);
		
		/*Calculos*/
		 
		 for (int i=0;i<10;i++) {//iremos pidiendo valores
			 
			 System.out.println("Dame el valor " + (i+1));
			 int valor = numero.nextInt();
			 
			 //declaramos un contador auxiliar ascendente
			 int contador = 0;
			 
			 for(int j=1; j<=valor; j++) {//aqui contaremos los modulos 0
				 
				 if ((valor%j)==0) {
					 contador ++;
				 }
				 
			 }//fin del for interno
			 
			 if(contador ==2) {
				 arreglo[cuenta] = Integer.toString(valor);
				 cuenta++;
			 } 
			 if(!(contador ==2)) {
				 arreglo[dis]=Integer.toString(valor);
				 dis --;
			 }
			 
			 
		 }//fin del for externo
		 
		
		
		
		
		/*Imprimimos el arrelog*/
		 
		 for(int i=0;i<10;i++) {
			 System.out.println("pos["+i+"] "+ arreglo[i]);
			 
		 }
		
		
		
		
		
		
		
		
		/*Cerramos la escucha*/
		numero.close();
		
		
		
		
		
		
	} 
	 
	 public static void main(String[] args) {
			primos();
		}

}