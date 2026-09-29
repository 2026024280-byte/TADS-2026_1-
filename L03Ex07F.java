/*
Número dentro de uma faixa
Solicite um número inteiro entre 10 e 50, inclusive.
Enquanto o valor estiver fora dessa faixa, informe que o valor é inválido
e solicite uma nova entrada. Quando um valor válido for informado, apresente-o na tela.
*/

import java.util.Scanner;

public class L03Ex07F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor dentro da faixa solicitada pelo programa: ");

        double num = sc.nextDouble();

        for (; num < 10 || num > 50;) {
            System.out.print("Valor Inválido.\nDigite outro valor: ");
            num = sc.nextDouble();

        }

        System.out.println("Parabéns você acertou = " + num);

        sc.close();
    }
}
