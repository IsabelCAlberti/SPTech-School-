package org.example;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        /*5. Elaborar um método quadradoMagico, que recebe uma matriz de inteiros e devolve true se ela
for um quadrado mágico e false caso contrário. Para que seja considerado um quadrado
mágico, a soma dos elementos de cada linha deve ser a mesma, e deve ser igual à soma dos
elementos de cada coluna, e igual à soma dos elementos de cada diagonal.
No main, leia os valores de uma matriz 3x3 e chame o método quadradoMagico para verificar
se essa matriz é um quadrado mágico.
Por exemplo, a matriz abaixo é considerada um quadrado mágico, pois a soma de cada linha
é igual a 15, assim como a soma de cada coluna e de cada diagonal:
2 7 6
9 5 1
4 3 8
*/
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

        // Verifica se a matriz é um quadrado mágico
        boolean ehQuadradoMagico = quadradoMagico(matriz);

        // Exibe o resultado
        if (ehQuadradoMagico) {
            System.out.println("A matriz é um quadrado mágico!");
        } else {
            System.out.println("A matriz não é um quadrado mágico.");
        }
    }

    // Método para verificar se a matriz é um quadrado mágico
    private static boolean quadradoMagico(int[][] matriz) {
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        return somaDiagonalPrincipal == somaDiagonalSecundaria;
    }
}
