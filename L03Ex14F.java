/*
Leia uma quantidade n de números inteiros. Para os valores informados, calcule e apresente:
    • quantidade de números pares;
    • quantidade de números ímpares;
    • soma dos números pares;
    • soma dos números ímpares.
Considere o número zero como par.
 
DECORAR PARA PROVA
*/
import java.util.Scanner;

public class L03Ex14F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();

        int qtdPares = 0;
        int qtdImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                qtdPares++;
                somaPares += numero;
            } else {
                qtdImpares++;
                somaImpares += numero;
            }
        }

        System.out.println("Quantidade de pares: " + qtdPares);
        System.out.println("Quantidade de ímpares: " + qtdImpares);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

        sc.close();
    }
}
