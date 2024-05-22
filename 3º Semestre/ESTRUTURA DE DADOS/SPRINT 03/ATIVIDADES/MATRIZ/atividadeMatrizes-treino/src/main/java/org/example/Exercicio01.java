package org.example;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        /* Escreva um programa que cria uma matriz 2x3 de inteiros, solicite que o usuário digite os
valores para preencher a matriz, leia os valores, preencha a matriz e depois exiba os valores
em forma de matriz.*/

        Scanner scanner = new Scanner(System.in);

        // Cria duas matrizes 2x3 de inteiros
        int[][] matriz1 = new int[2][3];
        int[][] matriz2 = new int[2][3];
        int[][] matrizSoma = new int[2][3];

        // Preenche a primeira matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores para a primeira matriz 2x3:");
        preencherMatriz(scanner, matriz1);

        // Preenche a segunda matriz com valores fornecidos pelo usuário
        System.out.println("Digite os valores para a segunda matriz 2x3:");
        preencherMatriz(scanner, matriz2);

        // Calcula a soma das duas matrizes e armazena na terceira matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibe a soma das matrizes
        System.out.println("A soma das duas matrizes é:");
        exibeMatriz(matrizSoma);
    }

    // Método para preencher uma matriz com valores fornecidos pelo usuário
    private static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para exibir uma matriz
    private static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}