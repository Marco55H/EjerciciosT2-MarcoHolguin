//Entrada=21 || R.Esperado= 21  || R.Obtenido= 21
//Entrada=2 || R.Esperado= 2  || R.Obtenido= 2
//Entrada=-1 || R.Esperado= 1  || R.Obtenido= 1
package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
//Iniciamos escaner 
		Scanner sc = new Scanner(System.in);
		//Inciamos variables
		int num, resp;

		//Pedimos el número
		System.out.println("Introduce el número para obtener su valor absoluto");
		num = sc.nextInt();

		//Si el número es negativo multiplicamos por -1
		resp = (num > 0) ? num : -num;

		//Resultado
		System.out.println("El valor absoluto de tu número es: " + resp);

		//Cerramos escaner
		sc.close();
	}
}