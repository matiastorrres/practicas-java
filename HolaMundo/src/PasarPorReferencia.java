public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12};

        System.out.println("iniciamos el metodo main");
        for(int i =0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("antes de invocar el metodo test");
        test(edad);
        System.out.println("Despues de invocar el metodo test");
        for(int i =0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finalizamos el metodo main");
    }
    public static void test(int[] edadArr){
        System.out.println("iniciamos el metodo test");
        for(int i =0; i<edadArr.length; i++){
            edadArr[i] =edadArr[i]+10;
        }
        System.out.println("finalizamos el metodo test");

    }
}
