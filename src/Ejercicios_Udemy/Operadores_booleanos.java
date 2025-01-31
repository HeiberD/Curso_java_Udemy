package Ejercicios_Udemy;

public class Operadores_booleanos {

	public static void main(String[] args) {
		int x = 0;
		int y = 2;
		if (x != 0) {
			
						
		boolean b = ( x != 0 ) & ((y / x) != 0);
		
		System.out.println("El resultado final es: " + b);
		
		}else { 
		
			System.out.println("Error: Division por cero");
	}

}
}