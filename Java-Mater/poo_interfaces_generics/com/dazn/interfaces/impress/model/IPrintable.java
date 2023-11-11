package com.dazn.interfaces.impress.model;

public interface IPrintable {
    String TEXTO_DEFECTO = "TEXTO POR DEFECTO";
    //deufault => not required
    String print();

    static void print(IPrintable printable){
        System.out.println(printable.print());
    };

}
