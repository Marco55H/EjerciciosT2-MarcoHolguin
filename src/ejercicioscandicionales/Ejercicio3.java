package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Iniciamos el escáner
		Scanner sc = new Scanner(System.in);

		// Iniciamos las variables que nos dará el usuario
		int animal, comida, kg;

		float racion;
		// Pedimos el número de animales
		System.out.println("Cuantos animales tienes");
		animal = sc.nextInt();

		// Pedimos el número de alimentos
		System.out.println("Cuanto alimento has comprado");
		comida = sc.nextInt();

		// Pedimos el número total de alimentos que comen los animales
		System.out.println("Cuanto alimento consumen los animales");
		kg = sc.nextInt();

		if (animal != 0) {
			if (kg >= comida) {

				racion = (float) comida / animal;
				System.out.println(
						"Como no tienes comida suficiente a cada animal le toca " + racion + " kg de alimentos");

			} else {
				System.out.println("Tienes comida suficiente");}
		}else {
			System.out.println("Necesitas animales para que funcione el programa");
		}
		sc.close();
	}
}
