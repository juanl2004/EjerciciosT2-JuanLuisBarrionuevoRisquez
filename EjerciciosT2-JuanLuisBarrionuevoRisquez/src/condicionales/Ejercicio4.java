package condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variable para guardar el número introducido por el usuario.
		int num;

		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que introduzca un número entre 1 y 99.
		System.out.println("Introduce un número entre 1 y 99");
		//Leemos el número del teclado
		num = sc.nextInt();
		
		//Declaramos las siguientes variables como string para representar los números con palabras.
		String[] unid = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
		String[] espc = { "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete","dieciocho", "diecinueve" };
		String[] dec = { "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta","noventa" };

		//Comprobamos si el número está entre 1 y 99
		if (num >= 1 && num <= 99) {
			
			// Si el número es menor que 10, se imprime el número correspondiente a la unidad.
			if (num < 10) {
				System.out.println(unid[num]);
			
			// Si el número es mayor o igual que diez y menor 20, imprime el nombre correspondiente a la espc.
			} else if (num < 20 && num >= 10) {
				System.out.println(espc[num - 10]);
			
			// Si el número es mayor o igual a 20.
			} else {
				// Calcula las unidades haciendo el modulo del número entre 10.
				int unidad = num % 10;
				// Calcula las decenas haciendo la división del número entre 10
				int decena = num / 10;
				
				// Si las unidades son 0, solo se imprime el resultado de las decenas
				if (unidad == 0) {
					System.out.println(dec[decena]);
				// Si no, se imprime las decenas y seguidamente las unidades. 
				} else {
					System.out.println(dec[unidad] + " y " + unid[unidad]);
				}
			}
		// Si el número está fuera del rango de 1 a 99, imprime un mensaje de error.
		} else {
			System.out.println("El número debe estar entre 1 y 99.");
		}
		//Cierre de Scanner
		sc.close();
	}

}
