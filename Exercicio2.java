import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos numeros vai adicionar no vetor: ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.print("Valores = ");
        double soma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            soma += numeros[i];
        }
        System.out.println("");
        System.out.println("SOMA = " + soma);
        System.out.println("Media = " + (soma / numeros.length));



        sc.close();
    }
}