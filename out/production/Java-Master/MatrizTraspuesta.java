public class MatrizTraspuesta {
    public static void main(String[] args) {

        int[][] matriz={
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };

        System.out.println("Matriz: ");
        int filas=matriz.length;
        int columnas = matriz[0].length;


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i]=matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(traspuesta[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
