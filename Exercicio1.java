import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LER UM NUMERO INTEIRO POSITIVO N (MAX = 10)
        // LER Y NUMEROS INTEIROS
        // ADICIONAR N E Y A UM VETOR INT
        //MOSTRAR NA TELA TODOS OS NUMERO NEGATIVOS LIDOS.

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Bem vindo ao programa de leitura de números!
                Por favor, insira a quantidade de numeros que vc ira nos fornecer (maximo 10):
                """);
        int n = sc.nextInt();
        int[] numeroRecebidos = new int[n];

        for (int i = 0; i < numeroRecebidos.length; i++) {
            System.out.print("Por favor forneca o " + (i + 1) + "º número inteiro:");
            numeroRecebidos[i] = sc.nextInt();
        }

        System.out.println("Os números negativos fornecidos foram:");
        for (int i = 0; i < numeroRecebidos.length; i++) {
            if (numeroRecebidos[i] < 0) {
                System.out.println(numeroRecebidos[i]);
            }
        }

    }
}