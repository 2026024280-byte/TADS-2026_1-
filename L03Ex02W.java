/*
Contagem regressiva
Leia um número inteiro positivo e apresente uma contagem regressiva desse número até 0.
Ao final, escreva a mensagem FIM DA CONTAGEM.
*/

import java.util.Scanner;

public class L03Ex02W {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Digite um numero inteiro positivo: ");
      int numero = sc.nextInt();

      int N = 0;

      while (numero >= N) {
         System.out.println(numero);
         numero--;
      }

      System.out.println("FIM DA CONTAGEM.");

      sc.close();

   }
}
