
package calculadora_1;

import java.util.Scanner;
public class Calculadora_1 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //declarar variables
        int n1, n2, operador, d;
        //ingreasar datos
        System.out.println("Ingrese el primer numero a operar ");
        n1 = sc.nextInt();
        System.out.println("Ingrese que operacion desearia realizar\nPresione 1 para  (sumar)\nPresione 2 para   (restar)\nPresione 3 para  (multiplicar)\nPresione 4 para  (dividir) ");
        operador = sc.nextInt();
        System.out.println("Ingrese el segundo numero a operar ");
        n2 = sc.nextInt();

        //calcular
        d = 0;
        switch (operador) {
            case 1:
                d = n1 + n2;
                System.out.println("operar\n" + n1 + " + " + n2 + " = " + d);
                break;
            case 2:
                d = n1 - n2;
                System.out.println("operar\n" + n1 + " - " + n2 + " = " + d);
                break;
            case 3:
                d = n1 * n2;
                System.out.println("operar\n" + n1 + " * " + n2 + " = " + d);
                break;
            case 4:
                d =(n1 / n2);
                System.out.println("operar\n" + n1 + " / " + n2 + " = " + d);
                break;
        }
       
    }
    
}
