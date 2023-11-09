package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int num;
		int numReves = 0;
		int auxiliar;
		int ultimaCifra;

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Quieres saber si el número introducido es capicua?");
		System.out.println("Introduce un número --> ");
		num = sc.nextInt();

		auxiliar = num;

		if (num < 0) {
			System.out.println("El número debe ser mayor o igual que 0.");
		} else {

			while (num != 0) {
				ultimaCifra = num % 10;
				numReves = numReves * 10 + ultimaCifra;
				num /= 10;

			}

			if (auxiliar == numReves) {
				System.out.println("El número introducido es capicúa.");
			} else {
				System.out.println("El número introducido no es capicúa.");
			}

		}
	}

}
