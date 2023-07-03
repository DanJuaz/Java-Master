import java.io.IOException;

public class EjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").startsWith("Mac")) {
                process = rt.exec("textedit");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().startsWith("Nix")) {
                process = rt.exec("contains");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconovido: "+e.getMessage());
            System.exit(1);
        }
        System.out.println("Sa ha cerrado el editor");
        System.exit(0);
    }
}

