public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java"; // creacion de forma literal o implicita
        String curso2 = new String("Programacion Java"); // creacion de forma explicita

        // es falso xq son dos instancias distintas, el "==" compara por referencia no por valor
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        boolean esIagual2 = curso.equals(curso2);
        System.out.println("esIagual2 = " + esIagual2);

        // compara los valores e ignora las mayusculas, minusculas.
        boolean esIgual3 = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual3 = " + esIgual3);

        // esto da verdadero xq cuando las variables que fueron comparadas se crean de forma literal (sin el new)
        // y tiene el mismo valor, no se crea una nueva instancia sino que a la variable se le asigna la referencia de la primera variable
        //java hace esto para optimizar y no crear objetos en memoria con el mismo valor
        String curso3 = "Programacion Java";
        boolean esIugal4 = curso3 == curso;
        System.out.println("esIugal4 = " + esIugal4);

        // No pasa lo mismo cuando se usa el operador new
        String curso4 = new String("Programacion Java");
        boolean esIugal5 = curso4 == curso2;
        System.out.println("esIugal5 = " + esIugal5);

    }
}
