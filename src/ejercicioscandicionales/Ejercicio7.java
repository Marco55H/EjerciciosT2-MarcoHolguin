//Entrada=21h 32min 5seg || R.Esperado= 21h 32min 6seg  || R.Obtenido= 21h 32min 6seg
//Entrada=2h 23min 59seg || R.Esperado= 2h 24min 00seg  || R.Obtenido= 2h 24min 00seg
//Entrada=15h 59min 59 seg || R.Esperado= 16h 0min 0seg  || R.Obtenido= 16h 0min 0seg
package ejercicioscandicionales;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	//Iniciamos escaner
	Scanner sc=new Scanner(System.in);
	
	//Iniciamos variables
	int seg,min,hora;
	
	//Preguntamos segundos
	System.out.println("¿Cuántos segundos tienes?");
	seg=sc.nextInt();
	
	//Preguntamos minutos
	System.out.println("¿Cuántos minutos tienes?");
	min=sc.nextInt();
	
	//Preguntamos horas
	System.out.println("¿Cuántas horas tienes?");
	hora=sc.nextInt();
	
	//Ponemos unos rangos
	if(seg>59||min>59||hora>24||seg<0||min<0||hora<0) {
		System.out.println("No has introducido valores validos");
		System.out.println("---------------------------------------");
		System.out.println("Segundos hasta 59");
		System.out.println("Minutos hasta 59");
		System.out.println("Horas hasta 24");
		//sI se cumplen
	}else {
	//Sumamos un segundo
	seg=seg+1;
	
	//Si seg llega a 60 se suma un minuto
	if(seg==60) {
		seg=0;
		min=min+1;
		
		//Si llega a 60 min se suma 1 hora
		if(min==60) {
			min=0;
			hora=hora+1;
			 //Si  llega a 24 horas se resetean las horas
			if(hora>23)
				hora=0;
		}
	}
	//Resultado
	System.out.println("La hora con un segundo más es de: "+hora+":"+min+":"+seg);
	}
	sc.close();
}
}
