package com.dazn.interfaces.impress.model;

import java.util.ArrayList;
import java.util.List;

public class Book implements IPrintable{
    private Person author;
    private String title;

    private List<IPrintable> page;
    private Gender gender;

    public Book(Person author, String title, Gender gender) {
        this.author =  author;
        this.title = title;
        this.gender = gender;
        this.page = new ArrayList<>();
    }

    public Book addPage(IPrintable page){
        this.page.add(page);
        return this;
    }
    public String print(){
        StringBuilder sb = new StringBuilder("Title: ").append(this.title).append("\n")
                .append("- Author: ").append(this.author).append("\n")
                .append("- Gender : ").append(this.gender).append("\n");
        for (IPrintable page:
             this.page) {
            sb.append(page.print()).append("\n");
        }
        return sb.toString();
    };
}
