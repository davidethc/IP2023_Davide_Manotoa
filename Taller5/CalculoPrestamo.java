import java.util.Scanner;
public class CalculoPrestamo{
    public static void main (String []args ){
    Scanner sc = new Scanner (System.in);
        //Declaracion de variables 
        int plazo ;
        float monto , interes_anual,interes_mensual;
        float cuota_parcial,seguro_des,cuota_final;
        // ingresar datos 
        System.out.println("Ingrese el monto total del prestamo: " );
        monto = sc.nextInt();
        System.out.println("Ingrese plazo para pago de préstamo (en meses): ");
        plazo = sc.nextInt();
        System.out.println("Ingrese el % de la tasa de interés anual");
        interes_anual = sc.nextFloat();
        // validar plazo minimo 
        if (plazo < 3 ){
            System.out.println("Error, el plazo no puede ser inferior a 3");
        // validar plazo maximo
        }else if (plazo > 36 && monto < 20000){
            System.out.println("Error, el plazo no puede ser mayor a 36 en prestamos inferiores a USD 20000 ");
        }else{
            //calculo de la cuota 
             interes_mensual = interes_anual/12/100 ;
            cuota_parcial = monto * ((interes_mensual * (float)Math.pow((1 + interes_mensual), plazo))
            /(float) (Math.pow((1 + interes_mensual), plazo) - 1));
            seguro_des= cuota_parcial * (float)0.05 /100 ;
            cuota_final = cuota_parcial + seguro_des;
            System.out.println("LA CUOTA MENSUAL A PAGAR ASCIENDE A " + cuota_final);
        }











    }
}