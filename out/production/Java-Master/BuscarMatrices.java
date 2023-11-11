import java.util.Scanner;

public class BuscarMatrices {
    public static void main(String[] args) {
        int[][] matriz = {
                //0
                {25, 541, 58, 89, 47},
                {14, 36, 78, 6544, 12},
                {23, 789, 456, 2598, 14,36}
        };
        Scanner sc = new Scanner(System.in);
        boolean find = false;
        System.out.println("Introduzca el numero a buscar: ");
        int num = sc.nextInt();
        int i;
        int j = 0;
        buscar:
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    find = true;
                    break buscar;
                }
            }
        }
        String s = find ? "Se encontro el " + num + " en la fila " + i + " y columna " + j : "El elemento no se ha encontrado";
        System.out.println(s);

    }
}
