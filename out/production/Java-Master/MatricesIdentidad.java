import java.util.Scanner;

public class MatricesIdentidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca cuantas filas tendra la M.I.: ");
        int filas=sc.nextInt();
        System.out.println("Introduzca cuantas columnas tendra la M.I.: ");
        int columnas=sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        int aux;
        if(filas==columnas) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                 if(i==j){
                     matriz[i][j]=1;
                 }else{
                     matriz[i][j]=0;
                 }
                }
            }
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("La M.I. no es cuadrada");
        }
    }
}
