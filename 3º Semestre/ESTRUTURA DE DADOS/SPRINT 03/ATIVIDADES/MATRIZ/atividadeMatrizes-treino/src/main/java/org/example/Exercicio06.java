package org.example;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

                // Solicita que o usuário digite o valor maxAluno
                int maxAluno;
                do {
                    System.out.print("Digite o número de alunos (entre 5 e 15): ");
                    maxAluno = scanner.nextInt();
                } while (maxAluno < 5 || maxAluno > 15);

                // Cria vetores e matriz
                String[] aluno = new String[maxAluno];
                double[][] notas = new double[maxAluno][2];
                double[] media = new double[2];
                double[] mediaAluno = new double[maxAluno];

                // Solicita que o usuário digite os nomes dos alunos
                for (int i = 0; i < maxAluno; i++) {
                    System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                    aluno[i] = scanner.next();
                }

                // Solicita que o usuário digite as notas dos alunos
                for (int i = 0; i < maxAluno; i++) {
                    System.out.print("Digite a nota AC1 do aluno " + aluno[i] + ": ");
                    notas[i][0] = scanner.nextDouble();
                    System.out.print("Digite a nota AC2 do aluno " + aluno[i] + ": ");
                    notas[i][1] = scanner.nextDouble();
                }

                // Calcula a média das notas da AC1 e AC2
                for (int i = 0; i < maxAluno; i++) {
                    media[0] += notas[i][0];
                    media[1] += notas[i][1];
                }
                media[0] /= maxAluno;
                media[1] /= maxAluno;

                // Calcula a média das notas de cada aluno
                for (int i = 0; i < maxAluno; i++) {
                    mediaAluno[i] = (notas[i][0] + notas[i][1]) / 2;
                }

                // Exibe os dados formatados
                System.out.println("\nRelatório de Notas:");
                System.out.printf("%-20s | %-10s | %-10s | %-10s%n", "Aluno", "AC1", "AC2", "Média Do Aluno");
                System.out.println("-----------------------------------------------");
                for (int i = 0; i < maxAluno; i++) {
                    System.out.printf("%-20s | %-10.2f | %-10.2f | %-10.2f%n", aluno[i], notas[i][0], notas[i][1], mediaAluno[i]);
                }
                System.out.println("-----------------------------------------------");
                System.out.printf("%-20s | %-10.2f | %-10.2f%n", "Média Geral", media[0], media[1]);
            }
        }
