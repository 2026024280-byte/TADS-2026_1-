/*FAÇA UM PROGRAMA QUE PEÇA UM NUMERO PARA O USUARIO ATÉ ELE ACERTAR UM VALOR N 
CONSTANTE PREVIAMENTE DECLARADO. (1-100)
CONTE QUANTAS VEZES O USUARIO JA CHUTOU.
A PARTIR DA 3a tentativa tentativa de dicas de maior/menor que o ultimo valor informado
*/

import java.util.Scanner;

public class L03ExA1 {
public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int N = 49; // Valor constante previamente declarado
            
    int tentativa;
    int contador = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite um número: ");
            tentativa = sc.nextInt();
            contador++;
            
            if (tentativa < N) {
                System.out.println("O número é maior que " + tentativa + ".");
            } else if (tentativa > N) {
                System.out.println("O número é menor que " + tentativa + ".");
            } else {
                System.out.println("Parabéns! Você acertou o número " + N + " em " + contador + " tentativas.");
            }
        } while (tentativa != N);

        sc.close();

    }
}

