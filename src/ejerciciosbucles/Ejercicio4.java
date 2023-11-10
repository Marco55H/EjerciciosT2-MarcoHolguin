package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, Mcd = 0;
		try {
			do {
				System.out.print("Ingresa un número para calcular el máximo común divisor: ");
				a = sc.nextInt();
				System.out.print("Ingresa un número para calcular el máximo común divisor: ");
				b = sc.nextInt();
			} while (a <= 0 || b <= 0);
		} catch (InputMismatchException e) {
			System.out.println("Error de tipo introducido");
		}

		for (int i = 2; i <= a; i++) {

			if (a % i == 0 && b % i == 0) {
				Mcd = i;
			}

		} // for

		System.out.println(Mcd);

		sc.close();
	}
}
