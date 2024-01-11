
package invertirvector;
import java.util.Scanner;
public class InvertirVector {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n, i;

        System.out.print("Ingrese la cantidad de números que va a ingresar: ");
        n = sc.nextInt();
        int[] lista = new int[n];

        // Ingresar elementos al vector
        System.out.println("Ingrese los elementos del vector:");
        for (i = 0; i < n; i++) {
            lista[i] = sc.nextInt();
        }

        // Invertir el vector
        System.out.println("Vector invertido:");
        for (i = n - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }
       
    }
    
}
