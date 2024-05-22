package org.example;

public class Exercicio03 {
    public static void main(String[] args) {
        /*Elabore um programa em Java que
        leia os valores de uma matriz 3x3 de inteiros.
        Crie um vetor de 3 elementos,
        contendo o total de cada coluna
        e exiba os valores desse vetor.
Exemplo: Suponha a matriz abaixo com os valores de 1 a 9 inseridos:
1 2 3
4 5 6
7 8 9
O vetor contendo os totais de cada coluna seria:
12 15 18
*/
        int[][] matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        exibirVetor(somaColunaMatriz(matriz));
    }

    //somar coluna da matriz e adicionar os valores ao vetor
    public static int[] somaColunaMatriz(int[][] matriz) {
        int[] vetor = new int[3];
        for (int iColuna = 0; iColuna < matriz[0].length; iColuna++) {
            for (int iLinha = 0; iLinha < matriz.length; iLinha++) {
                vetor[iColuna] += matriz[iLinha][iColuna];
            }
        }
        return vetor;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println(); //Pular linha
        }
    }

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf(vetor[i] + "\t|\t");
        }
    }
}
