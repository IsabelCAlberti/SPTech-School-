package org.example;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite o valor de n
        System.out.print("Digite um número (maior que 1 e menor que 6): ");
        int n = scanner.nextInt();

        // Valida se n está dentro do intervalo permitido
        if (n <= 1 || n >= 6) {
            System.out.println("Número inválido. O valor de n deve ser maior que 1 e menor que 6.");
            return;
        }

        // Cria uma matriz n x n de inteiros
        int[][] matriz = new int[n][n];

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores para a matriz " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma dos elementos da diagonal principal
        int somaPrincipal = 0;
        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
        }

        // Calcula a soma dos elementos da diagonal secundária
        int somaSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaSecundaria += matriz[i][n - 1 - i];
        }

        // Exibe os resultados
        System.out.println("Os elementos da diagonal principal são: " + somaPrincipal);
        System.out.println("Os elementos da diagonal secundária são: " + somaSecundaria);
    }
}
