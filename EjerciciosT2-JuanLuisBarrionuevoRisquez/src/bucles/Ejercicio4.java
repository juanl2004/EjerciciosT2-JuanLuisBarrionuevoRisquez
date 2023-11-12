package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ENTRADA.USUARIO: Primer número: -4| ENTRADA.ESPERADO: Te vuelve a pedir el primer número | RES. OBTENIDO: Te vuelve a pedir el primer número.
 * ENTRADA.USUARIO: Segundo número: -6| ENTRADA.ESPERADO: Te vuelve a pedir el segundo número | RES. OBTENIDO: Te vuelve a pedir el segundo número.
 * ENTRADA.USUARIO: Hola | ENTRADA.ESPERADO: El dato introducido no es correcto y te vuelve a pedir un número 
 * | RES. OBTENIDO: El dato introducido no es correcto y te vuelve a pedir un número.
 * ENTRADA.USUARIO: 24 y 36 | ENTRADA.ESPERADO: 12 | RES. OBTENIDO: 12
*/

public class Ejercicio4 {

	public static void main(String[] args) {
        
		//Declaramos las variables num1 y num2 que seran los números que le pediremos al usuario
		int num1 = -1, num2 = -1;
		
		// Declaramos la variable numM para guardar el número menor entre num1 y num2
		int numM;
        
		//Creamos el Scanner
        Scanner sc = new Scanner(System.in);

     // Utlizamos un try - catch y un bucle do-while para obtener un número positivo
     // del usuario, si no te pedira de nuevo que introduzcas un número.
        do {
			try {
				System.out.print("Ingrese el primer número positivo: ");
				num1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num1 < 0);
       
     // Utlizamos un try - catch y un bucle do-while para obtener un número positivo
     // del usuario, si no te pedira de nuevo que introduzcas un número.
        do {
			try {
				System.out.print("Ingrese el segundo número positivo: ");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (num2 < 0);
        
        //Se compara num1 y num2 para saber cuál es el número menor, y se asigna a numM.
		if (num1 < num2) {
			numM = num1;
		} else {
			numM = num2;
		}

		
		// Bucle for que comienza desde el valor de numM, compara si i es mayor o igual a 1 y disminuye.
		for (int i = numM; i >= 1; i--) {
			//Se comprueba si ambos num1 y num2 son divisibles por el valor actual del índice i. 
			if (num1 % i == 0 && num2 % i == 0) {
				// Si se cumple se imprime el M.C.D. 
				System.out.println("El M.C.D. es: " + i);
				//Se sale del bucle
				break;
			}
		}
        ///Cierre de Scanner    
        sc.close();
    
	}
}
