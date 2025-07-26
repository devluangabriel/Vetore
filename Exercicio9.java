import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas voce vai digitar?");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nome da " + i + " pessoa : ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
        }

        String pessoaVelha = "";
        for (int i = 0; i <n; i++) {
            int idadeMaior = 0;
            if (idades[i] > idadeMaior) {
                idadeMaior = idades[i];
               pessoaVelha = nomes[i];
            }
        }
        System.out.println("Pessoa mais velha: " + pessoaVelha);


        sc.close();
    }
}