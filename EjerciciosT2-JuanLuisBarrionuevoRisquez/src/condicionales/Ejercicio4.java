package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: 0 | RES. ESPERADO: "El número debe estar entre 1 y 99." | RES. OBTENIDO: "El número debe estar entre 1 y 99."
 * ENTRADA: 1 | RES. ESPERADO: "uno" | RES. OBTENIDO: "uno"
 * ENTRADA: 12 | RES. ESPERADO: "doce" | RES. OBTENIDO: "doce"
 * ENTRADA: 68 | RES. ESPERADO: "doce" | RES. OBTENIDO: "doce"
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable para guardar el número introducido por el usuario.
		int num;
		int unidad;
		int decenas;
		String numUnid = "", numDec = "";

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número entre 1 y 99.
		System.out.println("Introduce un número entre 1 y 99");
		// Leemos el número del teclado
		num = sc.nextInt();

		// Comprobamos si el número está entre 1 y 99
		if (num >= 1 && num <= 99) {

			unidad = num % 10;
			decenas = num / 10;

			switch (unidad) {
			case 0:
				numUnid = "nueve";
				break;
			case 1:
				numUnid = "uno";
				break;
			case 2:
				numUnid = "dos";
				break;
			case 3:
				numUnid = "tres";
				break;
			case 4:
				numUnid = "cuatro";
				break;
			case 5:
				numUnid = "cinco";
				break;
			case 6:
				numUnid = "seis";
				break;
			case 7:
				numUnid = "siete";
				break;
			case 8:
				numUnid = "ocho";
				break;
			case 9:
				numUnid = "nueve";
				break;
			
			}

			switch (decenas) {
			case 1:
				if (numUnid == "cero") {
					numDec = "Diez";
					numUnid = "";
				} else {
					numDec = "Dieci";
					break;
				}

			case 2:
				if (numUnid == "cero") {
					numDec = "Veinte";
					numUnid = "";
				} else {
					numDec = "Veinti";
					break;
				}

			case 3:
				if (numUnid == "cero") {
					numDec = "Treinta";
					numUnid = "";
				} else {
					numDec = "Treinta y";
					break;
				}

			case 4:
				if (numUnid == "cero") {
					numDec = "Cuarenta";
					numUnid = "";
				} else {
					numDec = "Cuarenta y";
					break;
				}

			case 5:
				if (numUnid == "cero") {
					numDec = "Cincuenta";
					numUnid = "";
				} else {
					numDec = "Cincuenta y";
					break;
				}

			case 6:
				if (numUnid == "cero") {
					numDec = "Sesenta";
					numUnid = "";
				} else {
					numDec = "Sesenta y";
					break;
				}

			case 7:
				if (numUnid == "cero") {
					numDec = "Setenta";
					numUnid = "";
				} else {
					numDec = "Setenta y";
					break;
				}

			case 8:
				if (numUnid == "cero") {
					numDec = "Ochenta";
					numUnid = "";
				} else {
					numDec = "Ochenta y";
					break;
				}
			case 9:
				if (numUnid == "cero") {
					numDec = "Noventa";
					numUnid = "";
				} else {
					numDec = "Noventa y";
					break;
				}
			}

			switch (num) {
			case 11:
				numDec = "Once";
				numUnid = "";
				break;

			case 12:
				numDec = "Doce";
				numUnid = "";
				break;

			case 13:
				numDec = "Trece";
				numUnid = "";
				break;

			case 14:
				numDec = "Catorce";
				numUnid = "";
				break;

			case 15:
				numDec = "Quince";
				numUnid = "";
				break;
			}
if (num <= 0 || num > 99) {
	System.out.println("Número erroneo");
} else {
	System.out.println("Número --> " + numDec + numUnid);
}
			
			sc.close();
		}

	}

}
