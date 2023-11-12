//Entrada=5+89= 94 || R.Esperado= Acierto || R.Obtenido= Acierto
//Entrada=2+7=10 || R.Esperado= FAllo  || R.Obtenido= Fallo
//Entrada=15+1=16 || R.Esperado= Acierto  || R.Obtenido= Acierto
package ejercicioscandicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		//numerorandom
		Random r = new Random();
        //Iniciamos variables
		int sum1, sum2;
		int num1 = r.nextInt(0, 100);
		int num2 = r.nextInt(0, 100);

		//Preguntamos la suma de los dos números aleatorios
		System.out.println("Los números son: " + num1 + " y " + num2 + " ¿Cuál es la suma de los números?");
		sum2 = sc.nextInt();

		sum1 = num1 + num2;

		//Si aciertas
		if (sum1 == sum2) {
			System.out.println("Acertaste!!!");
			//si fallas
		} else {
			System.out.println("Fallaste");
		}
		sc.close();
	}

}
