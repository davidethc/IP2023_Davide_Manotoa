package numeroperfecto;

import java.util.Scanner;

public class NumeroPerfecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarar  variables 
        int n, i, t;
        //Ingresar datos
        System.out.println("Ingrese el valor de n");
        n = sc.nextInt();
        //calcular
        i = 1;
        t = 0;

        while (i < n) {
            if (n % i == 0) {

                t = t + i;
            }

            i++;
        }
        if (t != n) {
            System.out.println("El numero no es pefecto");
        } else {
            System.out.println("El numero si es pefecto");
        }

    }

}
