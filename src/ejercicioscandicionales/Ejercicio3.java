//Entrada=21 animal 234kg comprado 56kg alimento que consumen || R.Esperado= tienes suficiente  || R.Obtenido= tienes suficiente
//Entrada=0 animal 2kg comprado 5kg alimento que consumen || R.Esperado= no tienes animales  || R.Obtenido= no tienes animales
//Entrada=4 animal 5g comprado 20kg alimento que consumen || R.Esperado= 1.25  || R.Obtenido= 1.25
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

		//Si los animales no son 0
		if (animal != 0) {
			//Si lo que consumen los animales es más que lo que tu has comprado
			if (kg >= comida) {

				//La ración de cada animal será comidaa entre animales
				racion = (float) comida / animal;
				//El resulatdo
				System.out.println("Como no tienes comida suficiente a cada animal le toca " + racion + " kg de alimentos");

				//Si has comprado comida suficiente
			} else {
				System.out.println("Tienes comida suficiente");}
			//Si no tienes animales
		}else {
			System.out.println("Necesitas animales para que funcione el programa");
		}
		//Cerramos escaner
		sc.close();
	}
}
