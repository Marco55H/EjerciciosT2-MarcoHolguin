package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, resp;

		System.out.println("Introduce el número para obtener su valor absoluto");
		num = sc.nextInt();

		resp = (num > 0) ? num : -num;

		System.out.println("El valor absoluto de tu número es: " + resp);

		sc.close();
	}
}