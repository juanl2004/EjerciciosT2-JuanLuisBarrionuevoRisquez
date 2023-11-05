package condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos esta variable para guardar el número introducido por el usuario
		int num;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba un número
		System.out.println("Escribe un número --> ");
		//Leemos el número del teclado
		num = sc.nextInt();
		
		//Utilizamos un operador ternario para cuando el valor intrucido sea negatigo o no el resultado sea positivo.
		num = num >= 0 ? num : -num ;
		
		//Imprimimos el resutado
		System.out.println("El valor absoluto es: " + num);
		
		//Cierre del Scanner
		sc.close();
	}
}
