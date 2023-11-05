package condicionales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Declaramos distancia para guardar la distancia recorrida por el tren. 
		double distancia;
		//Declaramos ndias para guardar el número de dias de estancia
		double ndias;
		//Declaramos el precioTotal para guardar el precio del billete
		double precioTotal;
		//Declaramos el precioDesc para guardar el precio del billete con el descuento aplicado.
		double precioDesc;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario la distacia recorrida y el número de dias
		System.out.println("¿Quieres calcular el precio de tu billete?");
		
		System.out.println("Introduce la distancia a recorrer en km --> ");
		distancia = sc.nextDouble();
		
		System.out.println("Introduce el número de dias --> ");
		ndias = sc.nextDouble();
		
		//Calculamos el precio total, multiplicando la distancia por el 2,5 (el precio por km)
		precioTotal = distancia * 2.5;
		
		//Comprobamos sii la distancia es mayor que 800 y el número de dias es mayor que 7
		if (distancia > 800 && ndias > 7) {
			//Calculamos el precio con el descuento del 30%, para ello multiplicamos 0,3 por el precio total
			precioDesc = 0.3 * precioTotal;
			//Mostramos el resultado con el descuento aplicado
			System.out.println("El precio con el descuento aplicado es de --> " + precioDesc + " euros");
		} else { //Si no 
			//Imprimimos el precio total sin descuento
			System.out.println("El precio de su billete es de --> " + precioTotal + " euros");
		}
		//Cierre Scanner
		sc.close();
	}

}