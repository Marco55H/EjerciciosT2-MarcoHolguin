package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int km,dia;
	final double PRECIO=2.5;
	double total;
	
	System.out.println("¿Cuántos días durará la estancia?");
	dia=sc.nextInt();
	
	System.out.println("¿Cuántos km harás?");
	km=sc.nextInt();
	
	total=(double)km*PRECIO;
	
	if(km>800 && dia>7) {
		total=total-total*0.3;
	}
	System.out.println("El precio final del billete es de: "+total);
	sc.close();
}
}