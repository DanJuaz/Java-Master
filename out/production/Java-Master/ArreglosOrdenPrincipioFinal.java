public class ArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        int numerosLegn = numeros.length;
        for (int i = 0; i < numerosLegn; i++) {
            numeros[i] = i + 1;
        }
        int aux =0;
        for (int i = 0; i < numerosLegn-i; i++) {
            a[aux++]= numeros[i];
            a[aux++] = numeros[numerosLegn -1 -i];

            //System.out.print(numeros[i]+"");
            //System.out.println(numeros[numerosLegn-1-i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }


        

    }
}
