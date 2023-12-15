package repetidos;

import java.util.Scanner;

public class Repetidos {

    public static void main(String[] args) {
     // Declaración de variables
        Scanner scanner = new Scanner(System.in);
        int ultimoElemento, cantidadRepeticiones, ultimaPosicion;
        
        // Ingreso del tamaño del vector
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamañoArreglo = scanner.nextInt();
        
        // Ingreso de valores al arreglo
        int[] arreglo = new int[tamañoArreglo];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamañoArreglo; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Cálculos
        ultimoElemento = arreglo[tamañoArreglo - 1];
        cantidadRepeticiones = 0;
        ultimaPosicion = -1;
        
        for (int i = 0; i < tamañoArreglo; i++) {
            if (arreglo[i] == ultimoElemento) {
                cantidadRepeticiones++;
                ultimaPosicion = i + 1;
            }
        }

        // Mostrar resultados
        System.out.println("El último elemento se repite " + cantidadRepeticiones + " veces.");
        
        if (cantidadRepeticiones > 0) {
            System.out.println("Se encuentra por última vez en la posición " + ultimaPosicion + ".");
        } else {
            System.out.println("No se repite en ninguna posición.");
        }
    }

}
