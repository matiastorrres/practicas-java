public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040'; // forma unicode
        char decimal = 64; // forma decimal
        char simbolo ='@';
        char espacio = ' '; // '\u0020'
        char retroceso = '\b'; // hace una espacio para atras.
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("simbolo1 =" + espacio + simbolo);
        System.out.println("simbolo2 =" + retroceso + simbolo); // borra el "="
        System.out.println("simbolo3 =" + tabulador + simbolo);
        System.out.println("simbolo4 =" + nuevaLinea + simbolo);
        System.out.println("simbolo5 =" + retornoCarro + simbolo);
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter => " + (decimal == caracter) );
        System.out.println("tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor maximo de char: " + Character.MAX_VALUE);
        System.out.println("valor minimo de char: " + Character.MIN_VALUE);

    }
}
