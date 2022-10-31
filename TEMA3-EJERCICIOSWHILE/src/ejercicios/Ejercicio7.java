package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Codificar el juego “el número secreto”, que consiste en acertar un número
	 * entre 1 y 100 (generado aleatoriamente). Para ello se introduce por teclado
	 * una serie de números, para los que se indica: “mayor” o “menor”, según sea
	 * mayor o menor con respecto al número secreto. El proceso termina cuando el
	 * usuario acierta o cuando se rinde (introduciendo un -1).
	 * 
	 */

	public static void main(String[] args) {

		// Creamos las variables. Creamos un número aleatorio entre el 1 y el 100. Y
		// otra variable que será la que introduzca el usuario.
		int ramdom = (int) (Math.random() * 99 + 1);
		int num;

		// Creamos el escaner
		Scanner key = new Scanner(System.in);

		// Pedimos la variable num al usuario
		System.out.println("Deme un número (Pista: El número no es menor que 0): ");
		num = key.nextInt();

		// Creamos una condicion para que no meta un número menor que 0
		if (num < 0) {
			System.out.println("El número no puede ser negativo");
		} else { // A partir de aquí creamos el bucle
			while (num != -1 && num != ramdom) {// Mientras sea positivo se sigue con el bucle
				if (num > ramdom) {
					System.out.println("Su número es mayor");
				}
				else if (num < ramdom) {
					System.out.println("Su número es menor");
				}
				// Pedimos el número de nuevo si no ha acertado
				num = key.nextInt();
			}
			// Cuando termina el bucle imprimimos que ha terminado
			if (num == ramdom) {
			System.out.println("Has acertado");
			} else {
				System.out.println("GAME OVER");
			}
			}
		// Cerramos el escaner
		key.close();
	}

}
