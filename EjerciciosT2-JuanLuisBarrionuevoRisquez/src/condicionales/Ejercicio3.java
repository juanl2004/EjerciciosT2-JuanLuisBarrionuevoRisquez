package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		double comidaCompr;
		double numAnimales;
		double kilos;
		double racion;
		Scanner sc = new Scanner(System.in);

		System.out.println("Cantidad de comida comprada -->");
		comidaCompr = sc.nextDouble();

		System.out.println("Número de animales que alimentar -->");
		numAnimales = sc.nextDouble();

		System.out.println("Kilos de comida que comen en total -->");
		kilos = sc.nextDouble();

		if (numAnimales == 0) {
			System.out.println("No hay animales a los que alimentar");

		} else {
			if (comidaCompr >= kilos) {
				System.out.println("Dispone de alimento suficiente");

			} else {
				racion = comidaCompr / numAnimales;
				System.out.print("¡¡No hay comida suficiete!! --> ");
				System.out.println("A cada animal le corresponde: " + racion + " kilos");
			}
		}
		
		sc.close();
		
	}
}
