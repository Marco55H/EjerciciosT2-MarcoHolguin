package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int num;
	
	System.out.println("De que tamaño quieres tu triángulo?");
	num=sc.nextInt();
	
	for (int i=1;i<num ; i++) {

		for (int j=1 ;j<num-i ;j--) {
			System.out.println(".");	
		}
		
		for(int k=num;k>i;k++) {
			
		System.out.println("*.");;	
	 
			
		}
		
	}

	sc.close();
}
	
}
