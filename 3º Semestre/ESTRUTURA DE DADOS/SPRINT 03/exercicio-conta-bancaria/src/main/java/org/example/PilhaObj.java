package school.sptech;

public class PilhaObj<T> {
    private T[] pilha;
    private int topo;

    public PilhaObj(int capacidade) {
        this.pilha = (T[]) new Object[capacidade];
        topo = -1;
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }

    public boolean isFull() {
        return this.topo == this.pilha.length - 1;
    }

    public void push(T info) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia");
        }
            this.pilha[++this.topo] = info;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return this.pilha[this.topo--];
    }

    public T peek() {
        return !this.isEmpty() ? this.pilha[this.topo] : null;
    }

    public void exibe() {
       if (this.isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            System.out.print("Pilha: ");

            for(int i = this.topo; i >= 0; --i) {
                Object var10001 = this.pilha[i];
                System.out.print(String.valueOf(var10001) + " ");
            }
    }
}
