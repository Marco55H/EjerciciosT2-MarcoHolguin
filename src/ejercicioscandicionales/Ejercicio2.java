package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		int dni=0, resto=0;
		char letra = 'O';
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu número del DNI (8 cifras)");
		dni = sc.nextInt();

		if (dni > 9999999 && dni < 100000000) {
			resto = dni % 23;
			switch (resto) {
			case 0:
				letra = 'T';
				break;
			case 1:
				letra = 'R';
				break;
			case 2:
				letra = 'W';
				break;
			case 3:
				letra = 'A';
				break;
			case 4:
				letra = 'G';
				break;
			case 5:
				letra = 'M';
				break;
			case 6:
				letra = 'Y';
				break;
			case 7:
				letra = 'F';
				break;
			case 8:
				letra = 'P';
				break;
			case 9:
				letra = 'D';
				break;
			case 10:
				letra = 'X';
				break;
			case 11:
				letra = 'B';
				break;
			case 12:
				letra = 'N';
				break;
			case 13:
				letra = 'J';
				break;
			case 14:
				letra = 'Z';
				break;
			case 15:
				letra = 'S';
				break;
			case 16:
				letra = 'Q';
				break;
			case 17:
				letra = 'V';
				break;
			case 18:
				letra = 'H';
				break;
			case 19:
				letra = 'L';
				break;
			case 20:
				letra = 'C';
				break;
			case 21:
				letra = 'K';
				break;
			default:
				letra = 'E';

			}

		}
		System.out.println("La letra del DNI "+dni+" es "+letra);
sc.close();
	}
}