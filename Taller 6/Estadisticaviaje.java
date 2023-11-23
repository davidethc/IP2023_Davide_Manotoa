package estadisticaviaje;

import java.util.Scanner;

public class Estadisticaviaje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarar variables
        float Tkm, h, g, r, v, l, m, s;
        //ingresar datos
        System.out.println("Ingrese el total de kilometros recorridos");
        Tkm = sc.nextFloat();
        System.out.println("Ingrese la duracion del viaje en horas");
        h = sc.nextFloat();
        System.out.println("Ingrese la cantidad de galones consumidos");
        g = sc.nextFloat();
        l = (float) (g * 3.785);
        m = (float) (Tkm * 1000);
        s = (float) (h * 3600);
        //clacular
        if (Tkm > 0) {
            //rendiemiento
            r = Tkm / l;
            v = m / s;
            System.out.println("El rendimiento del vehiculo es " + r + "km/lt" + " La velocidad del automovil " + v + "m/s");
        }

    }

}
