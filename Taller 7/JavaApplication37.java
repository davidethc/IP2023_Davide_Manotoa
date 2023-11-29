package javaapplication37;
import java.util.Scanner;
public class JavaApplication37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ingresar variables
             //declar vaeriables 
        int num,suma,cn,cp,iu ;
        float pm,pmp;
        System.out.println("Ingrese números positivos y negativos para terminar diguite 0");
        num =1;
        suma=0;
        cn=0;
        cp=0;
        iu=0;
        pm=0;
        pmp=0;
        
        while (num !=0){

            num = sc.nextInt();
            if(num<0){
                cn=cn+1;
            }else if (num>0){
              cp=cp+1;
              pmp=(float)(pmp+cp);
              
            }
            if(num!=0){
             iu=iu+1;
             
            }
            
            
            
            
            suma = suma+num;
            pm = (float)suma/iu;
            pmp=(float)(pmp/iu);
  
        }
        System.out.println("En total usted ingreso "+cn+"numeros negativos");
        System.out.println("El promedio de los numeros ingresados es"+pm);
        System.out.println("En total usted ingreso "+cp+" numeros positivos");
       System.out.println("En total usted ingreso "+iu+" numeros ");
      System.out.println("El promedio de los  numeros positivos es "+pm);
    }
       
    
}
