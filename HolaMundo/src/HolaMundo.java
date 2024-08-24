public class HolaMundo {
     public static void main (String[] args){
         String saludar = "hola Mundo desde Java, usando variables";
         System.out.println(saludar);
         System.out.println("saludar: " + saludar.toUpperCase());

         int numero = 10;

         System.out.println("numero = " + numero);

         Integer numero2 = 25; // **

         System.out.println("numero2 = " + numero2);

         boolean valor = true;

         // Este es un nuevo contexto
         if(valor){
             System.out.println("numero2 = " + numero2); // las variables definidas en el contexto padre se
             // pueden usar en un contexto hijo
             Integer numero3 = 55; // esta variable solo se puede usar en este contexto o en un contexto hijo,
             // no se puede usar en el contexto padre *
             // Integer numero2 = 60; // tampoco se puede definir una variable con el mismo nombre que una variable
             // que este definido en el padre, tambien da error. **
             System.out.println("numero3 = " + numero3);
         }
        //  System.out.println("numero3 = " + numero3); //  Da error *

         // Varibales dinamicas
         var nro = 3; // se utiliza la "var" y el tipo de dato se asigna de forma automatica.

    }
}
