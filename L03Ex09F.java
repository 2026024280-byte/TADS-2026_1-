/*
Senha com número de tentativas
Solicite uma senha inteira. A senha correta é 2026.
O programa deve continuar solicitando a senha enquanto ela 
estiver incorreta. Ao final, informe:
    • que o acesso foi permitido;
    • o número total de tentativas realizadas.
*/

import java.util.Scanner;

public class L03Ex09F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua Senha de 4 números: ");
        int senha = sc.nextInt();

        int contadorTentativas = 1;

        for (; senha != 2026; contadorTentativas++) {
            System.out.print("Senha incorreta. \nDigite novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido. ");
        System.out.println("Tentativas de acesso: " + contadorTentativas);

        sc.close();

    }
}
