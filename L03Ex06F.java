/*
Soma de uma sequência informada
Leia uma quantidade n de números que serão digitados pelo usuário. 
Em seguida, leia exatamente n valores reais e apresente:
    • a soma de todos os valores;
    • a média dos valores informados.
O valor de n deve ser maior que zero.
*/

import java.util.Scanner;

public class L03Ex06F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números para somar todos: ");
        int n = sc.nextInt();

        for(; n <= 0; ) {
            System.out.print("Valor inválido! Digite a quantidade de números: ");
            n = sc.nextInt();
        }

        double soma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = sc.nextDouble();
            soma += valor;
            
        }

        double media = soma / n;

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);

        sc.close();
        
    }
}

