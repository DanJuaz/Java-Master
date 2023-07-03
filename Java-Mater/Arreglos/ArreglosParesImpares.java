import java.util.Scanner;

public class ArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, even, odd;
        a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 10 numeros");
        for (int i = 0; i <a.length; i++) {
            a[i] = sc.nextInt();
        }

        int evenC=0;
        int oddC=0;
        for (int i = 0; i <a.length; i++) {
            if (a[i]%2 ==0){
                evenC++;
            }else{
                oddC++;
            }
        }

        //System.out.println("oddC = " + oddC+" "+evenC);
        even = new int[evenC];
        odd = new int[oddC];
        int j=0;
        int k=0;
        for (int i = 0; i <a.length; i++) {
            if (a[i]%2 ==0) {
                even[j]=a[i];
                j++;
            }else{
                odd[k]=a[i];
                k++;
            }
        }
        System.out.println("Even loop");
        for (int i = 0; i < evenC; i++) {
            System.out.print(" "+even[i]+" ");
        }
        System.out.println();
        System.out.println("Odd loop");
        for (int i = 0; i < oddC; i++) {
            System.out.print(" " + odd[i]+" ");
        }
    }
}
