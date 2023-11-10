package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num=0;

	        try {
	        System.out.print("Ingresa un número para la base y altura del triángulo: ");     
	       
	 num = sc.nextInt();
	        }
	        catch (InputMismatchException e){
	        	System.out.println("Error de tipo introducido");
	        }

	        for (int i = 1; i <= num; i++) {
	            // Espacios en blanco antes de los asteriscos
	            for (int j = 1; j <= num - i; j++) {
	                System.out.print(" ");
	            }

	            // Asteriscos
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }

	            // Cambiar de línea después de cada fila
	            System.out.println();
	        }

	        sc.close();
	    }
}