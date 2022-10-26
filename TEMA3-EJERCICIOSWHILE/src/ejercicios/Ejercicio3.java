package ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando. 
 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
 * antes de acabar, mostrará la media de los números positivos introducidos por el usuario.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos variables. Num se lo pediremos al usuario, y la variable contador la
		// inicializaremos para usarla en el bucle.
		int num;
		int contador = 0;
		int suma = 0;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos variable al usuario
		System.out.println("Deme un número: ");
		num = key.nextInt();

		// Creamos el bucle
		while (num >= 0) { // Mientras num sea positivo seguirá ejecutandose el bucle.
			contador++; // Le sumamos en cada vuelta del bucle uno para que nos sirva como contador.
			suma += num; // Sumamos a la variable suma num cada vez que entre en el bucle.
			num = key.nextInt(); // Y pedimos otra vez el número para añadirlo a la suma del bucle.
		}

		System.out.println("La media es de : " + (double) suma / contador); // Por último imprimimos el total del
																			// resultado creando una operación en la que
																			// dividamos la suma entre el contador para
																			// hacer la media y para que nos salga con
																			// decimales haré un cast a la operación.

		// Cerramos el escaner
		key.close();
	}

}
