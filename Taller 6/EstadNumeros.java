package estadnumeros;

import java.util.Scanner;

public class EstadNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum, cn;
        System.out.println("Ingrese numeros positivos y negativos (para terminar digite 0):");
        num = 1;
        sum = 0;
        cn = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (num < 0) {
                cn = cn + 1;
            }
            sum = sum + num;
        }
        System.out.println("En total usted ingreso " + cn + " numeros negativos");
        System.out.println("La suma de los primeros numeros ingresados es " + sum);

    }

}
