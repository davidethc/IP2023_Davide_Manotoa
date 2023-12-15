
 import java.util.Scanner;
public class JavaApplication51 {

    public static void main(String[] args) {
    
                        Scanner sc = new Scanner(System.in);
        int cantEmpleados;
        
        System.out.print("Ingrese la cantidad de empleados que posee: ");
        cantEmpleados = sc.nextInt();
        
        String[] nombre = new String[cantEmpleados];
        int[] sueldo = new int[cantEmpleados];
        int mayor = 0;
        
        for (int i = 0; i < cantEmpleados; i++) {
            System.out.print("\nIngrese el nombre del empleado " + (i+1) + ": ");
            nombre[i] = sc.next();
            System.out.print("Ingrese el sueldo que gana " + nombre[i] + ": ");
            sueldo[i] = sc.nextInt();
        }
        
        for (int i = 0; i < cantEmpleados; i++) {
            if (sueldo[i] > mayor) {
                mayor = sueldo[i];
            }
        }
        System.out.println("\n===============================================");
        System.out.println("\nEl sueldo mas alto es " + mayor);
        System.out.println("Los empleados que lo ganan son:");
        
        for (int i = 0; i < cantEmpleados; i++) {
            if (sueldo[i] == mayor) {
                System.out.println("*" + nombre[i]);
            }
        }
    }
    
}
