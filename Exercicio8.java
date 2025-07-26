import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        int[] valoresRecebidos = new int[n];

        for (int i = 0; i < valoresRecebidos.length; i++) {
            System.out.print("Digite um numero: ");
            valoresRecebidos[i] = sc.nextInt();
        }

        double somaValores = 0;
        for (int i = 0; i < valoresRecebidos.length; i++) {
            if (valoresRecebidos[i] % 2 == 0) {
                somaValores += valoresRecebidos[i];
            } else {
                System.out.println("Nenhum numero par");
            }
        }

        System.out.printf("MEDIA DOS PARES = %.1f", (somaValores/valoresRecebidos.length));
        sc.close();
    }
}