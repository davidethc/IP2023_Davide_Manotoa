import java.util.Scanner;
public class DiaMes1{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        //Declarar Variables 
        int mes;
        int dia = 0;
        
        //Interfaz
        System.out.println("Ingrese el mes");
        mes = sc.nextInt();
        //calcular
        if (mes == 1 || mes == 3 ||mes == 5 ||mes == 8 ||mes == 12 ){
            dia = 31;
        }else if (mes == 4 || mes ==6 || mes == 9 || mes ==11){
            dia = 30;
        }else if (mes == 2) {
            dia  = 29; 
        }else {
            System.out.println("fecha invalida");
        }
        System.out.println("Los dias del mes son "+ dia);
        

   
     
    }
}