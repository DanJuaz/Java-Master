import java.util.Scanner;
public class MatrizX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la dimension de la matriz cuadrada: ");
        int length=sc.nextInt();
        String[][] matriz=new String[length][length];
        if(length!=0){
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {

                    if(i==j) {
                        matriz[i][j] = "X";

                    }else if(j== length-i-1){
                        matriz[i][j] = "X";

                    }else{
                        matriz[i][j]="_";
                    }
                }

            }
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