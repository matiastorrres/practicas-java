public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de byte: " + Byte.MAX_VALUE);
        System.out.println("valor minimo de byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo byte corresponde en byte a " + Short.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de byte: " + Short.MAX_VALUE);
        System.out.println("valor minimo de byte: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de int: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de int: " + Integer.MIN_VALUE);

        // la letra al final puede ser minuscula o mayuscula (se recomienda usar la mayuscula);
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de long: " + Long.MAX_VALUE);
        System.out.println("valor minimo de long: " + Long.MIN_VALUE);


    }
}
