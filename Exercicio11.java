import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanttas pessoas serão digitadas?");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + i + " pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.println("Genero da " + i + " pessoa: ");
            genero[i] = sc.next().toUpperCase().charAt(0);
        }

        double valor = 0.0;
        int totalHomens = 0;
        double mediaAlturaMulheres = 0.0;
        for (int i = 0; i < n; i++) {
            if (altura[i] > valor) {
                valor = altura[i];
                System.out.printf("Maior altura: %.2f", valor);
            }
            if (altura[i] < valor) {
                System.out.println("");
                System.out.println("Menor altura: " + altura[i]);
            }
            if (genero[i] == 'M') {
                totalHomens += 1;
            }
            if (genero[i] == 'F') {
                mediaAlturaMulheres += altura[i];
            }

        }
        System.out.printf("Media das alturas das mulheres: %.2f", (mediaAlturaMulheres/n));
        System.out.println("Total homens: " + totalHomens);

        sc.close();

    }
}