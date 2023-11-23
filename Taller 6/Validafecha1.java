package validafecha1;

import java.util.Scanner;

public class Validafecha1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declarar variable
        int a;
        Byte m, d, dmax;// dmax para almacenar el numero de dias del mes ;
        // Ingreso de fecha
        System.out.println("Ingrese el año ");
        a = sc.nextInt();
        System.out.println("Ingrese el mes ");
        m = sc.nextByte();
        System.out.println("Ingrese el dia ");
        d = sc.nextByte();
        // Validar año mes
        if (a < 1970 || a > 2020 || m <= 0 || m > 12 || d < 1) {
            System.out.println("Fecha incorrecta");
        } else {
            dmax = 31;
            if (m == 2) {
                if (a % 4 == 0 & !(a % 100 == 0 & a % 400 != 0)) {
                    dmax = 29;
                } else {
                    dmax = 28;
                }
            } else {
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    dmax = 30;
                }
            }
            if (d > dmax) {
                System.out.print("Fecha incorrecta ");
            } else {
                System.out.println("Fecha Correcta");
            }
        }
    }
}
