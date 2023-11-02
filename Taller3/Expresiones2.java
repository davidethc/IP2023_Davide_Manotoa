public class Expresiones2 {
    public static void main(String[] args) {

        //Primerejercicioooo
        System.out.println("UNIDADES DE ALMACENAMIENTO \n---------------------------\n---------------------------\n\nProblema 1\n------------");
        System.out.println("1.  Suponga que su conexión de internet tiene una velocidad efectiva de descarga de 5Mbps (5 Mbits por segundo). ¿Cuántos minutos tardaría\nen descargarse una película que pesa 8GB?");
        // Tamaño de la película en gigabytes
        double tamanoPeliculaGB = 8;
        // Velocidad de descarga en Mbps
        double velocidadDescargaMbps = 5;
        // Convertir el tamaño de la película a megabits (1 byte = 8 bits)
        double tamanoPeliculaMb = tamanoPeliculaGB * 1024;
        // Calcular el velocidad
        double velocidad =  velocidadDescargaMbps / 8 ;    
        // Mostrar el resultado 
        double Timpo_segundos = tamanoPeliculaMb / velocidad ;
        double tiemppo_minutos = Timpo_segundos / 60 ;
        System.out.println("RESPUESTA: En total tardaria " + tiemppo_minutos + " minutos\n");

        // SEGUNDOEJERCICIOOOOOO
        System.out.println("Problema 2 :\n------------\n2.  Si en promedio en todo el mundo se envían 356 mil tweets por minuto y cada tweet\nen promedio pesa 2180 kB. ¿De cuánto espacio de almacenamiento debe disponer la\ncompañía Twitter Inc. para almacenar los tweets que se escribirán en los próximos 10 años?");
        int tweetsPorMinuto = 356_000;
        // Tamaño promedio de un tweet en kilobytes (kB)
        double tamanoTweetKB = 2180.0;
        // Número de minutos en 10 años (10 años * 365 días * 24 horas * 60 minutos)
        long minutosEn10Anios = 10L * 365 * 24 * 60;
        // Calcular el espacio de almacenamiento requerido en gigabytes (GB)
        double espacioAlmacenamientoGB = (tweetsPorMinuto * tamanoTweetKB * minutosEn10Anios) / (1024 * 1024);
        // Mostrar el resultado
        System.out.println("RESPUESTA : Twiter requiere en total " + espacioAlmacenamientoGB + " GB\n" );

        //tercer ejercicioooo 
        System.out.println("Problema 3: \n--------------\nUn fotógrafo utiliza una cámara de alta definición para capturar fotos panorámicas en excursiones a \nreservas naturales. Para almacenar las fotos lleva Memory Sticks de 32GB cada una.\n¿CuántosMemory Stick debe llevar para almacenar 500 fotos de alta definición de 64MB cada una,\n2000 fotos de mediana definición de 8300kB cada una y 50 videos de 4GB cada uno?");
        int Memory_stick1 =32;
        int fotos = 500;
        int definicion_foto = 64;
        int foto_menos =2000;
        int definicion_fotomenos = 8300;
        int video = 50;
        int video_pesa = 4;
        //fotos hd 
        double Total_fotos_gb = fotos * definicion_foto / 1024 ;
        //FotosSd
        double Total_fotos_menosgb = foto_menos * definicion_fotomenos / Math.pow(1024,2);
        // videos 
        double video_gb =  video * video_pesa;
        // calculo
        double total = Total_fotos_gb + Total_fotos_menosgb + video_gb;
        // ms
        double ms = total / 32 ;
        //Mostrarresultado
        System.out.println("RESPUESTA : debe llevar  "+ ms + " Gb" + " 8 Gb\n");





    }
}
