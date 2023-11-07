package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Variable para el recoger el numero que introduzca el usuario
		int num, num1;

		// Varibles para saber sus digitos
		int atras, resto;
		// Inicio escaner
		Scanner sc = new Scanner(System.in);

		// Pregunto por el numero y lo recogo en la variable
		System.out.println("Introduce un número de hasta 4 cifras: ");
		num = sc.nextInt();

		// Compruebo si SI es capicua
		if (num >= 0 && num < 10000) {

			if (num < 10000 && num > 1000) {
				resto = num % 10;
				atras = num / 1000;
				if (atras == resto) {
					num1 = num / 100;
					num1 = num1 / 10;
					resto = num / 10;
					resto = resto % 10;
					System.out.println(num + " SI es capicua");
				} else {
					System.out.println(num + " No es capicua");
				}

			}
			if (num > 100 && num < 1000) {
				resto = num % 10;
				atras = num / 100;
				if (atras - resto == 0) {
					System.out.println(num + " SI es capicua");
				} else {
					System.out.println(num + " No es capicua");
				}
				if (num >= 10 && num < 100) {
					atras = num % 11;
					if (atras == 0) {
						System.out.println(num + " SI es capicua");
					} else {
						System.out.println(num + " No es capicua");
					}

				}
			}
			if (num < 10) {
				System.out.println(" SI es capicua");
			}

		} else {
			System.out.println("Tu número no está en el rango pedido");
		}

		sc.close();

	}

}
