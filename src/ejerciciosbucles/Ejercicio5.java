package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, mcm = 0;
		try {
			do {
				System.out.print("Ingresa un número para calcular el minimo común múltiplo: ");
				a = sc.nextInt();
				System.out.print("Ingresa otro número para calcular el minimo común múltiplo: ");
				b = sc.nextInt();
			} while (a <= 0 || b <= 0);
		} catch (InputMismatchException e) {
			System.out.println("Error de tipo introducido");
		}
		
		mcm=a*b;
		
		for (int i = a; i>mcm; i++) {
			if (i % a == 0 && i % b == 0) {
				mcm = i;
			}
		} // for

		System.out.println(mcm);

		sc.close();
	}

}

