import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un nro entero");
        int numeroDecimal = 0;

        try{
          numeroDecimal = Integer.parseInt(numeroString);
        }catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Error debe ingresar un nro");
         main(args);
         System.exit(0);
        }

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println(resultadoBinario);

        // se agrega al "0b" al inicio para indicar que se trata de un nro binario
        int numeroBinario = 0b111110100;

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println("numeroBinario = " + numeroBinario);

        // se agrega al "0" al inicio para indicar que se trata de un nro octal
        int numeroOctal = 0764;

        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println(resultadoHexadecimal);

        // se agrega al "0x" al inicio para indicar que se trata de un nro Hexadecimal
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje =resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;


        JOptionPane.showMessageDialog(null, mensaje);
    }
}
