/*
Soma dos números
Leia um número inteiro positivo n e calcule a soma de todos os números inteiros de 1 até n.
Exemplo: para n = 5, o resultado corresponde a 1 + 2 + 3 + 4 + 5.
*/
import java.util.Scanner;

public class L03Ex03W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int n = sc.nextInt();

        int i = 1;
        int soma = 1;

        while (i < n) {
            i++;
            soma += i;

        }

        System.out.println("Soma dos numeros de 1 até " + n + "  é: " + soma);

        sc.close();

    }
}
