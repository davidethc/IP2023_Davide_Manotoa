
package listacuadradoperfectoo;
import java.util.Scanner;

public class ListacuadradoPerfectoo {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       //declarar variables
       int i,a,b;
       //ingreso 
       System.out.println("Ingrese a ");
       a=sc.nextInt();
       System.out.println("ingrese b tiene q ser menor a b ");
       b=sc.nextInt();
       if (b==a || b<a ){
       System.out.println("ingrese b tiene q ser menor a b ");
        b=sc.nextInt();
       }
         // Imprimir cuadrados perfectos entre a y b
        System.out.println("Cuadrados perfectos entre " + a + " y " + b + ":");
        for ( i = a; i <= b; i++) {
            int raizCuadrada = (int) Math.sqrt(i);
            if (raizCuadrada * raizCuadrada == i) {
                System.out.print(i + " ");
            }
        }  
       
    }
    
}
