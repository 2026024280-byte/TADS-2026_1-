/*
Valor até acertar a condição
Solicite números inteiros repetidamente até que o usuário informe um número que seja simultaneamente:
    • positivo;
    • par;
    • múltiplo de 5.
Cada valor inválido deve gerar uma mensagem explicando que ele não atende às condições. Ao final, mostre o número aceito e quantas tentativas foram necessárias.
*/

import java.util.Scanner;

public class l03Ex12F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, cont;

        cont = 0;

        for (; true;) {
            System.out.print("Digite um numero inteiro: ");
            numero = sc.nextInt();
            cont++;

            if (numero > 0 && numero % 2 == 0 && numero % 5 == 0) {
                System.out.println("O numero digitado atende as condições. " + numero);
                break;
            } else {
                System.out.print("O numero não atende as condições. ");
            }

        }

        System.out.println("Numero de tentativas: " + cont);

        sc.close();
    }
}
