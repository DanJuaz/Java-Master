import java.util.Scanner;

public class ArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzaca 10 numeros: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int last=nums[nums.length-1];
        //System.out.println("last = " + last);

        for (int i = nums.length-2; i >= 0; i--) {
            nums[i+1] = nums[i];
        }
        nums[0]=last;
        System.out.println("Loop");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        /*
        int[] a = new int[10];
        int ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese el número:");
            a[i] = s.nextInt();
        }
        System.out.println();
        ultimo = a[a.length-1];
        for(int i = a.length -2; i >= 0; i--){
            a[i+1] = a[i];
        }
        a[0] = ultimo;

        System.out.println("El arreglo:");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }*/

    }
}
