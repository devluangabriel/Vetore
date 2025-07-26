import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();

        double[] valoresRecebidos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            valoresRecebidos[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < valoresRecebidos.length; i++) {
            sum += valoresRecebidos[i];
        }
        double media = (sum / valoresRecebidos.length);
        System.out.printf("Media do vetor = %.2f", media);

        System.out.println(" ");
        System.out.println("elemento abaixo da media:");
        for (int i = 0; i < valoresRecebidos.length; i++) {
            if (valoresRecebidos[i] < media) {
                System.out.println(valoresRecebidos[i]);
            }
        }

        sc.close();
    }
}