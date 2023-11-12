//Entrada=21 || R.Esperado= veintiuno  || R.Obtenido= veintiuno
//Entrada=2 || R.Esperado= dos  || R.Obtenido= dos
//Entrada=15 || R.Esperado= quince  || R.Obtenido= quince
package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		//Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		//Iniciamos variables
		int num, num1, num2;
		String part1 = "", part2 = "",cadena="";
		//pedimos el número
		System.out.println("Introduce el número");
		num = sc.nextInt();

		//El número tiene que estar entre 0 y 100
		if (num >= 1 && num < 100) {
			//Dividimos el número en sus dos cifras
			num2 = num % 10;
			num1 = num / 10;

			//switch según la 1 cifa
			switch (num1) {

			case 1:
				part1 = "dieci";
				break;

			case 2:
				part1 = "veinti";
				break;
			case 3:
				part1 = "treinta y ";
				break;
			case 4:
				part1 = "cuarenta y ";
				break;
			case 5:
				part1 = "cincuenta y ";
				break;
			case 6:
				part1 = "sesenta y ";
				break;
			case 7:
				part1 = "setenta y ";
				break;
			case 8:
				part1 = "ochenta y ";
				break;
			case 9:
				part1 = "noventa y ";
				break;
				
			}
				//switch según la 2 cifra
				switch (num2) {

				case 1:
					part2 = "uno";
					break;
				case 2:
					part2 = "dos";

				case 3:
					part2 = "tres";
					break;
				case 4:
					part2 = "cuatro";
					break;
				case 5:
					part2 = "cinco";
					break;
				case 6:
					part2 = "seis";
					break;
				case 7:
					part2 = "siete";
					break;
				case 8:
					part2 = "ocho";
					break;
				case 9:
					part2 = "nueve";
					break;
			}
				//Unimos las dos partes
				cadena=part1+part2;
				//Casos raros
				switch (num) {

				case 10:
					cadena = "diez";
					break;
				case 11:
					cadena = "once";

				case 12:
					cadena = "doce";
					break;
				case 13:
					cadena = "trece";
					break;
				case 14:
					cadena = "catorce";
					break;
				case 15:
					cadena = "quince";
					break;
				case 20:
					cadena = "veinte";
					break;
				case 30:
					cadena = "treinta";
					break;
				case 40:
					cadena = "cuarenta";
					break;
				case 50:
					cadena = "cincuenta";
					break;
				case 60:
					cadena = "sesenta";
					break;
				case 70:
					cadena = "setenta";
					break;
				case 80:
					cadena = "ochenta";
					break;
				case 90:
					cadena = "noventa";
					break;

				}
				
			//Si el numero no esta entre el 0 y el 100
			} else {
			System.out.println("El número no se encuentra en el rango");
		}
		//Resultado
		System.out.println("El número es " +cadena);
		//Cerramos escaner
		sc.close();
	}
}
