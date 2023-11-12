//Entrada=20 || R.Esperado= no capicua  || R.Obtenido= no capicua
//Entrada=1221 || R.Esperado= capicua  || R.Obtenido= capicua
//Entrada=2 || R.Esperado= capicua  || R.Obtenido= capicua
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		//Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		//Iniciamos variables
		int num = 0, num1 = 0, numReves = 0, digito = 0;

		//Hacemos un do while parapedir los datos y que estos sean válidos
		do {
			try {

				System.out.println("Introduce un número inicial");
				num = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Error de tipo");
			}
		} while (num < 0);

		
		// Calcular e imprimir el número al revés para después restarlo al número normal
		num1 = num;
		while (num1 != 0) {
			digito = num1 % 10;
			numReves = numReves * 10 + digito;
			num1 = num1 / 10;
		}
		//if para ver si es capicua o no restando el número al revés con el original
		if (num - numReves == 0) {
			System.out.println("El número es capicúa");
		} else {
			System.out.println("El número no es capicúa");
		}
		//Cerramos escaner

		sc.close();

	}
}
