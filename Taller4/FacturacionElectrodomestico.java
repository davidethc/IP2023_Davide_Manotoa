import java.util.Scanner;
public class FacturacionElectrodomestico {
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		//declaracion variables 
		float PrecioBase, PesoLibras, DistanciaKm, IVAp, CostoEnvio, Total;



		// Interfaz
		System.out.println("FACTURACION DE UN ELECTRODOMESTICO");
		System.out.println("----------------------------------");
		System.out.println("Ingrese el precio del electrodomestico");
		PrecioBase = sc.nextFloat();
		System.out.println("Ingrese el peso en libras del electrodomestico ");
		PesoLibras = sc.nextFloat();
		System.out.print("Ingrese la distancia al domicilio en Km: ");
		DistanciaKm = sc.nextFloat();

		//calculos

		IVAp = PrecioBase * (float) 0.12;
		CostoEnvio = PesoLibras * DistanciaKm * (float) 0.01;
		Total = PrecioBase + IVAp + CostoEnvio;
		//mostrar el resultado
		System.out.println("Total a pagar con IVA y entrega a domicilio: "+ Total + "USD");

		

	}
}