package validardivisor;

import java.util.Scanner;

public class ValidarDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarar variables 
        int n1, n2, T;
        //ingreso de datoss
        System.out.println("ingrese el primer #");
        n1 = sc.nextInt();
        System.out.println("ingrese el segundo #");
        n2 = sc.nextInt();
        if (n1 < n2) {
            T = n2 % n1;
            if (T == 0) {
                System.out.println(n1 + " Divisor del #");
            } else {
                System.out.println(" No es divisor del #" + n2);
            }
        } else {
            T = n1 % n2;
            if (T == 0) {
                System.out.println(n2 + " Divisor del #" + n1);
            } else {
                System.out.println(n2 + " No es divisor del # " + n1);
            }
        }

    }

}
