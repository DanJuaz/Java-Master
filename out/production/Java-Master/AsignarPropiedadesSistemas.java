import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesSistemas {
    public static void main(String[] args) {
        try{
        FileInputStream file = new FileInputStream("./propiedadesSystem/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(file);
            // Other option for the config
            p.setProperty("Mi.propiedad.personalizada","mi valor");

            System.setProperties(p);
            System.getProperties().list(System.out);

            //Resumen

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = "+ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.port.server"));
            System.out.println(System.getProperty("config.port.name"));
            System.out.println(System.getProperty("config.port.email"));

        }catch (Exception e){
            System.out.println("No existe el archivo "+e);
        }
    }
}