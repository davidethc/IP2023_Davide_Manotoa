import java.util.Scanner;
public class ValidarOrden1{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        //declarar variables 
        int numero1, numero2, numero3;
        //ingresar datos
        System.out.println("Ingrese el primer entero ");
        numero1 = sc.nextInt();
         System.out.println("Ingrese el segundo entero ");
        numero2 = sc.nextInt();
         System.out.println("Ingrese el rercer entero ");
        numero3 = sc.nextInt();
        // calcular 
        if (numero1 < numero2 && numero2 < numero3){
            System.out.println("Los numeros estan en orden acendente ");
        }else {
            System.out.println("Los numero no estan en forma acendente");
        }

    }
}