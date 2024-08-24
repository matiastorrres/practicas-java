public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 2.12e3F; // 2120.0F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor maximo de float: " + Float.MAX_VALUE);
        System.out.println("valor minimo de float: " + Float.MIN_VALUE);

        // cuando ponemos punto por defecto es double por eso no es necesario agregar la "D" al final
        double realDouble= 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor maximo de double: " + Double.MAX_VALUE);
        System.out.println("valor minimo de double: " + Double.MIN_VALUE);
    }
}
