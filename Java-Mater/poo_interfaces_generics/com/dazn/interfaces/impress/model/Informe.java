package com.dazn.interfaces.impress.model;

public class Informe extends Hoja implements IPrintable{
    private Person author;
    private Person reviewer;

    public Informe(String content, Person author, Person reviewer) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "Informe escrito por:\""+this.author+"\"" +
                " revisado por: \""+this.reviewer+"\": \""+this.content+"\" \n";
    }
}
