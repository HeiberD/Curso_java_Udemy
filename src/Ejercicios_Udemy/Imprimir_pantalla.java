package Ejercicios_Udemy;

import java.util.Scanner;

public class Imprimir_pantalla {

	public static void main(String[] args) {
		System.out.println("Comienzo del programa...");
	   System.out.println("Escribe tu nombre:");
	   String nombre = "";
	   
	   Scanner entradaTeclado = new Scanner(System.in);
	   nombre = entradaTeclado.nextLine();
	   System.out.println("Tu nombre es: " + nombre);



}
}

