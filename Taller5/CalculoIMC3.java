import java.util.Scanner;
public class CalculoIMC3{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
              // Declaración de variables
              String nombre;
              int pesoKg;
              double estaturaM;
              double IMC;  // Índice de masa corporal
      
              // Ingreso de datos
              System.out.println("CÁLCULO DEL IMC");
              System.out.println("===============");
              System.out.println();
              System.out.print("Ingrese su nombre: ");
              nombre = sc.nextLine();
              System.out.print("Ingrese su peso en Kg: ");
              pesoKg = sc.nextInt();
              System.out.print("Ingrese su estatura en metros: ");
              estaturaM = sc.nextDouble();
      
              // Cálculo de IMC
              IMC = pesoKg / (estaturaM * estaturaM);
      
              // Muestra de resultados
              System.out.println("El IMC de " + nombre + " es igual a: " + IMC);
              System.out.println("Su categoria segun el resultadp");
               
              if(IMC < 18.49){
                System.out.println(" |---------------------|---------------------|");
                System.out.println(" | Menos de 18.49      | Infra Peso          |");
                System.out.println(" |---------------------|---------------------|");
            }else if (IMC >= 18.50 || IMC <=24.99 ){
                System.out.println(" |---------------------|---------------------|");
                System.out.println(" | 18.50 a 24.99       | Peso Normal         |");
                System.out.println(" |---------------------|---------------------|");
            }else if (IMC >= 25 || IMC <=29.99) {
                System.out.println(" |---------------------|---------------------|");
                System.out.println(" | 25 a 29.99          | Sobre Peso          |");
                System.out.println(" |---------------------|---------------------|");
            }else if (IMC >= 30 || IMC <= 34.99){
                 System.out.println(" |---------------------|---------------------|");
                 System.out.println(" | 30 a 34.99          | Obesidad leve       |");
                 System.out.println(" |---------------------|---------------------|");
            }else{
                 System.out.println(" |---------------------|---------------------|");
                 System.out.println(" | 35 a 39.99          | Obesidad Media      |");
                 System.out.println(" |---------------------|---------------------|");

            }
    

    }
}