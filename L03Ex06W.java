/*
Soma de uma sequência informada
Leia uma quantidade n de números que serão digitados pelo usuário. 
Em seguida, leia exatamente n valores reais e apresente:
    • a soma de todos os valores;
    • a média dos valores informados.
O valor de n deve ser maior que zero.
*/
import java.util.Scanner;

public class L03Ex06W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números para somar todos: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.print("Valor inválido! Digite a quantidade de números: ");
            n = sc.nextInt();
        }

        double soma = 0;
        int i = 1;
        while (i <= n) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = sc.nextDouble();
            soma += valor;
            i++;
        }

        double media = soma / n;

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);

        sc.close();
    }
}