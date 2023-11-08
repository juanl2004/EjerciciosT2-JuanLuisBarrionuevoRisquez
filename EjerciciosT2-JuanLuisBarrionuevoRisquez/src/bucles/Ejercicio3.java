package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num;
		 
		Scanner sc = new Scanner(System.in);
       
		System.out.print("Introduce un número: ");
        num = sc.nextInt();
       
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
