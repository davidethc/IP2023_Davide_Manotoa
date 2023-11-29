package venta2;

import java.util.Scanner;

public class Venta2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float resultado, total = 0;
        System.out.println("COMPRA DE ARTICULOS\n===================\nCuantos articulos desea comprar");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el precio del artículo: " + i + " ");
            resultado = sc.nextFloat();
            total = total + resultado;
        }
        total = total * (float) 1.12;
        System.out.println("El total a pagar incluido el IVA es: USD " + total);
    }
}
