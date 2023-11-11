public class SumarMatrices {
    public static void main(String[] args) {
        int[][] matriz1={
                {1,2,3},
                {4,5,6}
        };
        int matrizRow1 =0;
        matrizRow1 = matriz1.length;
        int matrizColumn1=matriz1[0].length;
        int[][] matriz2={
                {1,2,3},
                {4,5,6}
        };
        int matrizRow2 = matriz2.length;
        int matrizColumn2=matriz2[0].length;
        if(matrizRow1==matrizRow2 && matrizColumn1==matrizColumn2){

            int[][]matrizResultado=new int[matrizRow1][matrizColumn2];
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado[i].length; j++) {
                    matrizResultado[i][j]=matriz1[i][j]+matriz2[i][j];
                }
            }
            System.out.println("La suma de las matrices es: ");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado[i].length; j++) {
                    System.out.print(matrizResultado[i][j]+"\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("Las matrices no tienen la misma dimensión");
        }
    }
}
