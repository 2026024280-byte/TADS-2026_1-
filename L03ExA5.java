/*// precisa de um while dentro de outro while    

        // FACA UM PRORGRAMA QUE LEIA 2 VARIAVEIS (LINHAS E COLUNAS) E DESENHE UM RETANGULO
        // 3  5
        // * * * * * 
        // * * * * * 
        // * * * * *  */

import java.util.Scanner;

public class L03ExA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int i = 1;
        while (i <= linhas) {
            int j = 1;
            while (j <= colunas) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
