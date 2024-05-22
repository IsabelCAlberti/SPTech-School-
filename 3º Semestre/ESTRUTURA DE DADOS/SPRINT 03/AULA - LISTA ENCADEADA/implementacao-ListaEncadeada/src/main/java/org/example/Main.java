package org.example;

public class Main {
    public static void main(String[] args) {

        ListaLigada listaEncadeada = new ListaLigada();

        listaEncadeada.insereNode(10);
        listaEncadeada.insereNode(20);
        listaEncadeada.insereNode(30);
        listaEncadeada.insereNode(40);
        listaEncadeada.insereNode(50);

        System.out.println("Exibindo valores inseridos na listaEncadeada: ");
        listaEncadeada.exibe();
        System.out.println();


        System.out.println(listaEncadeada.buscaNode(3));
        System.out.println(listaEncadeada.buscaNode(30).getInfo() + "\n");

        listaEncadeada.removeNode(30);
        listaEncadeada.removeNode(6);

        System.out.println("Exibindo valores após remoção: ");
        listaEncadeada.exibe();

        System.out.println("\nTamanho da listaEncadeada: " + listaEncadeada.getTamanho());

    }
}
