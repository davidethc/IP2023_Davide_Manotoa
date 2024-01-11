package serieprimo;

import java.util.Scanner;

public class SeriePrimo {

    public static boolean primo(int num) {
        boolean esprimo = false;
        int c;
        if (num >= 2) {
            c = num - 1;
            while (num % c != 0) {
                c = c - 1;
            }
            if (c == 1) {
                esprimo = true;
            }
        }
        return esprimo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantida de primos ");
        int n = sc.nextInt();
        int c = 0;
        int i = 3;
       int ultimoPrimo = 2; // Iniciar con el primer primo

        while (c < n) {
            if (primo(i)) {
                int diferencia = i - ultimoPrimo;
                System.out.println(diferencia);
                c++;
                ultimoPrimo = i;
            }
            i++;

        }

    }

}
