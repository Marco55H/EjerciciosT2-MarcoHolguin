//Entrada=21 || R.Esperado= 8 || R.Obtenido= 8
//Entrada=0 || R.Esperado= 0 || R.Obtenido= 0
//Entrada=5 || R.Esperado= 3 || R.Obtenido= 3
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// Se crea escaner
		Scanner sc = new Scanner(System.in);

		// Se declaran e inicializan las variables i (para el for), num (emtido por el
		// usuario) y cantPrimo (cnntidad de números primos)
		int i, num, cantPrimo = 0;

		try {
			// Se solicita al usuario que indique hasta qué número desea conocer los números
			// primos
			System.out.println("Indique hasta qué número quieres conocer los primos");

			num = sc.nextInt();

			// Bucle for para contar desde 2 hasta el número del usuario
			for (i = 2; i <= num; i++) {
				// Se suma en 1 el contador de números primos
				cantPrimo++;

				// Bucle interno para verificar si i es primo
				for (int j = 2; j <= i / 2; j++) {
					// Si el número es divisible por algún número en el rango de 2 a i/2, no es
					// primo
					if (i % j == 0) {
						// Se resta el contador de números primos y sale del bucle
						cantPrimo--;
						break;
					} // if
				} // for
			} // for

			// Se imprime la cantidad de números primos encontrados en el rango
			System.out.println("Hay " + cantPrimo + " números primos entre el 1 y el " + num);
		} // try
		catch (InputMismatchException e) {
			// Si se produce una excepción de tipo InputMismatchException, se captura y se
			// imprime un mensaje de error
			System.out.println("Error: Debes ingresar un número entero.");
		} // catch

		// Cerramos eScanner
		sc.close();
	}
}