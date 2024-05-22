package org.example;

import java.util.NoSuchElementException;

public class FilaCircular {
    int tamanho, inicio, fim;
    String[] fila;

    // Construtor - Recebe a capacidade da fila (tamanho total do vetor)
    public FilaCircular(int capacidade) {
        // Cria o vetor para armazenar a fila e inicializa o tamanho
        this.fila = new String[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    // Método isEmpty() - Retorna true se a fila está vazia e false caso contrário
    public boolean isEmpty() {
        if(tamanho == 0){
            return true;
        } else {
            return false;
        }
    }

    // Método isFull() - Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        if(tamanho == fila.length){
            return true;
        } else {
            return false;
        }
    }

    // Método insert - Recebe informação a ser inserida na fila
        public void insert(String info) {
              if(isFull()){
                  throw new IllegalStateException("Fila cheia");
              } else {
                    fila[fim] = info;
                    fim = (fim + 1) % fila.length; // capacidade é o tamanho total da fila e tamanha é o que ja tem la dentro
                    tamanho++;
              }
        }

    // Método peek() - Retorna o primeiro da fila, sem remover
    public String peek() {
        return fila[inicio];
    }

    // Método poll() - Retorna o primeiro da fila, removendo-o
    public String poll() {
        String info = fila[inicio];

        if (!isEmpty()) {
            inicio = (inicio + 1) % fila.length; // Atualiza o início para o próximo elemento.
            tamanho--;
        }
        return info;
    }


    // Método exibe() - exibe os elementos da fila
    public void exibe() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
        } else {
            for (int i = inicio; i < inicio + tamanho; i++) {
                System.out.print(fila[i % fila.length] + " ");
            }
            System.out.println(); // Quebra de linha após exibir todos os elementos
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getInicio() {
        // Retorna o índice do início da fila
        return inicio;
    }

    public int getFim() {
        // Retorna o índice do fim da fila (o último elemento inserido)
        return fim;
    }

    // Cria um vetor e percorre a fila adicionando os elementos no vetor (
    // Retorna o vetor criado e não a fila
    // Esse método é equivalente ao exibe, mas em vez de exibir os elementos da fila na console,
    // copia os elementos da fila para um vetor, na ordem em que seriam exibidos
    public String[] getFila() {
        String[] vetor = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = fila[(inicio + i) % fila.length];
        }
        return vetor;
    }
}

