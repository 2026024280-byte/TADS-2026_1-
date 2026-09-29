/*
Leia a quantidade de alunos de uma turma. Para cada aluno, leia uma nota entre 0 e 10.
Cada nota inválida deve ser solicitada novamente e não deve contar como um aluno lido.
Ao final, apresente:
    • média da turma;
    • quantidade de alunos aprovados (nota >= 6);
    • quantidade de alunos reprovados (nota < 6);
    • quantidade de alunos com nota igual ou superior a 9.

    DECORAR PARA PROVA
*/
import java.util.Scanner;

public class L03Ex15F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;
        int notaAlta = 0;

        for (int i = 1; i <= qtdAlunos; i++) {
            double nota = -1;
            boolean valido = false;

            while (!valido) {
                System.out.print("Digite a nota do aluno " + i + ": ");
                nota = sc.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Digite novamente.");
                } else {
                    valido = true;
                }
            }

            soma += nota;

            if (nota >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }

            if (nota >= 9) {
                notaAlta++;
            }
        }

        double media = soma / qtdAlunos;

        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + reprovados);
        System.out.println("Quantidade de alunos com nota >= 9: " + notaAlta);

        sc.close();
    }
}
