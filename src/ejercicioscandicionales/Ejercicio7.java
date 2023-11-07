package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int seg,min,hora;
	
	System.out.println("¿Cuántos segundos tienes?");
	seg=sc.nextInt();
	
	System.out.println("¿Cuántos minutos tienes?");
	min=sc.nextInt();
	
	System.out.println("¿Cuántas horas tienes?");
	hora=sc.nextInt();
	
	if(seg>59||min>59||hora>24||seg<0||min<0||hora<0) {
		System.out.println("No has introducido valores validos");
		System.out.println("---------------------------------------");
		System.out.println("Segundos hasta 59");
		System.out.println("Minutos hasta 59");
		System.out.println("Horas hasta 24");
	}else {
	
	seg=seg+1;
	
	if(seg==60) {
		seg=0;
		min=min+1;
		
		if(min==60) {
			min=0;
			hora=hora+1;
			
			if(hora>23)
				hora=0;
		}
	}
	
	System.out.println("La hora con un segundo más es de: "+hora+":"+min+":"+seg);
	}
	sc.close();
}
}
