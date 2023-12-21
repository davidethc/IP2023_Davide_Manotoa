package ventafacturar;

import java.util.Scanner;

public class Ventafacturar {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        short cant1, cant2, cant3;
        String nombre1, nombre2, nombre3;
        float precio1, precio2, precio3, subt;
        
        System.out.println("Ingrese el nombre del producto");
        nombre1 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto");
        cant1 = sc.nextShort();
        sc.nextLine(); // Consumir el retorno de carro pendiente
        System.out.println("Ingrese el precio del producto");
        precio1 = sc.nextFloat();
        sc.nextLine(); // Consumir el retorno de carro pendiente
        
        System.out.println("Ingrese el nombre del producto");
        nombre2 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto");
        cant2 = sc.nextShort();
        sc.nextLine(); // Consumir el retorno de carro pendiente
        System.out.println("Ingrese el precio del producto");
        precio2 = sc.nextFloat();
        sc.nextLine(); // Consumir el retorno de carro pendiente
        
        System.out.println("Ingrese el nombre del producto");
        nombre3 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto");
        cant3 = sc.nextShort();
        sc.nextLine(); // Consumir el retorno de carro pendiente
        System.out.println("Ingrese el precio del producto");
        precio3 = sc.nextFloat();
        
        subt = cant1 * precio1 + cant2 * precio2 + cant3 * precio3;

        System.out.println("FACTURA DE COMPRAS");
        System.out.println("------------------\n");

        System.out.println("+----------+--------------------------+-----------------+--------------+");
        System.out.println("| Cantidad | Item                     | Precio Unitario | Precio Total |");
        System.out.println("+----------+--------------------------+-----------------+--------------+");
        System.out.printf("| %5d    | %-24s | %,15.2f | %,12.2f |%n", cant1, nombre1, precio1, cant1 * precio1);
        System.out.printf("| %5d    | %-24s | %,15.2f | %,12.2f |%n", cant2, nombre2, precio2, cant2 * precio2);
        System.out.printf("| %5d    | %-24s | %,15.2f | %,12.2f |%n", cant3, nombre3, precio3, cant3 * precio3);
        System.out.println("+----------+--------------------------+-----------------+--------------+");
        System.out.printf("|%37s| %15s | %,12.2f |%n", "", "Subtotal", subt);
        System.out.printf("|%37s| %15s | %,12.2f |%n", "", "IVA", subt * 0.12);
        System.out.printf("|%37s| %15s | %,12.2f |%n", "", "Total a pagar", subt * 0.12 + subt);
        System.out.println("+----------+--------------------------+-----------------+--------------+");
    }
    }


