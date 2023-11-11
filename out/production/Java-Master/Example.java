import com.daznj.elements.ElementForm;
import com.daznj.elements.InputForm;
import com.daznj.elements.SelectForm;
import com.daznj.elements.TextareaForm;
import com.daznj.elements.select.*;
import com.daznj.elements.validator.*;
import com.daznj.elements.validator.Lenght;
import com.daznj.elements.validator.NoNull;
import com.daznj.elements.validator.Number;
import com.daznj.elements.validator.Required;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        InputForm username = new InputForm("username", "username");
        username.addValidator(new Required());

        InputForm password = new InputForm("clave", "password");
        password.addValidator(new Required())
                    .addValidator(new NoNull())
                        .addValidator(new Lenght());

        InputForm email = new InputForm("email", "email");
        email.addValidator(new Required())
                .addValidator(new Email());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidator(new Number());

        TextareaForm experence= new TextareaForm("exp", 5, 9);

        SelectForm lenguage = new SelectForm("lenguage");
        lenguage.addValidator(new NoNull());

        lenguage.addOption(new Option("java", "1"))
                    .addOption(new Option("python", "2"))
                        .addOption(new Option("C#","3").setSelected())
                            .addOption(new Option("JavaScript", "4"));

        /* Clase anonima
        No se pueda sobre escribir
        Uso extraordinaio
        */
        ElementForm saludar = new ElementForm("saludo") {
            @Override
            public String paintHTML() {
                return "<input disabled name='"+this.name+"' value='"+this.value+"'>";
            }
        };

        saludar.setValue("Hola que tal este campo está deshabilitado!!");
        username.setValue("jhon.doe");
        password.setValue("a1b2c3");
        email.setValue("jhon.doe@correo.com");
        edad.setValue("28");
        experence.setValue("...más de 10 años de experiencia...");

        List<ElementForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experence,
                lenguage,
                saludar);

        elementos.forEach(e -> {
            System.out.println(e.paintHTML());
            System.out.println("<br>");
        });

        elementos.forEach(e ->{
            if(!e.isValidate()){
                e.getErrors().forEach(System.out::println);
            }
        });
    }
}
