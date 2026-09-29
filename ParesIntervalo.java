/*
Pares de um intervalo
Leia um número inteiro positivo n e apresente todos os números pares existentes entre 1 e n.
Ao final, informe também quantos números pares foram encontrados.
*/
import java.util.Scanner;

public class ParesIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo (n): ");
        int n = scanner.nextInt();
        
        int i = 1;         // Contador para percorrer o intervalo
        int contadorPares = 0; // Guardará a quantidade de números pares
        
        System.out.println("Números pares encontrados: ");
        
        while (i <= n) {
            // Verifica se o número atual é par usando o operador de resto (%)
            if (i % 2 == 0) {
                System.out.print(i + " ");
                contadorPares++; // Incrementa a quantidade de pares
            }
            i++; // Avança para o próximo número do intervalo
        }
        
        System.out.println("\nTotal de números pares encontrados: " + contadorPares);
        
        scanner.close();
    }
}
