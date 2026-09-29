
/*
Nota válida
Leia uma nota de 0 a 10.
Enquanto a nota estiver fora do intervalo permitido, solicite uma nova nota. 
Quando uma nota válida for informada, classifique-a como:
    • APROVADO, se nota maior ou igual a 6;
    • REPROVADO, caso contrário.
*/
import java.util.Scanner;

public class L03Ex10F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota;

        System.out.print("Digite sua Nota de 0 a 10: ");
        nota = sc.nextFloat();

        for (; nota < 0 || nota > 10;) {
            System.out.print("Nota inválida. \nDigite sua nota navamente: ");
            nota = sc.nextFloat();

        }

        if (nota >= 6) {
            System.out.println("APROVADO");

        } else {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}