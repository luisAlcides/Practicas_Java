package Arreglos;

public class ArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);

        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }

        System.out.println("Pares:");
        for (int paress : pares) {
            System.out.print(paress + " ");
        }

        System.out.println("");
        System.out.println();
        System.out.println("Impares");
        for (int imparess : impares) {
            System.out.print(imparess + " ");
        }
    }
}
