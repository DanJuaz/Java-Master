import java.util.Scanner;

public class ArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 5 numeros: ");
        int arrayLength = a.length;
        for (int i = 0; i < arrayLength; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Introduzca el numero que quiere introducir: ");
        int numInsert = sc.nextInt();
        System.out.println("Introduzca en que posicion queire insertarlo: ");
        int pos = sc.nextInt();

        for (int i = arrayLength-2; i >=pos; i--) {
            a[i+1]=a[i];
        }
        a[pos]=numInsert;
        System.out.println("Loop: ");
        for (int i=0;i<arrayLength;i++) {
            System.out.println("a[i] = " + a[i]);
        }
        
        /*
        int[] a = new int[10];

        int elemento, posicion;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Nuevo elemento:");
        elemento = s.nextInt();

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = s.nextInt();

        for(int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        */
    }
}
