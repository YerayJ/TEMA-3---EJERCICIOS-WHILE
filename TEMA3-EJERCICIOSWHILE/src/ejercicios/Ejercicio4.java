package ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que vaya pidiendo al usuario números y muestre por pantalla si el número es 
 * par o impar (indistintamente que sea positivo o negativo). El algoritmo terminará cuando el 
 * usuario introduzca el número cero.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos variables. Num se lo pediremos al usuario.
		int num;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos variable al usuario
		System.out.println("Deme un número: ");
		num = key.nextInt();

		// Creamos el bucle
		while (num != 0) { // Mientras num sea positivo seguirá ejecutandose el bucle.
			if (num % 2 == 0) { // Si al dividir num entre 2 da de resto 0 significa que el número es par y lo imprimimos.
				System.out.println("El número es par");
			} else { // En caso contrario imprimimos que el número es impar.
				System.out.println("El número es impar");
			}
			num = key.nextInt(); // Y pedimos otra vez el número para añadirlo a la suma del bucle.
		}

		System.out.println("El programa ha acabado"); // Imprimimos que el programa ha acabado.

		// Cerramos el escaner
		key.close();
	}

}
