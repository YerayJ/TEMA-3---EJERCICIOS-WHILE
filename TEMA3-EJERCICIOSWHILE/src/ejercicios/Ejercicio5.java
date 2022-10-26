package ejercicios;

import java.util.Scanner;

/*
Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero).
Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, 
la media de los números negativos y el número de ceros que ha introducido el usuario.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos variables. Num se lo pediremos al usuario, y la variable contador la
		// inicializaremos para usarla en el bucle.
		int num;
		int contador = 0;
		int contadorneg = 0;
		int contadorcero = 0;
		int sumapositivos = 0;
		int sumanegativos = 0;

		// Creamos un escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos variable al usuario
		System.out.println("Deme un número: ");
		num = key.nextInt();

		// Creamos el bucle
		while (contador < 11) { // Mientras contador sea menor que 11 seguirá ejecutandose el bucle.
			contador++; // Por cada pasada en el bucle le sumamos uno, ya que necesitamos en total 10
						// números.
			if (num > 0) { // Este if es para número positivos y le sumamos num a una variable.
				sumapositivos += num;
			}
			if (num < 0) { // Este if es para número negativos, haremos una variable de suma también pero
							// esta vez como necesitamos la media haré un contador para dividir después.
				sumanegativos += num;
				contadorneg++;
			}
			if (num == 0) { // En este if si num es 0 lo guardaremos en un contador de ceros.
				contadorcero++;
			}
			num = key.nextInt(); // Y pedimos otra vez el número para añadirlo a la suma del bucle.
		}

		System.out.println("La suma de números positivos es de : " + sumapositivos);
		// Imprimimos el resultado de la suma de los número positivos.
		System.out.println("La media de números negativos es de : " + (double) sumanegativos / contadorneg);
		// Imprimimos el resultado haciendo una división entre suma y contador para
		// sacar la media y le haré un cast a double para tener decimales.
		System.out.println("El total de números cero introducido es de: " + contadorcero);
		// Imprimimos el contador de cero como resultado.
		
		// Cerramos el escaner
		key.close();
	}

}
