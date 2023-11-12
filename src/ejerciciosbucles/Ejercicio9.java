//Entrada=0 || R.Esperado= 1 cero || R.Obtenido= 1 cero
//Entrada=110 || R.Esperado= 1 cero || R.Obtenido= 1 cero
//Entrada=102300 || R.Esperado= 3 cero || R.Obtenido= 3 cero
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);

		// Inicialización de variables
		int num = 0, cant0 = 0, numCifras = 0, x, cifra, i;

		// Bucle do-while para asegurar que se ingrese un número no negativo
		do {
			try {
				// Se solicita al usuario que ingrese un número inicial
				System.out.println("Introduce un número inicial");
				num = sc.nextInt();

			} catch (InputMismatchException e) {
				// Si se ingresa un tipo de dato incorrecto, se maneja la excepción y se muestra
				// un mensaje
				System.out.println("Error de tipo");

				// Se limpia el buffer del scanner para evitar un bucle infinito
				sc.nextLine();
			}
		} while (num < 0);

		// Se copia el valor de num en x para no modificar la variable original
		x = num;
		// Bucle do while para contar las cifras en el número
		do {

			x = x / 10;
			numCifras++;
		} while (x != 0);

		// Bucle for para analizar cada cifra en el número
		for (i = 0; i < numCifras; i++) {
			// Se extrae la cifra en la posición i
			cifra = (num / (int) Math.pow(10, i) % 10);

			// Se verifica si la cifra es igual a 0
			if (cifra == 0) {
				cant0++;
			}
		}

		// Se imprime la cantidad de ceros
		System.out.println("Tienes " + cant0 + " ceros");

		// Cerramos escaner
		sc.close();
	}
}
