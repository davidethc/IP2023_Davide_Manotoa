import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        
    }
}
