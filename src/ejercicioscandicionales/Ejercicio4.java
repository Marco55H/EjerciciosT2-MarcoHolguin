package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, num1, num2;
		String part1 = "", part2 = "",cadena="";

		System.out.println("Introduce el número");
		num = sc.nextInt();

		if (num >= 1 && num < 100) {
			num2 = num % 10;
			num1 = num / 10;

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
				
				cadena=part1+part2;
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
				
			
			} else {
			System.out.println("El número no se encuentra en el rango");
		}
		System.out.println("El número es " +cadena);
		sc.close();
	}
}
