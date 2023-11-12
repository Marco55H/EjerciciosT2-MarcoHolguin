//Entrada=15 12 3 17 0 || R.Esperado=2 fallos 4 numeros  || R.Obtenido= 2 fallos 4 numeros
//Entrada=0 || R.Esperado=  0 fallos 0 numeros || R.Obtenido= 0 fallos 0 numeros
//Entrada=12 14 15 || R.Esperado= 0 fallos 3 numeros || R.Obtenido= 0 fallos 3 numeros
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		// Iniciamos el ecaner
		Scanner sc = new Scanner(System.in);
		// se inician las variables
		int num = 0, num2 = 1, fallo = 0, cantnum = 1;

		// Bucle do-while para asegurar que se ingrese un número valido
		try {

			do {
				// Pedimos el número
				System.out.println("Introduce un número inicial");
				num = sc.nextInt();
			} while (num > 999 && num < -999);
			// Si ocurre la excepción, mensaje de error
		} catch (InputMismatchException e) {
			System.out.println("Error de tipo");
		}

		// un while para cuando las variables sean 0 se salga del bucle
		while (num2 != 0 && num != 0) {
			// Sumamos 1 a la cantidad de numeros
			cantnum++;
			// Pedimos otro numero
			System.out.println("Introduce otro número");
			num2 = sc.nextInt();

			// Si el numero nuevo em mayor, el número anterior es sustiuido
			if (num <= num2) {
				num = num2;
			}
			//Si el número es menor ocurre un fallo y sumanos +1 a la cantidad de fallos
			else {
				fallo++;
				System.out.println("Fallo tipo menor");

			}

		}
		// Cuando se sale del bucle imprimimos el resultado
		System.out.println("Has tenido " + fallo + " fallos y has introducido " + (cantnum - 1) + " números");
		sc.close();
	}

}
