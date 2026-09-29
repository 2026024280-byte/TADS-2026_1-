/*
Valor até acertar a condição
Solicite números inteiros repetidamente até que o usuário informe um 
número que seja simultaneamente:
    • positivo;
    • par;
    • múltiplo de 5.
Cada valor inválido deve gerar uma mensagem explicando que ele não 
atende às condições. Ao final, mostre o número aceito e quantas tentativas foram necessárias.
*/
import java.util.Scanner;

public class L03Ex12W  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int tentativas = 0;
        boolean valido = false;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            tentativas++;

            valido = numero > 0 && numero % 2 == 0 && numero % 5 == 0;

            if (!valido) {
                System.out.println("Número inválido. ");
            }
        } while (!valido);

        System.out.println("Número aceito: " + numero);
        System.out.println("Tentativas necessárias: " + tentativas);

        sc.close();
    }
}