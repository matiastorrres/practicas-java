import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nro entero: ");
        // String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;

        try{
            // Integer.parseInt(numeroStr);
            numeroDecimal = scanner.nextInt(); // Esto convierte directamente el string en entero,
            // pero tiene el problema que si no se ingresa un nro(osea letras), larga un error

        }
        // catch(NumberFormatException e){ // este es para el caso que se utiliza el metodo nexLine()
         catch(InputMismatchException e){ // este es para que el caso que se utiliza el metodo nextInt()
         System.out.println("Error debe ingresar un nro");
         main(args);
         System.exit(0);
        }
        System.out.println("numero decimal= " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje =resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);
    }
}
