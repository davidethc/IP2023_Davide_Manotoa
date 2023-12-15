package numeros4;

import java.util.Scanner;

public class Numeros4 {

    public static void main(String[] args) {
    
// Declaración de variables
        Scanner scanner = new Scanner(System.in);
        int cantidadElementos, numero, suma, mayor, menor, cantidadPositivos, cantidadNegativos;
        float mediaAritmetica;
        // Ingreso de Datos
        System.out.print("Ingrese cuántos elementos desea ingresar: ");
        cantidadElementos = scanner.nextInt();
        // Inicialización de variables
        suma = 0;
        mayor = 0;
        menor = 0;
        cantidadPositivos = 0;
        cantidadNegativos = 0;

        for (int contador = 0; contador < cantidadElementos; contador++) {
            System.out.print("Ingrese el número a calcular  ");
            numero = scanner.nextInt();

            // Número mayor y número menor
            if (numero > mayor) {
                mayor = numero;
            }
            if (contador == 0 || numero < menor) {
                menor = numero;
            }
            // Cantidad de positivos y negativos
            if (numero > 0) {
                cantidadPositivos++;
            } else if (numero < 0) {
                cantidadNegativos++;
            }
            suma += numero;
        }
        // Media aritmética
        mediaAritmetica = (float) suma / cantidadElementos;
        // Muestra de Resultados
        System.out.println("El mayor de los números ingresados es " + mayor + " y el menor de los números ingresados es " + menor);
        System.out.println("Tiene la cantidad de " + cantidadPositivos + " números positivos y tiene la cantidad de " + cantidadNegativos + " números negativos");
        System.out.println("La media aritmética es: " + mediaAritmetica);
    }

}
