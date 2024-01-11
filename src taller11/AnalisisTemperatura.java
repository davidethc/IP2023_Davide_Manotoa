
package analisistemperatura;
import java.util.Scanner;
public class AnalisisTemperatura {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        // Declarar arreglos para almacenar temperaturas mínimas, máximas y medias
        double[] temperaturasMin = new double[7];
        double[] temperaturasMax = new double[7];
        double[] temperaturasMedias = new double[7];

        // Ingresar datos de temperaturas para cada día de la semana
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la temperatura mínima para el día " + (i + 1) + ": ");
            temperaturasMin[i] = scanner.nextDouble();

            System.out.print("Ingrese la temperatura máxima para el día " + (i + 1) + ": ");
            temperaturasMax[i] = scanner.nextDouble();

            // Calcular la temperatura media para cada día
            temperaturasMedias[i] = (temperaturasMin[i] + temperaturasMax[i]) / 2;
        }

        // Mostrar la temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturasMedias[i]);
        }

        // Encontrar el día con la temperatura más baja
        double tempMinima = temperaturasMin[0];
        int diaTempMinima = 1;

        for (int i = 1; i < 7; i++) {
            if (temperaturasMin[i] < tempMinima) {
                tempMinima = temperaturasMin[i];
                diaTempMinima = i + 1;
            }
        }

        System.out.println("\nDias con la temperatura más baja: Día " + diaTempMinima);

        // Encontrar el día con la temperatura más alta
        double tempMaxima = temperaturasMax[0];
        int diaTempMaxima = 1;

        for (int i = 1; i < 7; i++) {
            if (temperaturasMax[i] > tempMaxima) {
                tempMaxima = temperaturasMax[i];
                diaTempMaxima = i + 1;
            }
        }

        System.out.println("Dias con la temperatura más alta: Día " + diaTempMaxima);

        // Solicitar una temperatura para comparar
        System.out.print("\nIngrese una temperatura para buscar días con temperatura media cercana (±2°C): ");
        double temperaturaComparar = scanner.nextDouble();

        // Mostrar días con temperatura media cercana a la ingresada
        System.out.println("Dias con temperatura media cercana a " + temperaturaComparar + "°C (±2°C):");
        for (int i = 0; i < 7; i++) {
            if (Math.abs(temperaturasMedias[i] - temperaturaComparar) <= 2) {
                System.out.println("Día " + (i + 1));
            }
        }
    }
    
}
