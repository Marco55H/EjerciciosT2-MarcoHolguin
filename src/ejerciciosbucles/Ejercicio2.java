package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cantPrimo = 0;
		try {
			System.out.println("Indique hasta que número quieres conocer los primos");
			num = sc.nextInt();

			for (int i = 2; i < num; i++) {
				for (int j = 2; j <= i / 2; j++) {

					if (num % j == 0) {
						cantPrimo++;
						break;
					} // if
				} // for
			} // for

			System.out.println("Hay " + cantPrimo + " números primos entre el 1 y el " + num);
		} // try
		catch (InputMismatchException e) {
			System.out.println("Error de tipo");
		} // catch

		sc.close();
	}
}