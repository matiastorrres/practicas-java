public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10; // por valor
        // Integer i = 10 // Por referencia
        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finalizamos el metodo main con i = " + i);
    }
    public static void test(int i){
    // public static void test(Integer i){
        System.out.println("iniciamos el metodo test con i = " + i);
        i=45;
        System.out.println("finalizamos el metodo test con i = " + i);
    }
}

// Cuando pasamos por valor o por referencia las clases que representan a los primitivos (Integer, BOOLEAN, STRING, ETC),
// su valor no cambiar, xq en el caso de las clases son inmutables
// Osea cada vez que se modifica el valor se retorna una nueva instancia
