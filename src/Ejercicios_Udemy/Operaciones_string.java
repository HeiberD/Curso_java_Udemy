package Ejercicios_Udemy;

public class Operaciones_string {

	public static void main(String[] args) {
		String cadena1 = "Hola";
		String cadena2 = "Mundo";
		

		
		int enteroAunir = 20;
		
		//concatenar
		
		String mensaje = cadena1 + " " + cadena2;
		System.out.println(mensaje);
		
		String textoynumero = cadena1 + enteroAunir;
		System.out.println(textoynumero);
		
		
	int cantidadDecaracteres = "Heiber Diaz".length();
	System.out.println("La cantidad de caracteres de mi nombre es: " + cantidadDecaracteres );
	
	
	String lenguajeFavorito = "Mi lenguaje favorito es Java";
	String extraccion = lenguajeFavorito.substring(24, 28);
	System.out.println("La extraccion es: " + extraccion);
	
	
	String saludo1 = "Hola Mundo";
	String saludo2 = "hola Mundo";
	boolean esIgual = saludo1.equals(saludo2);
	System.out.println("Son iguales la cadenas?: " + esIgual);
	
	
	boolean esIgualIgnoraMayusculas = saludo1.equalsIgnoreCase(saludo2);
	System.out.println("Son iguales las cadenas ignorando mayusculas?: " + esIgualIgnoraMayusculas);
	
	
	//indexof: Devolver el indice de alguna letra dentro de un string
	
	int indice = "Argentina".indexOf("a");
	System.out.println("El indice de la letra 'a' es:" + indice);
	
	String opinion = "Colombia es un pais en desarrollo";
    int indiceColombia = opinion.indexOf("Colombia");
    System.out.println("El indice de Colombia es: " + indiceColombia);
	}

}
