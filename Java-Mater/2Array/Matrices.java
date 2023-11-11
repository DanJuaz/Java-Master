public class Matrices {
    public static void main(String[] args) {
        int[][] nums=new int[2][3];
        System.out.println("Numero de filas = " + nums.length);
        System.out.println("Numero de columnas = " + nums[0].length);
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=i+j;
                System.out.println("\tnums["+i+"]["+j+"] " + nums[i][j]+"\t");
            }
        }
    }
}
