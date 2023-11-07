package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: 
 * 			Comida comprada: 900
 * 			Número de animales: 12
 * 			Kg que comen en total: 750 | 
 * 			RES. ESPERADO: "Disponen de alimento suficiente" | 
 * 			RES. OBTENIDO: "Disponen de alimento suficiente"
 *
 *			Comida comprada: 900
 * 			Número de animales: 12
 * 			Kg que comen en total: 1000 | 
 * 			RES. ESPERADO: "¡¡No hay comida suficiete!! --> A cada animal le corresponde: 75.0 kilos" | 
 * 			RES. OBTENIDO: "¡¡No hay comida suficiete!! --> A cada animal le corresponde: 75.0 kilos"
 * 
 * 			Comida comprada: 900
 * 			Número de animales: 0
 * 			Kg que comen en total: 0 | 
 * 			RES. ESPERADO: "No hay animales a los que alimentar" | 
 * 			RES. OBTENIDO: "No hay animales a los que alimentar"
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		double comidaCompr;
		double numAnimales;
		double kilos;
		float racion;
		Scanner sc = new Scanner(System.in);

		System.out.println("Cantidad de comida comprada -->");
		comidaCompr = sc.nextDouble();

		System.out.println("Número de animales que alimentar -->");
		numAnimales = sc.nextDouble();

		System.out.println("Kilos de comida que comen en total -->");
		kilos = sc.nextDouble();

		if (numAnimales <= 0) {
			System.out.println("No hay animales a los que alimentar");

		} else {
			if (comidaCompr >= kilos) {
				System.out.println("Disponen de alimento suficiente");

			} else {
				racion = (float) (comidaCompr / numAnimales);
				System.out.print("¡¡No hay comida suficiete!! --> ");
				System.out.println("A cada animal le corresponde: " + racion + " kilos");
			}
		}
		
		sc.close();
		
	}
}
