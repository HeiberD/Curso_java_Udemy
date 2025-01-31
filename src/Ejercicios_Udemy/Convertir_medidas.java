package Ejercicios_Udemy;

import java.util.Scanner;
public class Convertir_medidas {
				public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce el numero en metros del objeto:");
			    int cantidad = sc.nextInt();
			    System.out.println("El numero pasado a pies es: " + (cantidad * 100 / 30.48));
			  	System.out.println("El numero pasado a pulgadas es: " + (cantidad * 100 / 2.54));
			    System.out.println("El numero pasado a centimetros es: " + (cantidad * 100));
			    
			   
			}

		}