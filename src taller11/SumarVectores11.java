
package sumarvectores11;
import java.util.Scanner;
public class SumarVectores11 {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el tamaño de los vectores
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = scanner.nextInt();

        // Crear los vectores A y B
        int[] A = new int[n];
        int[] B = new int[n];

        // Solicitar al usuario ingresar los elementos del vector A
        System.out.println("Ingrese los elementos del vector A:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Solicitar al usuario ingresar los elementos del vector B
        System.out.println("Ingrese los elementos del vector B:");
        for (int i = 0; i < n; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Llamar a la función para sumar los vectores
        int[] resultado = sumarVectores(A, B);

        // Imprimir el vector resultante
        System.out.println("Vector resultante de la suma:");
        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    // Función para sumar dos vectores
    public static int[] sumarVectores(int[] A, int[] B) {
        int n = A.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = A[i] + B[i];
        }

        return resultado;
    }
    
}
