package abundantee;

import java.util.Scanner;

public class Abundantee {

    public static void main(String[] args) {
   // Declaración de variables
        Scanner scanner = new Scanner(System.in);
        int limiteSuperior;
        int n1, divisor, sumaD;

        // Ingreso de Datos para el límite superior
        System.out.print("nngrese el valor del límite superior: ");
        limiteSuperior = scanner.nextInt();

        // Mostrar los números abundantes entre 0 y N
        System.out.println("números abundantes entre 0 y " + limiteSuperior + ": ");

        // Cálculos
        for (n1 = 0; n1 <= limiteSuperior; n1++) {
            sumaD = 0;

            for (divisor = 1; divisor <= n1 / 2; divisor++) {
                if (n1 % divisor == 0) {
                    sumaD += divisor;
                }
            }

            if (sumaD> n1) {
                System.out.println(n1);
            }
        }
    }

}
