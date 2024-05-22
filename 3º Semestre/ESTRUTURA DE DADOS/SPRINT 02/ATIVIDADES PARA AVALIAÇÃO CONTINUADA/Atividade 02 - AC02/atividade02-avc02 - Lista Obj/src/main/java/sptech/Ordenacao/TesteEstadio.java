package sptech.Ordenacao;

import sptech.ListaObj;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TesteEstadio {
    public static void main(String[] args) {
        //Criar objetos dessa classe e preencher um vetor de tamanho no mínimo 8.
        Estadio[] vetorLotacao = new Estadio[7];
        Estadio estadio = new Estadio(01, "Maracanã", 78.838, "aberto", "todos", 1.05000000000);
        Estadio estadio1 = new Estadio(02, "Wembley", 90.000, "Coberto", "todos", 5.985000000);
        Estadio estadio2 = new Estadio(03, "Santiago Bernabéu", 81.044, "Coberto", "todos", 3.250000000);
        Estadio estadio3 = new Estadio(04, "Allianz Arena", 75.000, "Coberto", "todos", 2.210000000);
        Estadio estadio4 = new Estadio(05, "Giuseppe Meazza", 75.923, "Aberto", "todos", 390.000000);
        Estadio estadio5 = new Estadio(06, "Signal Iduna Park", 81.365, "Aberto", "todos", null);
        Estadio estadio6 = new Estadio(07, "Camp Nou", 99.354, "Aberto", "todos", null);

        vetorLotacao[0] = estadio;
        vetorLotacao[1] = estadio1;
        vetorLotacao[2] = estadio3;
        vetorLotacao[3] = estadio4;
        vetorLotacao[4] = estadio5;
        vetorLotacao[5] = estadio6;
        vetorLotacao[6] = estadio2;

        ListaObj<Estadio> listaEstadio = new ListaObj<>(10);

        System.out.println(Arrays.stream(vetorLotacao).map(Estadio::getNome).collect(Collectors.toList()));
        GerenciadorArquivoCSV.gravaArquivoCsv(listaEstadio, "Estadios");
    }
}

