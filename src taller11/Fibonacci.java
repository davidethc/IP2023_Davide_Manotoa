
package fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n para obtener el enésimo número de Fibonacci: ");
        int n = scanner.nextInt();

        // Llamada a la función recursiva para calcular el enésimo número de Fibonacci
        int resultado = fibonacci(n);

        System.out.println("El " + n + "-ésimo número de Fibonacci es: " + resultado);
    }

    // Función recursiva para calcular el enésimo número de Fibonacci
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            // Fn = Fn-2 + Fn-1
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
    
}
