package Array;

/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1 {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};
                     // 0   1   2   3  4  5

        int i;
        System.out.println("Jeito 1 ");
        System.out.println("Vetor: ");
        for (i = 0; i < 6; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
        System.out.println("Inverso do Vetor: ");
        for (i = 5; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        //Outro jeito de fazer
        System.out.println("");
        System.out.println("");
        System.out.println("Jeito 2 ");
        i = 0;
        while(i < (vetor.length)) {
            System.out.print(vetor[i] + " ");
            i++;
        }

        System.out.print("\nVetor: ");
        for(i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }
    }
}
