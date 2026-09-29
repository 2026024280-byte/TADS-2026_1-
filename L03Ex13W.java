
/*
Análise de dez números
Leia exatamente 10 números inteiros. Ao final, informe:
    • quantos são positivos;
    • quantos são negativos;
    • quantos são iguais a zero;
    • a soma de todos os números positivos.
*/
import java.util.Scanner;

public class L03Ex13W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        int somaPositivos = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite o numero " + i + " : ");
            float numero = sc.nextFloat();
            i++;

            if (numero > 0) {
                positivos++;
                somaPositivos += numero;
            } else if (numero < 0) {
                negativos++;

            } else {
                zeros++;
            }

        }

        System.out.println("Numeros Positivos: " + positivos);
        System.out.println("Numeros Negativos: " + negativos);
        System.out.println("Numeros Zeros: " + zeros);
        System.out.println("Soma dos Numeros Positivos: " + somaPositivos);

        sc.close();

    }
}