package ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando. 
 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
 * antes de acabar, mostrará la cantidad de números positivos introducidos por el usuario.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos variables. Num se lo pediremos al usuario, y la variable contador la
		// inicializaremos para usarla en el bucle.
		int num;
		int contador = 0;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos variable al usuario
		System.out.println("Deme un número: ");
		num = key.nextInt();

		// Creamos el bucle
		while (num >= 0) { // Mientras num sea positivo seguirá ejecutandose el bucle
			contador++; // Le sumamos en cada vuelta del bucle uno para que nos sirva como contador
			num = key.nextInt(); // Y pedimos otra vez el número para añadirlo a la suma del bucle.
		}
		System.out.println("Hay un total de : " + contador + " números"); // Por último imprimimos el
																		  // total del resultado.

		// Cerramos el escaner
		key.close();
	}

}
