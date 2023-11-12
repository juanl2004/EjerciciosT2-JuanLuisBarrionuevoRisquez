package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: -4 | ENTRADA.ESPERADO: Te vuelve a pedir un número | RES. OBTENIDO: Te vuelve a pedir un número.
 * ENTRADA.USUARIO: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA.USUARIO: 8 | ENTRADA.ESPERADO:  *  | RES. OBTENIDO: *
									      * *       		  * * 
									     * * *   			 * * *
									    * * * *    		    * * * *
									   * * * * * 		   * * * * *
									  * * * * * *  		  * * * * * *
									 * * * * * * *  	 * * * * * * *
									* * * * * * * *     * * * * * * * * 									
*/

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos la variable num para guardar el número introducido por el usuario
		int num = -1;
		 
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
       
		// Utlizamos un try - catch y un bucle do-while para obtener un número positivo
		// del usuario, si no te pedira de nuevo que introduzcas un número.
		do {
			try {
				System.out.print("Introduce un número: ");
				num = sc.nextInt();
			} catch (Exception e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num < 0);
	   
		//Bucle para imprimir un triangulo de asteriscos
        for (int i = 1; i <= num; i++) {
        	//Utilizamos este for para crear espacios en blanco antes de los asteriscos
        	for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Bucle for para imprimir los asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            //Salto de linea para saltarse a otra linea despues de imprimir una
            System.out.println();
        }
    }
}
