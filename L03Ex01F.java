/*
Contagem progressiva
Leia um número inteiro positivo n e escreva todos os números de 1 até n, um por linha.
Caso n seja menor ou igual a zero, apresente uma mensagem informando que o valor é inválido.
*/

import java.util.Scanner;

public class L03Ex01F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int num = sc.nextInt();

        int i = 1;

        if (num <= 0) {
            System.out.println("Numero inválido.");

        }

        for (; num >= i; num--) {
            System.out.println(num);

        }

        sc.close();

    }
}