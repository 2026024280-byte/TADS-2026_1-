/*EX 6. FAÇA UM PROGRAMA QUE SOLCIITE A SENHA CERTA (USE INT) ATÉ QUE O USUARIO ACERTE
 */

import java.util.Scanner;

public class L03ExA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCerta = 1234;
        int tentativa;

        System.out.print("Digite a senha: ");
        tentativa = sc.nextInt();

        while (tentativa != senhaCerta) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.print("Digite a senha: ");
            tentativa = sc.nextInt();
        }


        System.out.println("Senha correta. Acesso permitido.");

        sc.close();
    }
}
