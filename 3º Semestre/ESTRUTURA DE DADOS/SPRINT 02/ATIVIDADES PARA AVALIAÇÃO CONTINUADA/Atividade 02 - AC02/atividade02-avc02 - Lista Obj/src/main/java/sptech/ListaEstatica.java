package sptech;

public class ListaEstatica {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    private int[] vetor;

    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento
    private int nroElem; // ocupação do vetor, ou seja, quanto do vetor ja foi preenchido

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem

    public ListaEstatica(int tam) {
        vetor = new int[tam];
        this.nroElem = 0;
    }

    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();
    public void adiciona(int elemento) {
        if (nroElem < vetor.length) {
            vetor[nroElem++] = elemento;
        } else {
            throw new IllegalStateException();
        }
    }

    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou
    public int busca(int elementoProcurado) {
        //percorro somente a quantidade de elementos que estão no vetor e não o vetor inteiro
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoProcurado) {
                System.out.println("\nElemento encontrado no índice: " + i);
                return i; // retornando o indice, se fosse o return vetor[i] seria o elemento
            }
        }
        return -1;
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true
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

    // 07) Método removeElemento
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento
    public boolean removeElemento(int elemento) {
        return removePeloIndice(busca(elemento)); //metodo chamando outro metodo - composição
    }

    // 08 Método exibe:
    // Exibe os elementos da lista
    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }

    // 09 Método substitui:
    // Este método deve ser do tipo boolean
    // deve receber 2 argumentos: o valor antigo e o valor novo (ambos inteiros)
    // deve procurar o valor antigo na lista e, se encontrar, deve substituí-lo pelo valor novo e retornar true
    // Se o valor antigo não for encontrado, deve exibir uma mensagem de “valor não encontrado” e retornar false
    public boolean substituir(int elemento, int elementoNovo) {
        int indiceSubstituir = busca(elemento);
        if (indiceSubstituir == -1) {
            return false;
        } else {
            vetor[indiceSubstituir] = elementoNovo;
            return true;
        }
    }

    // 10 Método contaOcorrencias:
    // Este método deve ser do tipo inteiro
    // deve receber um valor inteiro.
    // deve “contar” quantas vezes o valor recebido como argumento aparece na lista ou seja quantas vezes tem de igual na lista
    // deve retornar essa quantidade.
    public int contaOcorrencias(int elementoRecebido) {
        int contador = 0;

        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoRecebido) {
                contador++;
            }
        }
        return contador;
    }

    // 11 Método adicionaNoInicio:
    // deve ser do tipo boolean
    // deve receber um valor inteiro que será adicionado no início da lista.
    // deve exibir a mensagem “Lista cheia” se a lista estiver cheia.
    // Senão, deve inserir o valor recebido como argumento no início da lista, no índice zero,
    // deslocando para frente os valores que já estão na lista.
    // Dica: para “abrir o espaço para inserir no início”, faça um for que percorre a lista ao contrário
    // para ir fazendo a posição seguinte ir recebendo o valor da posição atual.

    public boolean adicionaNoInicio(int elemento) {
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

    //Métodos getVetor e getNroElem
    //São usados nos testes
    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor;
    }
}
