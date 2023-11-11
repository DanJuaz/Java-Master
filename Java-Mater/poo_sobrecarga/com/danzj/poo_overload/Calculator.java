package com.danzj.poo_overload;

public class Calculator {
    private Calculator() {
    }

    public static int sumar(int a, int b){
        return a+b;
    }
    public static float sumar(float a, int b){
        return b+a;
    }
    public static float sumar(float x, float y){
        return x+y;
    }
    public static int sumar(String a, String b){
        int resultado;
        try{
            resultado= Integer.parseInt(a)+Integer.parseInt(b);
        }catch (NumberFormatException e){
            return resultado=0;
        }
        return resultado;
    }

    public static int sumar(int...args){
        int result=0;
      for (int i = 0; i < args.length; i++) {
        result +=args[i];
      }
      return result;
    }
}
