import java.util.Scanner;

public class circuloo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario ingresar el diámetro del círculo en centímetros
        System.out.print("Ingrese el diámetro del círculo en centímetros: ");
        double diametro = sc.nextDouble();

        // Calcular el radio del círculo (la mitad del diámetro)
        double radio = diametro / 2.0;

        // Calcular la circunferencia (2 * pi * radio)
        double circunferencia = 2 * Math.PI * radio;

        // Calcular el área del círculo (pi * radio^2)
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar resultados
        System.out.println("La circunferencia del círculo es: " + circunferencia + " cm");
        System.out.println("El área del círculo es: " + area + " cm²");

        sc.close();
    }
}
