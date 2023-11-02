public class Expresiones1 {
    public static void main(String[] args) {
        // Expresión 1
        double  resultado1 = 2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) /  Math.pow(5, 2);
        // Expresión 2
        double resultado2 = (2 * 16 / Math.pow(2, 3) - 4) + 32 - (125 / 5 / 5 + 3);
        // Expresión 3
        boolean resultado3 = 12 >= 12 || 8 > 4 && 22 < 21;
        // Expresión 4
        boolean resultado4 = (12 >= 12 || 8 > 4) && 22 < 21;
        // Expresión 5
        boolean resultado5 = 1 + 8 * (12 - 3 + 9 / (9 - Math.pow(4, 5) + 7)) > 2.8 * 2 && Math.pow(3, 4) == 100 - 19;
        // Expresión 6
        int a = 100, b = -12, c = 4000, d = 4, e = 0;
        boolean resultado6 = (a + b * c + e) <= e * d * b && (c / a + e - d) < e + d - c + b * a;
        // Expresión 7
        boolean v = true, f = false;
        boolean resultado7 = v || f && (v || !(f || v && v));
        // Expresión 8
        boolean resultado8 = false || Math.pow(2, 3) / 4 == Math.pow(0, 0) && !(Math.pow(2, -1) < 0);
        //TITULOOO
        System.out.println("EXPRESIONES\n---------------\n-------------");
        // Imprimir los resultados
        System.out.println("Expresión 1: 2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / 5 ^ 2");
        System.out.println("Resultado: " + resultado1);

        System.out.println("Expresión 2: (2 * 16 / 2 ^ 3 - 4) + 32 - (125 / 5 / 5 + 3)");
        System.out.println("Resultado: " + resultado2);

        System.out.println("Expresión 3: 12 >= 12 || 8 > 4 && 22 < 21");
        System.out.println("Resultado: " + resultado3);

        System.out.println("Expresión 4: (12 >= 12 || 8 > 4) && 22 < 21");
        System.out.println("Resultado: " + resultado4);

        System.out.println("Expresión 5: 1 + 8 * (12 - 3 + 9 / (9 - 4 ^ 5) + 7) > 2.8 * 2 && 3 ^ 4 == 100 - 19");
        System.out.println("Resultado: " + resultado5);

        System.out.println("Expresión 6: (a + b * c + e) <= e * d * b && (c / a + e - d) < e + d - c + b * a");
        System.out.println("Resultado: " + resultado6);

        System.out.println("Expresión 7: V || F && (V || !(F || V && V))");
        System.out.println("Resultado: " + resultado7);

        System.out.println("Expresión 8: Falso || 1 == (2 ^ 3 / 4) ^ 0 && !(2 ^ -1 < 0)");
        System.out.println("Resultado: " + resultado8);
    }
    }