/*
Soma dos números
Leia um número inteiro positivo n e calcule a soma de todos os números inteiros de 1 até n.
Exemplo: para n = 5, o resultado corresponde a 1 + 2 + 3 + 4 + 5.
*/

import java.util.Scanner;

public class L03Ex03F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + n + " é: " + soma);

        sc.close();
    }
}
