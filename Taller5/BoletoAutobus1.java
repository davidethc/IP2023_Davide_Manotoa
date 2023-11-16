import java.util.Scanner;
public class BoletoAutobus1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //declarar variables
        float km_recorridos,precio_boleto, descuento, descuento_adicional;
        boolean dia_laborable;
        //Interfaz datos
        System.out.println("Ingrese el recorrido en km ");
        km_recorridos = sc.nextFloat();
        System.out.println(" Selecione el tipo de dia L(true) o F(false) ");
        dia_laborable = sc.nextBoolean();
        // calculo
        precio_boleto = km_recorridos * (float)0.05;
        // descuento
        if(dia_laborable== true && km_recorridos > 80 ){
            descuento = (float)0.15 * precio_boleto;
            precio_boleto=precio_boleto-descuento; 
            descuento_adicional = (float)0.05*precio_boleto;
            precio_boleto = precio_boleto-descuento_adicional;
        }else if (km_recorridos>80){
            descuento = (float)0.15 * precio_boleto;
            precio_boleto=precio_boleto-descuento; 
        }else{
           precio_boleto=precio_boleto;
        }
        System.out.println("El precio final del boleto es USD es : "+ precio_boleto);




    }
}