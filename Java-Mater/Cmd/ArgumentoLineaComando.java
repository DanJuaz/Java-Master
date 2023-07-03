public class ArgumentoLineaComando {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debe ingresar argumentos o parametros");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos n * "+i+": " +args[i]);
        }
        // 1. comando: javac file.java
            // this generate a file.class
        // 2. comando: java file
    }
}
