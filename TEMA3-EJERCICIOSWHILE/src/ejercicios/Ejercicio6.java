package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Implementar una aplicación para calcular datos estadísticos de las edades de
	 * los alumnos de un centro educativo. Se introducirán datos hasta que uno de
	 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
	 * la media, el número de alumnos y cuántos son mayores de edad.
	 */

	public static void main(String[] args) {
		// Creamos variables. Edad será la que pediremos por el teclado.
		int edad;
		int suma = 0;
		int media = 0;
		int alumnos = 0;
		int mayoredad = 0;

		// Creamos escaner para leer datos
		Scanner key = new Scanner(System.in);

		// Pedimos la variable edad al usuario
		System.out.println("Deme la edad de varios alumnos ");
		edad = key.nextInt();

		if (edad <= 0) {
			System.out.println("Debe introducir una edad mayor que 0");
		} else {
			// Creamos el bucle while
			while (edad > 0) {
				// Añadimos cada entrada de edad a la suma
				suma += edad;
				// Ahora el número de alumnos que lo usaremos como un contador
				alumnos++;
				// Por último si alguno es mayor de edad lo almacenaremos en el contador de
				// mayoredad con un if
				if (edad > 17) {
					mayoredad++;
				}
				// Volvemos a pedir la edad
				edad = key.nextInt();
			}

			// Ahora imprimiremos los resultados
			System.out.println("La suma de todas las edades es " + suma);
			// La media la sacaremos diviendo la suma entre el número de alumnos
			// introducidos
			System.out.println("La media de todas las edades es " + suma / alumnos);
			System.out.println("El número de alumnos es " + alumnos);
			System.out.println("El total de alumnos mayores de edad es " + mayoredad);
		}
		// Cerramos el escaner
		key.close();
	}

}
