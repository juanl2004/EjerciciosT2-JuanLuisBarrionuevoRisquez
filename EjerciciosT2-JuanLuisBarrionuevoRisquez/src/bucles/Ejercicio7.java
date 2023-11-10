package bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número --> ");
		num = sc.nextInt();
		
		for (int fila = 1; fila <= num; fila++) {
			 
			 for (int columna = 1; columna <= fila; columna++) {
				 System.out.print(columna);
			 }
			 
			 for (int columna = fila - 1; columna >= 1; columna--) {
				 System.out.print(columna);
			 }
			System.out.println(""); 
		 }

	}

}
