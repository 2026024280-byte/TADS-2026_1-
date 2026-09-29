/*
Número dentro de uma faixa
Solicite um número inteiro entre 10 e 50, inclusive.
Enquanto o valor estiver fora dessa faixa, informe que o valor é inválido e 
solicite uma nova entrada. Quando um valor válido for informado, apresente-o na tela.
*/

import java.util.Scanner;

public class L03Ex07W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para acertar o numero entre a faixa solicitada: ");

        double n = sc.nextDouble();

        while (n < 10 || n > 50) {
            System.out.print("Numero inválido. \nDigite outro valor: ");
            n = sc.nextDouble();

        }

        System.out.print("Parabéns voce acertou: " + n);

        sc.close();
    }
}
