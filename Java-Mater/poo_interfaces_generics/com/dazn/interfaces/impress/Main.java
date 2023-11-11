package com.dazn.interfaces.impress;

import com.dazn.impress.model.*;
import com.dazn.interfaces.impress.model.*;

import static com.dazn.interfaces.impress.model.IPrintable.print;

public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Resume of jobs... ", new Person("Julio", "AZ"), "Ingeniero Infromatico");
        cv.addExp("Java").addExp("C##").addExp("Angular").addExp("Power BI");

        Informe informe = new Informe("Content...", new Person("Ismael", "AZ"), new Person("Ismael", "AZ"));

        Book book = new Book(new Person("George", "Orwell"), "1984", Gender.DRAMA);
        book.addPage(new Page("PRIMERA PARTE: Doblepiensa")).addPage(new Page("SEGUNDA PARTE: Julia y la libertad ")).addPage(new Page("TERCERA PARTE: Tortura y traicion"));

        print(cv);
        print(informe);
        print(book);

    }

}
