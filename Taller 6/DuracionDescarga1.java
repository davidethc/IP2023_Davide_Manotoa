
package duraciondescarga1;
import java.util.Scanner;
public class DuracionDescarga1 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     //declarar variable
     Float gb,GB,velocidad,velocidads,tiempot,s;
     int h,m,ss;
     
     // INGRESAR DATOS
     System.out.println("Ingrese el tamaño del arhivo a descargar en GB ");
     GB= sc.nextFloat();
     System.out.println("Ingrese la velocidad de su internet en Mbps");
     velocidad = sc.nextFloat();
     // CALCULAR 
     gb=GB *1024;// tamño mbits
     velocidads = velocidad / 8 ;//velocidad gibitsporsegundp
     s=gb/velocidads ;//tiempo solo en segundos
     if (gb > 0){
         //calcular segundos
         ss = (int)(s %60);
         System.out.println(ss+" segundos");
         //calcular minutos
         m = (int)((s % 3600 )/60);
         System.out.println(m+" minutos");
         //calcular horas
         h = (int)(s/3600);
         System.out.println(h+" horas");
     }else{
      System.out.println("No se demorara nada");
     }

    }
    
}
