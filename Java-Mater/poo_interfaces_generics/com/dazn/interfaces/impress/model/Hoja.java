package com.dazn.interfaces.impress.model;

abstract public class Hoja {
    protected String content;

    public Hoja(String content) {
        this.content = content;
    }
    abstract public String print();
}
