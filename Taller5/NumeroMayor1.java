import java.util.Scanner;
public class NumeroMayor1{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        //declarar variables 
        int numero1, numero2, numero3;
        //ingresar datos
        System.out.println("Ingrese el primer numero ");
        numero1 = sc.nextInt();
         System.out.println("Ingrese el segundo numero ");
        numero2 = sc.nextInt();
         System.out.println("Ingrese el rercer numero ");
        numero3 = sc.nextInt();
        // calcular 
        if (numero1 < numero2 && numero2 < numero3){
            System.out.println("Numero 3 es mayor");
        }else if (numero2 < numero1 && numero3 < numero1) {
            System.out.println("Numero 1 es mayor");
        }else {
            System.out.println("Numero 2 es  mayor ");
        }

    }
}