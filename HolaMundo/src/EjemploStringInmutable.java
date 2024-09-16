public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        String resultado2 = curso.transform(c->{return c + " con " + profesor;});

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resulado3 = resultado2.replace("a", "A");
        System.out.println("resultado2 = " + resultado2);
        System.out.println("resulado3 = " + resulado3);
    }
}
