package contarcifras;

import java.util.Scanner;

public class ContarCifras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");

        int numero = scanner.nextInt();

        // Contar las cifras del número
        int cifras = 0;
        int numeroTemp = numero;

        while (numeroTemp > 0) {
            numeroTemp /= 10;
            cifras++;
        }

        // Mostrar el resultado
        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");

    }

}
