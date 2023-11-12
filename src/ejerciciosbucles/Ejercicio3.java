//Entrada=0 || R.Esperado=  || R.Obtenido= 
//Entrada=3 || R.Esperado=   *    || R.Obtenido= 3  *
						//	* *                    * *
					    // * * *                  * * *
//Entrada=1 || R.Esperado= * || R.Obtenido= *
package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
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

        // Se cierra escanner
        sc.close();
    }
}