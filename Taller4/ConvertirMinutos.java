import java.util.Scanner;

public class ConvertirMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de minutos
        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = sc.nextInt();

        // Calcular los días, horas y minutos
        int dias = minutos / (24 * 60);
        int horas = (minutos % (24 * 60)) / 60;
        int minutosRestantes = minutos % 60;

        // Mostrar el resultado
        System.out.println(minutos + " minutos equivalen a " + dias + " días con " + horas + " horas y " + minutosRestantes + " minutos.");
    }
}
