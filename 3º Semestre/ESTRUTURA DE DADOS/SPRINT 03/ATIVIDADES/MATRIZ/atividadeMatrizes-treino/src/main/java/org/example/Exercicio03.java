package org.example;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria uma matriz 3x3 de inteiros
        int[][] matriz = new int[3][3];

        // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Cria um vetor para armazenar o total de cada coluna
        int[] totalColunas = new int[3];

        // Calcula o total de cada coluna
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                totalColunas[j] += matriz[i][j];
            }
        }

        // Exibe os valores do vetor de totais de colunas
        System.out.print("O vetor contendo os totais de cada coluna é: ");
        for (int j = 0; j < 3; j++) {
            System.out.print(totalColunas[j] + " ");
        }
    }
}
