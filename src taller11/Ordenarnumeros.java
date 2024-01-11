
package ordenarnumeros;
import java.util.Scanner;
public class Ordenarnumeros {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         // Solicitar al usuario ingresar la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        // Crear un array para almacenar los números ingresados
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Llamar a la función para ordenar los números
        ordenarNumeros(numeros);
        System.out.println("Números ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
    // Función para ordenar un array de números de menor a mayor BURBUJAAA
    public static void ordenarNumeros(int[] numeros) {
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
             
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
    
}
