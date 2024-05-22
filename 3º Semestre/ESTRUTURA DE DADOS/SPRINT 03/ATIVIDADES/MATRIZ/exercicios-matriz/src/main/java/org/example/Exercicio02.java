package org.example;

public class Exercicio02 {
    public static void main(String[] args) {
        /*Elabore um método exibeMatriz,
        que recebe uma matriz de inteiros 
        e exibe seus valores em forma de matriz.
        
Escreva no main 
o código que leia os valores de duas matrizes 2x3 de inteiros.

Depois calcule a soma dessas duas matrizes,
armazenando a soma em uma terceira matriz

exiba os valores dessa terceira matriz
(chame o método exibeMatriz para exibir a matriz).*/

            int[][] matriz1 = new int[2][3];
            int[][] matriz2 = new int[2][3];

            matriz1[0][0] = 1;
            matriz1[0][1] = 2;
            matriz1[0][2] = 3;
            matriz1[1][0] = 4;
            matriz1[1][1] = 5;
            matriz1[1][2] = 6;

            matriz2[0][0] = 7;
            matriz2[0][1] = 8;
            matriz2[0][2] = 9;
            matriz2[1][0] = 10;
            matriz2[1][1] = 11;
            matriz2[1][2] = 12;

            int[][] matrizSoma = somaMatriz(matriz1, matriz2);
            exibirMatriz(matrizSoma);
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println(); //Pular linha
        }
    }

    public static int[][] somaMatriz(int[][] matriz1, int[][] matriz2) {
        int[][] matrizSoma = new int[2][3];
        for (int iLinha = 0; iLinha < matriz1.length; iLinha++) {
            for (int iColuna = 0; iColuna < matriz1[iLinha].length; iColuna++) {
                matrizSoma[iLinha][iColuna] = matriz1[iLinha][iColuna] + matriz2[iLinha][iColuna];
            }
        }
        return matrizSoma;
    }
}
