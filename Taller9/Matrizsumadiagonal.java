package matrizsumadiagonal;

import java.util.Scanner;

public class Matrizsumadiagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada (n x n): ");
        int n ;
       n = scanner.nextInt();
               
        // Declarar e inicializar la matriz
        int[][] matriz = new int[n][n];

        // Leer la matriz desde el usuario
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular la suma de los elementos por encima de la diagonal principal
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("\nLa suma de los elementos por encima de la diagonal principal es: " + suma);

       
    }
}
