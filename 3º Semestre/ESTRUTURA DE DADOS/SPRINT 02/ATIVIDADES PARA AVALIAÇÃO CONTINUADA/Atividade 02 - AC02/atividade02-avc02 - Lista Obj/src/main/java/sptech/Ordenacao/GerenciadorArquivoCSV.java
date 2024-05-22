package sptech.Ordenacao;

import sptech.ListaObj;
import sptech.Ordenacao.Estadio;

import java.io.*;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class GerenciadorArquivoCSV {
    //Arquivos *.csv são simplesmente arquivos-texto cujos campos possuem um delimitador
// (normalmente vírgula ou ponto-e-vírgula) e que o Excel "sabe" como ler.
// Se você que formatar as colunas, é necessário gerar um arquivo *.xls, nativo do Excel. Para fazer isto,
// eu recomendo as APIs [url=http://jexcelapi.sourceforge.net/]JExcelApi[/url] ou [url=http://poi.apache.org/]Apache POI[/url].
    public static void gravaArquivoCsv(ListaObj<Estadio> lista, String nomeArq) {
        FileWriter arquivo = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

// Bloco try-catch para abrir o arquivo
        try {
            arquivo = new FileWriter(nomeArq);
            saida = new Formatter(arquivo);
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1); // emcerra a aplicação // 1 indica erro
        }

// Bloco try-catch para gravar o arquivo
        try {
            for (int i = 0; i < lista.getTamanho(); i++) {

//Recupere um elemento da lista e formate aqui:
                Estadio estadio = lista.getElemento(i);
                saida.format("%d;%s;%.0f;%s;%s;%.2f\n",
                        estadio.getId(),
                        estadio.getNome(),
                        estadio.getLotacao(),
                        estadio.getTipoCobertura(),
                        estadio.getTipoEvento(),
                        estadio.getValorDoEstadio());
            }
        } catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            deuRuim = true;
        } finally {
            saida.close();  // fecha o arquivo para não ocupar memória
            try {
                arquivo.close(); // fecha o arquivo
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    /*public static void leArquivoCsv(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null; // para ler dados do arquivo
        Boolean deuRuim = false;

        nomeArq += ".csv"; // acrescenta a extensão .csv ao nome do arquivo

// Bloco try-catch para abrir o arquivo
        try {
            arq = new FileReader(nomeArq); // lê arquivo que tenha .csv
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo nao encontrado");
            System.exit(1);
        }
// Bloco try-catch para ler o arquivo
        try {
            //Leia e formate a saída no console aqui:
            System.out.println("---------------------------------------");
            System.out.printf("|%-4s %-15s %-10s %-5s|\n", "ID", "NOME", "PORTE", "PESO");
            System.out.println("_______________________________________\n");
            while (entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                double peso = entrada.nextDouble();
                System.out.println("----------------------------------------------");
                System.out.printf("| %04d | %-15s | %-10s |%5.1f |\n", id, nome, porte, peso);
                System.out.println("______________________________________________");
            }
        } catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        } catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        } finally {
            entrada.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }*/
}

