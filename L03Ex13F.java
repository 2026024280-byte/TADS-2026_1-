/*
Análise de dez números
Leia exatamente 10 números inteiros. Ao final, informe:
    • quantos são positivos;
    • quantos são negativos;
    • quantos são iguais a zero;
    • a soma de todos os números positivos.
*/

import java.util.Scanner;

public class L03Ex13F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        int somaPositivos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
                somaPositivos += numero;
            } else if (numero < 0) {
                negativos++;

            } else {
                zeros++;
            }
        }

        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);
        System.out.println("Quantidade de zeros: " + zeros);
        System.out.println("Soma dos positivos: " + somaPositivos);

        sc.close();

    }
}
