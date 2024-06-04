package school.sptech;

public class FilaObj<T> {
    private T[] fila;
    private int tamanho;

     public FilaObj(int capacidade) {
        this.fila = new Object[capacidade];
        this.tamanho = 0;
    }


      public boolean isEmpty() {
        return this.tamanho == 0;
    }


    public boolean isFull() {
        return this.tamanho == fila.length;
    }

    public void insert(T info) {
        if (this.tamanho == this.fila.length) {
            throw new IllegalStateException("Fila cheia");
        }
            this.fila[this.tamanho++] = info;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return fila[0];
    }

    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        T info = fila[0];
        System.arraycopy(fila, 1, fila, 0, --tamanho);
        this.fila[this.tamanho] = null;
        return info;
    }

    public void exibe() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fila[i] + " ");
        }
    }
        public int getTamanho() {
        return this.tamanho;
    }

}


