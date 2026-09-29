import java.util.Scanner;

public class L03ExA3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FAÇA UM PROGRAMA QUE DESENHE UM TRIANGULO DE ASTERISCOS DE ACORDO COM
        // UM NUMERO N DE LINHAS INFORMADO PELO USUARIO
        /*
         * N = 3
         *
         * *
         * * *
         */
        // 1 linha - 1 asterisco
        int linha = 1;
        while (linha <= 5) { // PARA CADA LINHA

            // PRINTAR A QUANTIDADE DE ASTERISCOS DESSA LINHA
            int cont = 0;
            while (cont < linha) {
                System.out.print("*");
                cont++;
            }
            System.out.println();
            linha++;
        }

        int linha1 = 1;
        while (linha1 <= 8) { // PARA CADA LINHA

            // PRINTAR A QUANTIDADE DE ASTERISCOS DESSA LINHA
            int cont = 0;
            while (cont < linha1) {
                System.out.print("*");
                cont++;
            }
            System.out.println();
            linha1++;
        }

        sc.close();

    }
}