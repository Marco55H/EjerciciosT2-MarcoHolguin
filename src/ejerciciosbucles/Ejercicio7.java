//Entrada=1 || R.Esperado= 1 || R.Obtenido= 1
//Entrada=3 || R.Esperado= 1 121 12321 || R.Obtenido= 1 121 12321
//Entrada=0 || R.Esperado=  || R.Obtenido= 
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	 public static void main(String[] args) {
	        // Se crea escanner 
	        Scanner sc = new Scanner(System.in);
	        
	        // Se declara e inicializa la variable para almacenar el número ingresado por el usuario
	        int num = 0;

	        try {
	        	
	        	
	            // Se solicita al usuario que ingrese un número para la base y altura del triángulo
	            System.out.print("Ingresa un número para la base y altura del triángulo: ");
	            
	            // Se lee el número ingresado por el usuario
	            num = sc.nextInt();
	        	
	        	
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción de tipo InputMismatchException, se captura y se imprime un mensaje de error
	            System.out.println("Error: Debes ingresar un número entero.");
	        }
	        
	

	        // Bucle externo para controlar las filas del triángulo
	        for (int i = 1; i <= num; i++) {


	            // Número que se va sumando
	            for (int k = 1; k <= i-1; k++) {
	                System.out.print(k);
	            }

	            // Número que se va restando
	            for (int k = i; 1 <= k; k--) {
	                System.out.print(k);
	            }
	            
	            // Cambiar de línea después de cada fila
	            System.out.println();
	        }

	        // Se cierra escanner
	        sc.close();
	    }
}
