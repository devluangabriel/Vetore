import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas que voce deseja adicionar: ");
        int n = sc.nextInt();

        int[] idade = new int[n];
        String[] nomes = new String[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite seu nome: ");
            nomes[i] = sc.next();
            System.out.println("Digite sua idade: ");
            try {
                idade[i] = sc.nextInt();
            } catch (RuntimeException e){
                System.out.println("Voce tentou inserir um número, este campo so é permitido textos");
                sc.close();
            }
            System.out.println("Digite sua altura: ");
            try {
                alturas[i] = sc.nextDouble();
            } catch (RuntimeException e){
                System.out.println("Voce tentou inserir um numero inteiro, este campo que so permite números decimais");
                sc.close();
            }

        }


        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------");
            System.out.println("Dados da " + i + " pessoa: ");
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Altura: " + alturas[i]);
            System.out.println("Idade: " + idade[i]);
        }
        System.out.println("----------------------------");

        double soma = 0.0;
        for (int i = 0; i < alturas.length; i++) {
            soma += alturas[i];
        }
        System.out.printf("Altura média: %.2f", (soma/alturas.length));
        System.out.println("");

        double soma2 = 0.0;
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {
                soma2 += idade[i];
            }
        }
        System.out.println("Pesoas com menos de 16 anos: " +  (soma2/idade.length) + "%");

        for (String name : nomes) {
            System.out.println(name.toUpperCase());
        }


        sc.close();

    }
}