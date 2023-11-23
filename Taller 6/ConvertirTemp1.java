

package convertirtemp1;
import java.util.Scanner;
public class ConvertirTemp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        double grados,temperaturaF;
        char unidad;
        // Ingresar datos 
        System.out.println("Grados");
        grados = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Unidad  Celcius(c) Fareheig(F)");
        unidad = sc.nextLine().charAt(0);
        
        // calcular 
        if (unidad == 'C' ){
           temperaturaF =(double) 9/5*grados+32;
           System.out.println("\nla temperatura en grados Farenheith es de "+ temperaturaF);
        }else if (unidad == 'F'){
            temperaturaF = (double)5/9 * (grados - 32);
             System.out.println("\nla temperatura en grados celcius es de "+ temperaturaF);
        }else{
             System.out.println("Unidad de salida incorrecta");
        }
        
        
        
        
        
        
        
        
   
    }
    
}
