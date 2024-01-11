
package sumadigitosrecursivo;
import java.util.Scanner;
public class Sumadigitosrecursivo {

    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Calcular la suma de los dígitos utilizando la función recursiva
        int sumaDigitos = sumaDigitosRecursiva(numero);

        //RESULTADO
        System.out.println("La suma de los dígitos es: " + sumaDigitos);
    }

    // Función recursivaaaaaa
    public static int sumaDigitosRecursiva(int numero) {

        if (numero <= 0) {
            return 0;
        }

        return (numero % 10) + sumaDigitosRecursiva(numero / 10);
    }
    
}
