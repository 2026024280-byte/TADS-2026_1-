/*
Contagem progressiva
Leia um número inteiro positivo n e escreva todos os números de 1 até n, um por linha.
Caso n seja menor ou igual a zero, apresente uma mensagem informando que o valor é inválido.
*/

import java.util.Scanner;

public class L03Ex01W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = sc.nextInt();

        int N = 1;

        if (numero <= 0) {
            System.out.println("Numero inválido.");

        }
        while (numero >= N) {
            System.out.println(numero);
            numero--;

        }

        sc.close();

    }
}