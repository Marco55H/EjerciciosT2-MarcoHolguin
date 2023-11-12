//Entrada=1h 12 min 34 seg 80 seg extra || R.Esperado= 1h 13min 54seg || R.Obtenido 1h 13min 54seg
//Entrada=23h 59 min 50 seg 20 seg extra || R.Esperado= 0h 10min 10seg || R.Obtenido 0h 10min 10seg
//Entrada=28h 12 min 34 seg 80 seg extra || R.Esperado= No has introducido valores válidos || R.Obtenido No has introducido valores válidos


package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Se  un escanner
		Scanner sc = new Scanner(System.in);

		// Se declaran e inicializan las variables para almacenar los valores de segundos, minutos, horas y segundos extras
		int i, min, hora, extra, seg;

		try {
			// Se solicita al usuario ingresar la cantidad de segundos
			System.out.println("¿Cuántos segundos tienes?");
			seg = sc.nextInt();

			// Se solicita al usuario ingresar la cantidad de minutos
			System.out.println("¿Cuántos minutos tienes?");
			min = sc.nextInt();

			// Se solicita al usuario ingresar la cantidad de horas
			System.out.println("¿Cuántas horas tienes?");
			hora = sc.nextInt();

			// Se solicita al usuario ingresar la cantidad de segundos extras que desea
			// agregar
			System.out.println("¿Cuántas segundos extras quieres?");
			extra = sc.nextInt();

			// Se verifica si los valores ingresados son válidos (segundos hasta 59, minutos
			// hasta 59, horas hasta 24)
			if (seg > 59 || min > 59 || hora > 24 || seg < 0 || min < 0 || hora < 0) {
				System.out.println("No has introducido valores válidos");
				System.out.println("---------------------------------------");
				System.out.println("Segundos hasta 59");
				System.out.println("Minutos hasta 59");
				System.out.println("Horas hasta 24");
			} else {
				// Bucle for para agregar los segundos extras
				for (i = 0; i < extra; i++) {
					seg = seg + 1;

					// Si los segundos superan 59, se ajusta el valor de los minutos
					if (seg >= 60) {
						seg = seg % 60;
						min = min + 1;

						// Si los minutos superan 59, se ajusta el valor de las horas
						if (min >= 60) {
							min = min % 60;
							hora = hora + 1;

							// Si las horas superan 23, se reinicia el contador de horas
							if (hora > 23) {
								hora = 0;
							}
						}
					}
				}

				// Se imprime la nueva hora después de agregar los segundos extras
				System.out.println("La hora con un segundo más es de: " + hora + ":" + min + ":" + seg);
			}
		} catch (InputMismatchException e) {
			// Si se produce una excepción de tipo InputMismatchException, se captura y se imprime un mensaje de error
			System.out.println("Error: Debes ingresar números enteros.");
		}

		// cerramos escaner
		sc.close();
	}
}
