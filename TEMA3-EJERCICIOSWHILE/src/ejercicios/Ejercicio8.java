package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Un centro de investigación de la flora urbana necesita una aplicación que
	 * muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
	 * altura (en centímetros) de cada árbol (terminando la introducción de datos
	 * cuando se utilice -1 como altura). La aplicación debe devolver la altura del
	 * árbol más alto.
	 */

	public static void main(String[] args) {
		// Creamos variables. Altura es la variable que le pediremos al usuario. Y mayor
		// en la que almacenaremos el arbol mas alto.
		double altura;
		double mayor = 0;

		// Creamos escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos la altura al usuario
		System.out.println("Cuando quiera acabar introduzca -1");
		System.out.println("///////////////////////////////////");
		System.out.println("Deme la altura de un árbol: ");
		altura = key.nextDouble();

		// Creamos el bucle con la condición de que mientras sea distinto de -1 se
		// imprime
		if (altura < 0) { // En este if revisamos antes de entrar al bucle que la variable no es negativa
			System.out.println("La altura no puede ser negativa");
		} else { // A partir de aquí empezamos el bucle
			while (altura != -1) { // Mientras sea distinto de -1 no saldrá del bucle
				if (altura > mayor) { // Si la altura es mayor que la variable mayor en la que se almacenará el último
										// valor introducido más grande se vuelve a guardar la variable altura encima.
					mayor = altura;
				}
				//Volvemos a pedir la variable altura
				altura = key.nextDouble();
			}
			// Por último imprimimos el resultado
			System.out.println("El mayor es " + mayor);
		}

		// Cerramos el escaner
		key.close();
	}

}
