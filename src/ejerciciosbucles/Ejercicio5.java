//Entrada=1 y 4|| R.Esperado= 4 || R.Obtenido= 4
//Entrada=6 y 3 || R.Esperado= 6 || R.Obtenido= 6
//Entrada=9 y 7 || R.Esperado= 63 || R.Obtenido= 63
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Se crea escanner
		Scanner sc = new Scanner(System.in);

		// Se inicializan las variables a, b y mcm (mínimo común múltiplo)
		int a = 0, b = 0, mcm = 0;

		try {
			// Se utiliza un bucle do-while para garantizar que los números ingresados sean
			// positivos
			do {
				// Pedimos el primer numero
				System.out.print("Ingresa un número para calcular el mínimo común múltiplo: ");
				a = sc.nextInt();

				// Pedimos el segundo número
				System.out.print("Ingresa otro número para calcular el mínimo común múltiplo: ");
				b = sc.nextInt();
			} while (a <= 0 || b <= 0);
		} catch (InputMismatchException e) {

			// Si se produce una excepción de tipo InputMismatchException, se captura y se
			// imprime un mensaje de error
			System.out.println("Error de tipo introducido");
		}

		// Se calcula el mínimo común múltiplo utilizando la fórmula mcm = a * b
		mcm = a * b;

		// Se utiliza una estructura condicional para determinar cuál número es mayor
		if (a > b) {
			// Bucle for para encontrar el mínimo común múltiplo real cuando a es mayor que
			// b
			// El for nos va a ir calculando desde el mcm inicial hasta el número mayor
			// restando -1 en -1
			for (int i = mcm; i >= a; i--) {
				if (i % a == 0 && i % b == 0) {
					// Si i es un múltiplo común, se actualiza el valor de mcm
					mcm = i;
				}
			}
		} else if (b > a) {
			// Bucle for para encontrar el mínimo común múltiplo real cuando b es mayor que
			// a
			// El for nos va a ir calculando desde el mcm inicial hasta el número mayor
			// restando -1 en -1
			for (int i = mcm; i >= b; i--) {
				if (i % a == 0 && i % b == 0) {
					// Si i es un múltiplo común, se actualiza el valor de mcm
					mcm = i;
				}
			}
		}

		// Se imprime el mínimo común múltiplo calculado
		System.out.println("El mínimo común múltiplo es: " + mcm);

		// Se cierra el objeto Scanner para liberar recursos
		sc.close();
	}
}