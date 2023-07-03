public class ArreglosCombinados {

    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[12];
        b = new int[12];
        c = new int[24];
        System.out.println("=============Bucle a=================");
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println("a[i] = " + a[i]);
        }
        System.out.println("=================Bucle b=================");
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
            System.out.println("b[i] = " + b[i]);
        }

        int aux = 0;
        for (int i = 0; i < b.length; i+=3) {
            for(int j = 0; j < 2; j++) {
                c[aux] = a[i+j];
                aux = aux +1;
                //c[aux++] = a[i+j];
            }
            for(int j = 0; j < 2; j++) {
                c[aux] = b[i+j];
                aux = aux+1;
                //c[aux++] = b[i+j];
            }
        }
        System.out.println("=================Bucle c=================");
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);
        }
    }
}
