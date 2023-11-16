import java.util.Scanner;
public class Bisiesto1{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        // declarar variables
        int año;
        //  Ingreso de datos 
        System.out.println("Ingrese el año");
            año = sc.nextInt();
        // Calcular
        if (año % 4 == 0 && año % 100!=0 || año % 400 == 0 ){
            System.out.println("El año ingresado es bisiesto");
        } else{
            System.out.println("El año ingresado no es bisiesto");
        }



    }
}