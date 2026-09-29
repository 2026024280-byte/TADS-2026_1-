
/*
Cadastro de idade
Solicite a idade de uma pessoa. Uma idade válida deve estar entre 1 e 120 anos.
Enquanto o usuário informar uma idade inválida, solicite novamente. Ao final, 
informe a idade aceita e classifique a pessoa como:
    • criança: até 11 anos;
    • adolescente: 12 a 17 anos;
    • adulto: 18 a 59 anos;
    • idoso: 60 anos ou mais.
*/
import java.util.Scanner;

public class l03Ex11F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite uma idade entre 1 e 120 anos: ");
        idade = sc.nextInt();

        for (; idade <= 0 || idade > 120;) {
            System.out.print("Idade inválida. \nDigite novamente a idade: ");
            idade = sc.nextInt();
        }

        if (idade <= 11) {
            System.out.println("CRIANÇA: " + idade + " anos");

        } else if (idade <= 17) {
            System.out.println("ADOLESCENTE: " + idade + " anos");

        } else if (idade <= 59) {
            System.out.println("ADULTO: " + idade + " anos");

        } else if (idade >= 60) {
            System.out.println("IDOSO: " + idade + " anos");
        }
        sc.close();
    }
}