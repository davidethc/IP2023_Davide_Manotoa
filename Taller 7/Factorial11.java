
package factorial11;
import java.util.Scanner;
public class Factorial11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // declarar variables
        int n,resultado,total;
        //Ingreso de datos
        System.out.println("Ingrese el valor de n");
        n = sc.nextShort();
        total = 1;
        //calcular
        for (int i=1;i<n;i++){
            resultado=(n-i);
            total=(total*resultado);
        }
        
        System.out.println("El Factorial de "+n+" es "+(n*total));
       
    }
    
}
