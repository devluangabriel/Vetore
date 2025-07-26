import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serao adicionados? ");
        int n = sc.nextInt();

        String[] alunos = new String[n];
        double[] primeiroSemestreNotas = new double[n];
        double[] segundoSemestreNotas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do "  + i + " aluno.");
            System.out.println("Nome: ");
            alunos[i] = sc.next();
            System.out.println("Primeira nota: ");
            primeiroSemestreNotas[i] = sc.nextDouble();
            System.out.println("Segunda nota: ");
            segundoSemestreNotas[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            double valor = (primeiroSemestreNotas[i] += segundoSemestreNotas[i])/n;
            if (valor >= 6){
                System.out.println(alunos[i].toUpperCase());
            }
        }

        sc.close();
    }
}