package sptech;

public class ListaObj <T> {

    private T[] vetor;
    private int nroElem; // ocupação do vetor, ou seja, quanto do vetor ja foi preenchido

    public ListaObj(int tam) {
        vetor = (T[]) new Object[tam];
        this.nroElem = 0;
    }

    public void adiciona(T elemento) {
        if (nroElem < vetor.length) {
            vetor[nroElem++] = elemento;
        } else {
            throw new IllegalStateException();
        }
    }

    public int busca(T elementoProcurado) {
        //percorro somente a quantidade de elementos que estão no vetor e não o vetor inteiro
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoProcurado) {
                System.out.println("\nElemento encontrado no índice: " + i);
                return i; // retornando o indice, se fosse o return vetor[i] seria o elemento
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("Índice inválido");
            return false;
        }
        //Começa no indice que quero remover e vai até o numero total de elementos -1
        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1]; // o elemento que está na posição i+1 vai para a posição i
        }
        nroElem--;
        System.out.println("\nElemento removido");
        return true;
    }

    public boolean removeElemento(T elemento) {
        return removePeloIndice(busca(elemento)); //metodo chamando outro metodo - composição
    }

    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }

    public boolean substituir(T elemento, T elementoNovo) {
        int indiceSubstituir = busca(elemento);
        if (indiceSubstituir == -1) {
            return false;
        } else {
            vetor[indiceSubstituir] = elementoNovo;
            return true;
        }
    }

    public int contaOcorrencias(T elementoRecebido) {
        int contador = 0;

        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoRecebido) {
                contador++;
            }
        }
        return contador;
    }

    public boolean adicionaNoInicio(T elemento) {
        if (nroElem == vetor.length) {
            System.out.println("Lista cheia");
            return false;
        }
        for (int i = nroElem; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = elemento;
        nroElem++;
        return true;
    }

    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return null;
        }
        return vetor[indice];
    }

    public int getNroElem() {
        return nroElem;
    }
    public T[] getVetor() {
        return vetor;
    }
    public int getTamanho() {
        return nroElem;
    }
}


