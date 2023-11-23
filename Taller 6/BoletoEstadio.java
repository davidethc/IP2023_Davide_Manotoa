package boletoestadio;

import java.util.Scanner;

public class BoletoEstadio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declarar variables
        int Pa, Ti, Pr, G, n, d;
        String categoria, TipoBoleto;

        //ingresar datos
        System.out.println("Seleccione quien compra el boleto \n_________________________________\n(Niña´solo menores de 13 años´)\n(Niño solo menores de 13 años )\n(Mujer)\n(Hombre:D)");
        categoria = sc.nextLine();
        System.out.println("Seleccione el tipo de boleto q desea comprar");
        System.out.println("Palco=35$\nTribuna=25$\nPreferencia=20$\nGeneral=10$");
        TipoBoleto = sc.nextLine();
        n = 0;
        //ca=alcular
        switch (TipoBoleto) {
            case "Palco":
                n = 35;
                break;
            case "Tribuna":
                n = 25;
                break;
            case "Preferencia":
                n = 20;
                break;
            case "General":
                n = 6;
                break;
            default:
                System.out.println("Tipo de boleto no válido");
                break;
        }
        d = 0;
        if (categoria.equals("Niña")) {
            d = (int) (n - (n * 0.5));
            System.out.print(d);
        } else if (categoria.equals("Niño")) {
            d = (int) (n - (n * 0.4));
        } else if (categoria.equals("Mujer")) {
            d = (int) (n - (n * 0.25));
        } else if (categoria.equals("Hombre")) {
            d = n;
        } else {
            System.out.println("No puede comprar el boleto:p");
        }
        System.out.println("el precio de su buleto es de " + d + " $");

    }

}
