import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros que irão ser adicionados: ");
        int n = sc.nextInt();
        int[] numerosRecebido = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero : ");
            numerosRecebido[i] = sc.nextInt();
        }

        int numerosPares = 0;
        for (int i = 0; i < n; i++) {
           if (numerosRecebido[i]%2 == 0) {
               System.out.println("--------------------");
               System.out.println("Numero par: " + numerosRecebido[i]);
               numerosPares++;
           }
        }
        System.out.println("Quantidade de numeros pares: " + numerosPares);
        sc.close();

    }
}