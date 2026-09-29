/*
Senha com número de tentativas
Solicite uma senha inteira. A senha correta é 2026.
O programa deve continuar solicitando a senha enquanto 
ela estiver incorreta. Ao final, informe:
    • que o acesso foi permitido;
    • o número total de tentativas realizadas.
*/

import java.util.Scanner;

public class L03Ex09W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha de 4 numeros: ");
        int senha = sc.nextInt();

        int contadorTentativas = 1;

        while (senha != 2026) {
            System.out.print("Senha incorreta. \nDigite novamente: ");
            senha = sc.nextInt();
            contadorTentativas++;
        }

        System.out.print("Acesso permitido. ");
        System.out.print("Tentativas de acesso: " + contadorTentativas);

        sc.close();
    }
}
