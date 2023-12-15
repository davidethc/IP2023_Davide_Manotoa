package calculoedadmesesaños;

import java.util.Scanner;

public class CalculoEdadMesesAños {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
        // Declarar variables
        int dia, mes, año, d1, m1, a1;
        
        // Ingreso de datos
        System.out.println("Fecha de nacimiento");
        System.out.println("Día");
        dia = sc.nextInt();
        System.out.println("Mes");
        mes = sc.nextInt();
        System.out.println("Año");
        año = sc.nextInt();
        
        System.out.println("Fecha actual");
        System.out.println("Día");
        d1 = sc.nextInt();
        System.out.println("Mes");
        m1 = sc.nextInt();
        System.out.println("Año");
        a1 = sc.nextInt();
        
        // Calcular
        int edadAños, edadMeses, edadDias;

        if (año > a1 || d1>30||dia>30||mes>12||m1>12) {
            System.out.println("Datos incorrectos");
        } else {
            edadAños = a1 - año;
            edadMeses = m1 - mes;
            edadDias = d1 - dia;

            if (edadDias < 0) {
                edadMeses--;
                // Actualizar edadDias al valor correcto
                edadDias += 30;
            }

            if (edadMeses < 0) {
                edadAños--;
                edadMeses += 12;
            }

            System.out.println("Edad exacta es " + edadAños + " años, " + edadMeses + " meses, " + edadDias + " días");
        }
        
            
        
    }

}
