package org.example;

import java.util.Scanner;

public class Exercicio02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

/*Elabore um método exibeMatriz, que recebe uma matriz de inteiros e exibe seus valores em
forma de matriz. Escreva no main o código que leia os valores de duas matrizes 2x3 de
inteiros. Depois calcule a soma dessas duas matrizes, armazenando a soma em uma terceira
matriz e exiba os valores dessa terceira matriz (chame o método exibeMatriz para exibir a
matriz).*/


        // Cria duas matrizes 2x3 de inteiros
            int[][] matriz1 = new int[2][3];
            int[][] matriz2 = new int[2][3];
            int[][] matrizSoma = new int[2][3];

            // Preenche a primeira matriz com valores fornecidos pelo usuário
            System.out.println("Digite os valores para a primeira matriz 2x3:");
            preencherMatriz(matriz1);

            // Preenche a segunda matriz com valores fornecidos pelo usuário
            System.out.println("Digite os valores para a segunda matriz 2x3:");
            preencherMatriz(matriz2);

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
        private static void preencherMatriz(int[][] matriz) {
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

