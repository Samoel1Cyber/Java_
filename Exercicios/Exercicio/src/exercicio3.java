import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor de A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            B[i] = A[9 - i];
        }

        System.out.println("\nVetor B (A invertido):");
        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        sc.close();
    }
}