package Ejercicios_Udemy;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		int num1;
		int num2;
		int suma;
		int resta;
		int multiplicacion;
		int division;
		int modulo;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		num2 = teclado.nextInt();
		
		suma = num1 + num2; 
		resta= num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		modulo = num1 % num2;
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la multiplcacion es: " + multiplicacion);
		System.out.println("El resultado de la division es: " + division);
		System.out.println("El resultado de la operacion modulo es: " + modulo);
	}

} 