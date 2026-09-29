/*
Maior e menor valor
Leia uma quantidade n de números inteiros, sendo n > 0.
Informe ao final:
    • o maior número digitado;
    • o menor número digitado;
    • a diferença entre o maior e o menor número.
Não assuma previamente que os números serão positivos. 

DECORAR PARA PROVA
*/
import java.util.Scanner;

public class L03Ex16F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (n > 0): ");
        int n = sc.nextInt();

        for (; n <= 0;) {
            System.out.print("A quantidade deve ser maior que zero.\n Digite a quantidade novamente: ");
            n = sc.nextInt();

        }

        System.out.print("Digite o 1º número: ");
        int primeiro = sc.nextInt();

        int maior = primeiro;
        int menor = primeiro;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int atual = sc.nextInt();

            if (atual > maior) {
                maior = atual;
            }
            if (atual < menor) {
                menor = atual;
            }
        }

        int diferenca = maior - menor;

        System.out.println("\n--- Resultados ---");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Diferença (maior - menor): " + diferenca);

        sc.close();

    }
}
