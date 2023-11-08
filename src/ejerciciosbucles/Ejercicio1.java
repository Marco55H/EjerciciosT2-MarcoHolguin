package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, min, hora, extra, seg;
		
		try {

		System.out.println("¿Cuántos segundos tienes?");
		seg = sc.nextInt();

		System.out.println("¿Cuántos minutos tienes?");
		min = sc.nextInt();

		System.out.println("¿Cuántas horas tienes?");
		hora = sc.nextInt();

		System.out.println("¿Cuántas segundos extras quieres?");
		extra = sc.nextInt();

		if (seg > 59 || min > 59 || hora > 24 || seg < 0 || min < 0 || hora < 0) {
			System.out.println("No has introducido valores validos");
			System.out.println("---------------------------------------");
			System.out.println("Segundos hasta 59");
			System.out.println("Minutos hasta 59");
			System.out.println("Horas hasta 24");
		} else {

			//seg2 = seg + extra;
			for (i = 0; i < extra; i++) {
				seg=seg+1;
				if (seg >= 60) {
					seg = seg % 60;
					min = min + 1;

					if (min >= 60) {
						min = min % 60;
						hora = hora + 1;

						if (hora > 23) {
							hora = 0;
						} // cierra if3
					} // cierra if2
				} // cierra if1
			} // cierra for
			System.out.println("La hora con un segundo más es de: " + hora + ":" + min + ":" + seg);
		}
		}
		catch(InputMismatchException e){
			System.out.println("Error de tipo");
		}
		sc.close();
	}
}
