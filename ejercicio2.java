/**
 * @author Abigail Acosta
 */
package practica02;

import java.util.Scanner;

public class ejercicio2 {


public static void main (String [] args) {
    //variables
    Scanner scanner = new Scanner(System.in);
    int num1, num2;
    //entrada
    System.out.print("Digite primer número: ");
    num1 = scanner.nextInt();
    System.out.print("Digite segundo número: ");
    num2 = scanner.nextInt();
    //procesos
    if (num1>num2) {
         System.out.print("Primer número es mayor");
    } else if(num2>num1) {
        System.out.print("Segundo número es mayor");
    }else {
        System.out.print("¡Son iguales!");
    }
    scanner.close();
    }

}
    

