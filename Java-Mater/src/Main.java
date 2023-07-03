import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[]a=new int[12];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 12 numeros(1 al 6): ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        String[] b = new String[6];
        for (int i = 0; i <b.length; i++) {
            int aux = i+1;
            String histo = aux +" : ";
            for (int j = 0; j < a.length; j++) {
                if (aux==a[j]){
                    histo += "*";
                }
            }
            b[i]=histo;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}