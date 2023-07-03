import java.util.Scanner;

public class ArreglosEliminarElemento {
    public static void main(String[] args) {
        
        int[]a = new int[5];
        int aLegnth=a.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 5 numeros: ");
        for (int i = 0; i < aLegnth; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Introduzca el numero a eliminar: ");
        int num=sc.nextInt();
        int pos=0;
        for (int i = 0; i < aLegnth; i++) {
            if (a[i] == num) {
                pos++;
            }

        }
        //System.out.println("pos = " + pos);
        a[pos]=num;
        // Reemplazamos el valor de la psocion por el siguiente
        for (int i = pos; i < aLegnth-1; i++) {
            a[i]=a[i+1];
            System.out.println("a["+i+"] = " + a[i]);
        }

        for (int i = 0; i <aLegnth ; i++) {
            System.out.println("a["+i+"] => " + a[i]);
        }
    }
}
