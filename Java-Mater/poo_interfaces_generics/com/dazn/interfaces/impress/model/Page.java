package com.dazn.interfaces.impress.model;

public class Page extends Hoja implements IPrintable{
    public Page(String content) {
        super(content);
    }

    @Override
    public String print() {
        return this.content;
    }
}
