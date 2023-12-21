
package decimalabinario1;
import java.util.Scanner;
public class DecimalABinario1 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int numero,residuo;
     String binario;
        // Solicitar al usuario un número entero positivo
        System.out.print("Introduce un número entero positivo: ");
         numero = scanner.nextInt();
         residuo=0;
        while (numero <= 0) {
            System.out.print("Por favor, ingresa un número entero positivo: ");
            numero = scanner.nextInt();
        }

        // Convertir a binario
     binario = " ";
        while (numero > 0) {
                   residuo = numero % 2;
                           numero /= 2;
         
            binario = residuo + binario;
      
                 // Mostrar el resultado
        }
 System.out.println("El número representado en el sistema binario es " + binario);


        
    }
    
}
