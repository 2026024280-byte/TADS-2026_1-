/*
Divisão segura
Leia um número real a. Depois, solicite um segundo número real b.
Enquanto b for igual a zero, informe que o divisor é inválido e 
solicite novamente apenas o segundo número.
Quando um divisor válido for informado, apresente o resultado de a / b.
*/

import java.util.Scanner;

public class L03Ex08F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero real: ");
        double numeroR1 = sc.nextDouble();
        System.out.print("Digite o segundo numero real: ");
        double numeroR2 = sc.nextDouble();

        for (; numeroR2 == 0;) {
            System.out.print("Numero inválido. \nDigite um numero válido: ");
            numeroR2 = sc.nextDouble();
        }

        double divisao = numeroR1 / numeroR2;
        System.out.print("Resultado da divisão entre os dois numeros: " + divisao);

        sc.close();
    }
}
