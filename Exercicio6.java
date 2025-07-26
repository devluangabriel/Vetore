import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos de cada vetor: ");
        int n = sc.nextInt();

        int[] a =  new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor A: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os valores do vetor B: ");
            b[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++) {
           c[i] = a[i] += b[i];
            System.out.println(c[i]);
        }
    }
}