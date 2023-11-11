public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz={
                {6,0,3},
                {2,6,1},
                {3,1,6}
        };
        // Matriz cuadrada y A=A^t -> Matriz Simetrica
        boolean cuadrada = false;
        boolean simetrica=true;
        loop:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz.length == matriz[i].length){
                    cuadrada = true;
                }else{
                    cuadrada = false;
                    //System.out.println("La matriz no es simetrica");
                    break loop;
                }
            }
        }

        if(cuadrada==true){
            int i,j;
            i=0;
            while (i<matriz.length){
                j=0;
                while (j<i && simetrica==true){
                    if(matriz[i][j]!=matriz[j][i]){
                        simetrica=false;
                    }
                    j++;
                }
                i++;
            }
        }else{
            simetrica=false;
        }

        System.out.println("¿La matriz es simetrica? = " + simetrica);
    }
}
