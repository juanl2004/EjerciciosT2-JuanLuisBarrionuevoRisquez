package condicionales;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la clase random
		Random random = new Random();

		// Declaramos la variable numero1 para guardar el valor generado por la máquina
		// entre 1 y 99.
		int numero1 = random.nextInt(99) + 1;
		// Declaramos la variable numero2 para guardar el valor generado por la máquina
		// entre 1 y 99.
		int numero2 = random.nextInt(99) + 1;
		// Variable para guardar el valor de la suma realizada por nosotros.
		int suma;
		// Variable para guardar el valor de la suma de los dos numeros aleatorios.
		int sumamaq;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le explicamos al usuario en que consiste el juego y le pedimos el resultado
		// de la suma de los dos numeros que le ha mostrado la máquina
		System.out.println("¡VAMOS A JUGAR!");
		System.out.println("Adivina la suma de estos dos números --> " + numero1 + " y " + numero2);
		System.out.println("¿Cual crees que es la suma? --> ");
		//Leemos el número del teclado
		suma = sc.nextInt();
		
		//Instrucciones para calcular la suma de los números aleatorios por parte de la máquina
		sumamaq = numero1 + numero2;

		//Si el resultado de la suma hecha por nosotros y el de la máquina coincide se mostrara "CORRECTA"
		if (suma == sumamaq) {
			System.out.println("Suma --> ¡CORRECTA!");

		} else { //Si no, se imprime "INCORRECTA"
			System.out.println("Suma --> ¡INCORRECTA!");
		}
		//Cierre Scanner
		sc.close();
	}

}
