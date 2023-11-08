package condicionales;

import java.util.Scanner;

/*
 * ENTRADA: 0 | RES. ESPERADO: "Número erroneo" | RES. OBTENIDO: "Número erroneo"
 * ENTRADA: 1 | RES. ESPERADO: "uno" | RES. OBTENIDO: "uno"
 * ENTRADA: 12 | RES. ESPERADO: "doce" | RES. OBTENIDO: "doce"
 * ENTRADA: 21 | RES. ESPERADO: "veintiuno" | RES. OBTENIDO: "veintiuno"
 * ENTRADA: 68 | RES. ESPERADO: "Sesenta y ocho" | RES. OBTENIDO: "Sesenta y ocho"
 * ENTRADA: 100 | RES. ESPERADO: "Número erroneo" | RES. OBTENIDO: "Número erroneo"
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

		// Instrucciones para calcualr el valor de la unidad y decenas que sera usado
		// despues en los switch
		unidad = num % 10;
		decenas = num / 10;

		// Lo utilizamos para saber el valor que le debemos de asignar a num Unid
		switch (unidad) {
		case 0:
			numUnid = "cero";
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

		// Lo utilizamos para saber las decenas de cada numero
		switch (decenas) {
		case 1:
			// Comprobamos si el número de la unidad es cero.
			if (numUnid == "cero") {
				// Lo utilizamos para saber el valor en este caso diez que le asigamos a numDec
				numDec = "Diez";
				// No le asignamos ningun valor al numUnid.
				numUnid = "";
				// Si no
			} else {
				// Le asignamos el valor dieci a numDec
				numDec = "Dieci";
				// Fin
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
				numDec = "Treinta y ";
				break;
			}

		case 4:
			if (numUnid == "cero") {
				numDec = "Cuarenta";
				numUnid = "";
			} else {
				numDec = "Cuarenta y ";
				break;
			}

		case 5:
			if (numUnid == "cero") {
				numDec = "Cincuenta";
				numUnid = "";
			} else {
				numDec = "Cincuenta y ";
				break;
			}

		case 6:
			if (numUnid == "cero") {
				numDec = "Sesenta";
				numUnid = "";
			} else {
				numDec = "Sesenta y ";
				break;
			}

		case 7:
			if (numUnid == "cero") {
				numDec = "Setenta";
				numUnid = "";
			} else {
				numDec = "Setenta y ";
				break;
			}

		case 8:
			if (numUnid == "cero") {
				numDec = "Ochenta";
				numUnid = "";
			} else {
				numDec = "Ochenta y ";
				break;
			}
		case 9:
			if (numUnid == "cero") {
				numDec = "Noventa";
				numUnid = "";
			} else {
				numDec = "Noventa y ";
				break;
			}
		}
		// Lo utilizamos para nombrar estos números con el valor de la variable num
		switch (num) {
		// Si se da este caso 11
		case 11:
			// El numDec vale once
			numDec = "Once";
			// El valor numUnid no vale nada
			numUnid = "";
			// Fin
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

		// Comprobamos si las decenas son diferentes a 1 y si numUnid es igual a uno.
		if (decenas != 1 && numUnid.equals("uno")) {
			// NumUnid vale uno
			numUnid = "uno";
		}

		// Comprobamos si el número es menor o igual que cero, o si el número es mayor a
		// 99
		if (num <= 0 || num > 99) {
			// Mostramos que el número es erroneo
			System.out.println("Número erroneo");
			// Si no
		} else {
			// Mostramos el resultado
			System.out.println("Número --> " + numDec + numUnid);
		}
		// Cierre
		sc.close();
	}

}
