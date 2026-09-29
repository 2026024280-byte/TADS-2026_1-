
/*
Contagem regressiva
Leia um número inteiro positivo e apresente uma contagem regressiva desse número até 0.
Ao final, escreva a mensagem FIM DA CONTAGEM.
*/

import java.util.Scanner;

public class L03Ex02F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");

        int N = 0;

        for (int num = sc.nextInt(); num >= N; num--) {
            System.out.println(num);
        }

        System.out.println("FIM DA CONTAGEM.");

        sc.close();

    }
}
