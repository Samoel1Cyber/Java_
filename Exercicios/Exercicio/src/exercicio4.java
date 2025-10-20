import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor de A[" + i + "]: ");
            A[i] = sc.nextInt();
            soma += A[i];
        }

        double media = soma / 10.0;
        System.out.println("\nA média dos valores é: " + media);

        sc.close();
    }
}