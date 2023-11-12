//Entrada=21dias 32km || R.Esperado= 80 || R.Obtenido= 80
//Entrada=10 dias 6000km || R.Esperado= 10500  || R.Obtenido= 10500
//Entrada=1dia 4km || R.Esperado= 10  || R.Obtenido= 10
package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
	//Iniciamos escaner
	Scanner sc = new Scanner(System.in);
	
	//Iniciamos variables y constantes
	int km,dia;
	final double PRECIO=2.5;
	double total;
	
	//Preguntamos los dias
	System.out.println("¿Cuántos días durará la estancia?");
	dia=sc.nextInt();
	
	//preguntamos los km hechos
	System.out.println("¿Cuántos km harás?");
	km=sc.nextInt();
	
	//Calculamos el precio
	total=(double)km*PRECIO;
	
	//Si se hacen 800km y 7 dias o mas hay u descuento
	if(km>800 && dia>7) {
		total=total-total*0.3;
	}
	//Resultado
	System.out.println("El precio final del billete es de: "+total);
	//Cerramos escaner
	sc.close();
}
}