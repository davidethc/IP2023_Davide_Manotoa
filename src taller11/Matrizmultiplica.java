
package matrizmultiplica;
import java.util.Scanner;
public class Matrizmultiplica {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        int[][] matrizOriginal = new int[m][n];

        System.out.println("Ingrese la matriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el elemento en la posición (" + (i + 1) + ", " + (j + 1) + "): ");
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Ingrese el número entero con el que desea multiplicar la matriz: ");
        int multiplicador = scanner.nextInt();

        int[][] matrizResultante = multiplicarMatrizPorEntero(matrizOriginal, multiplicador);

        System.out.println("\nMatriz Original:");
        mostrarMatriz(matrizOriginal);

        System.out.println("\nMatriz Resultante después de multiplicar por " + multiplicador + ":");
        mostrarMatriz(matrizResultante);
    }

    public static int[][] multiplicarMatrizPorEntero(int[][] matriz, int multiplicador) {
        int m = matriz.length;
        int n = matriz[0].length;

        int[][] matrizResultante = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizResultante[i][j] = matriz[i][j] * multiplicador;
            }
        }

        return matrizResultante;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
    
}
