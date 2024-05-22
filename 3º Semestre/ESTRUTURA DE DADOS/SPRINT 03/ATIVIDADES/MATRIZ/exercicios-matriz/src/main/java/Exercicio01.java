import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        for (int iLinha = 0; iLinha < matriz.length; iLinha++) {
            for (int iColuna = 0; iColuna < matriz[iLinha].length; iColuna++) {
                System.out.println("Digite o valor da posição [" + iLinha + "][" + iColuna + "]");
                matriz[iLinha][iColuna] = leitor.nextInt();
            }
            System.out.println();
        }
        //Exibindo a matriz
        exibirMatriz(matriz);
        System.out.println("\n");
    }

    //Transforme o exibir em método
    public static void exibirMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf(matriz[linha][coluna] + "\t|\t");
            }
            System.out.println(); //Pular linha
        }
    }
}