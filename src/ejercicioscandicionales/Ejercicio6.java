package ejercicioscandicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int sum1, sum2;
		int num1 = r.nextInt(0, 100);
		int num2 = r.nextInt(0, 100);

		System.out.println("Los números son: " + num1 + " y " + num2 + " ¿Cuál es la suma de los números?");
		sum2 = sc.nextInt();

		sum1 = num1 + num2;

		if (sum1 == sum2) {
			System.out.println("Acertaste!!!");
		} else {
			System.out.println("Fallaste");
		}
		sc.close();
	}

}
