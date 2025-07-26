import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros que voce ira adicionar: ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        double maiorNumber = 0.0;
        int posicaoArray = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumber){
                maiorNumber = numeros[i];
                posicaoArray = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maiorNumber);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoArray);


        sc.close();
    }
}