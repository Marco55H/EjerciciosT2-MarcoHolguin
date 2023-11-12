//Entrada=2 y 6 || R.Esperado= 2 || R.Obtenido= 2
//Entrada=5 y 40 || R.Esperado= 5 || R.Obtenido= 5
//Entrada=6 y6  || R.Esperado= 6 || R.Obtenido= 6
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Iniciamos Scanner
		Scanner sc = new Scanner(System.in);

		// Se inicializan las variables a, b y Mcd
		int a = 0, b = 0, Mcd = 0;

		try {
			// Se utiliza un bucle do-while para garantizar que los números ingresados sean
			// positivos
			do {
				// Pedmos el primer número
				System.out.print("Ingresa un número para calcular el máximo común divisor: ");
				a = sc.nextInt();
				// Pedimos el otro número
				System.out.print("Ingresa otro número para calcular el máximo común divisor: ");
				b = sc.nextInt();
			} while (a <= 0 || b <= 0);
		} catch (InputMismatchException e) {
			// Si se produce una excepción de tipo InputMismatchException, se captura y se
			// imprime un mensaje de error
			System.out.println("Error: Debes ingresar números enteros.");
		}

		// Se utiliza un bucle for para encontrar el máximo común divisor (MCD) de a y b
		for (int i = 2; i <= a; i++) {
			// Se verifica si i es un divisor común de a y b
			if (a % i == 0 && b % i == 0) {
				// Si i es un divisor común, se actualiza el valor de Mcd
				Mcd = i;
			}
		} // For

		// Se imprime el resultado
		System.out.println("El máximo común divisor es: " + Mcd);

		// Cerramos escáner
		sc.close();
	}
}