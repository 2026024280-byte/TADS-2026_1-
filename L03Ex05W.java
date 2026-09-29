
/*
Tabuada
Leia um número inteiro e apresente sua tabuada de multiplicação de 1 até 10 utilizando while.
Exemplo de saída para o número 4:
4 x 1 = 4
4 x 2 = 8
...
4 x 10 = 40
*/
import java.util.Scanner;

public class L03Ex05W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        sc.close();
    }
}
