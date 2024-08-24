public class ConversionDeTipos {
    public static void main(String[] args) {
        // Conversion de cadenas a primitivos
        String numeroStr = "850";
        int numeroInt =  Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr  = "987545.54e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "FALSE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // conversion entre tipos primitivos a cadena

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt); // con el wraper Interger
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        otroNumeroStr = String.valueOf(otroNumeroStr + 10); // con el wraper String
        String otroNumeroStr2 = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        System.out.println("otroNumeroStr2 = " + otroNumeroStr2);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        // Conversion entre tipos primitivos

        int i = 3276755;
        short s = (short) i; // SE PIERTE INFORMACION, Y LA INFORMACION ALMACENADA ES INCOGRUENTE, XQ EL MAXIMO VALOR DE SHORT ES 32767
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        // EN PRIMITIVOS SOLO PODEMOS HACER CAST A TIPOS NUMERICOS, INCLUYENDO LOS NUMEROS REALES.
        // NO PODEMOS CASTEAR UN TIPO NUMERICO A BOOLEAN XQ SON TIPOS TOTALMENTE INCOMPATIBLES.
        
    }
}
