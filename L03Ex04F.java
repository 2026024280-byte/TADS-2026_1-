/*
Pares de um intervalo
Leia um número inteiro positivo n e apresente todos os números pares existentes entre 1 e n.
Ao final, informe também quantos números pares foram encontrados.
*/

import java.util.Scanner;

public class L03Ex04F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        // IF para validar se o número digitado é positivo
        if (n <= 0) {
            System.out.println("Erro: O número deve ser positivo e maior que zero.");
        } else {
            int contadorPares = 0;

            System.out.println("Números pares encontrados de 1 até " + n + ":");

            // FOR para percorrer todos os números de 1 até n
            for (int i = 1; i <= n; i++) {

                // IF para verificar se o número atual é par
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    contadorPares++; // Conta o número par encontrado
                }
            }

            System.out.println("\nQuantidade de números pares encontrados: " + contadorPares);
        }

        sc.close();
    }
}