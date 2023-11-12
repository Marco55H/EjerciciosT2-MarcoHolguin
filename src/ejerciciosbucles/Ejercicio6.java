//Entrada=1 || R.Esperado= 1 || R.Obtenido= 1
//Entrada=3 || R.Esperado= 1 22 333 || R.Obtenido= 1 22 333
//Entrada=0 || R.Esperado=  || R.Obtenido= 
package ejerciciosbucles;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// Se crea escanner
		Scanner sc = new Scanner(System.in);

		// Se declara e inicializa la variable para almacenar el número ingresado por el
		// usuario
		int num = 0;

		try {

			// Se solicita al usuario que ingrese un número para la base y altura del
			// triángulo
			System.out.print("Ingresa un número para la base y altura del triángulo (0<,>20 )  ");

			// Se lee el número ingresado por el usuario
			num = sc.nextInt();

		} catch (InputMismatchException e) {
			// Si se produce una excepción de tipo InputMismatchException, se captura y se
			// imprime un mensaje de error
			System.out.println("Error: Debes ingresar un número entero.");
		}

		if (num < 0 && num >= 20) {

			// Bucle externo para controlar las filas del triángulo
			for (int i = 1; i <= num; i++) {

				// Para meter el número que corresponde
				for (int k = 1; k <= i; k++) {
					System.out.print(i);
				}

				// Cambiar de línea después de cada fila
				System.out.println();
			}
		} else
			System.out.println("Ese número no es válido");
		// Se cierra escanner
		sc.close();
	}
}