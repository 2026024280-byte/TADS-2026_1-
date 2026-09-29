
/*
Valor até acertar a condição
Solicite números inteiros repetidamente até que o usuário informe um número que seja simultaneamente:
    • positivo;
    • par;
    • múltiplo de 5.
Cada valor inválido deve gerar uma mensagem explicando que ele não atende às condições. Ao final, mostre o número aceito e quantas tentativas foram necessárias.
*/
import java.util.Scanner;

public class ValidaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int numeroEncontrado = 0;

        while (true) {
            System.out.print("Digite un número inteiro: ");
            int numero = scanner.nextInt();
            tentativas++;

            if (numero > 0 && numero % 2 == 0 && numero % 5 == 0) {
                numeroEncontrado = numero;
                break;
            }

            System.out.println("O número " + numero + " é inválido pelos seguintes motivos:");

            if (numero <= 0) {
                System.out.println("   - Não é positivo.");
            }
            if (numero % 2 != 0) {
                System.out.println("   - Não é par.");
            }
            if (numero % 5 != 0) {
                System.out.println("   - Não é múltiplo de 5.");
            }
            System.out.println("Tente novamente!\n");
        }

        // Mensagem final após sair do laço
        System.out.println("\n Condição atendida!");
        System.out.println("Número aceito: " + numeroEncontrado);
        System.out.println("Total de tentativas necessárias: " + tentativas);

        scanner.close();
    }
}
