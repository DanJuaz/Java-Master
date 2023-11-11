import java.util.Scanner;

public class MatrizSilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la dimension de la matriz cuadrada: ");
        int length=sc.nextInt();
        int[][] matriz=new int[length][length];
        if(length!=0){
            for (int i = 0; i < (length+1)/2; i++) {
                for (int j = 0; j < length; j++) {
                    if(0==matriz[i][0]) {
                        matriz[i][j] = 1;
                    }
                }
            }
            for (int i = (length+1)/2; i <= (length+1)/2; i++) {
                for (int j = 0; j <length; j++) {
                        matriz[i][j] = 1;
                }
            }

            for (int i = (length+2)/2; i < length; i++) {
                for (int j=0; j < length; j++) {
                    if(0==matriz[i][0] || j==length-1) {
                        matriz[i][j] = 1;
                    }
                }
            }

            System.out.println("Silla:");
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("Error de dimension");
        }
    }
}
