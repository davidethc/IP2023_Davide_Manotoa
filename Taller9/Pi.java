
package pi;
import java.util.Scanner;
public class Pi {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         // Declaracion de variables
        int n, c;
        double pi, elemento ,i ;
        System.out.print("Ingrese la cantidad n para obtener Pi: ");
        n = sc.nextInt();
     
         pi = 3;
         c = 1;
        for(i = 2; c < n; i = i + 2){
            elemento = (double)4 / (i * (i + 1) * (i + 2));
            if ((c + 1) % 2 != 0){
            elemento = elemento * (-1);
            }
            pi = pi + elemento;
            c = c+1;
        }

        System.out.println("El valor de Pi obtenido: "+pi);
    }
    
}
