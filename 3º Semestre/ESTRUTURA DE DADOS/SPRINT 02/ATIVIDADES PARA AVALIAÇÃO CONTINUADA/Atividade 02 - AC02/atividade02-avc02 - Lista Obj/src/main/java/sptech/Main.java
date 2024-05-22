package sptech;

public class Main {
    public static void main(String[] args) {
    ListaEstatica lista = new ListaEstatica(7);

    lista.adiciona(10);
    lista.adiciona(20);
    lista.adiciona(30);
    lista.adiciona(40);
    lista.adiciona(50);
    lista.adiciona(60);
    lista.adiciona(10);

        System.out.println("Buscando elemento 30 pelo indice: "+ lista.busca(30));

        System.out.println("Elemento removido pelo índice: " + lista.removePeloIndice(2));

        System.out.println("Elemento removido: " + lista.removeElemento(50));

        System.out.println("Elemento 60 substituído por 101: " + lista.substituir(60, 101));

        System.out.println("Ocorrências de 10: " + lista.contaOcorrencias(10));

        System.out.println("Adicionando elemento no indice inicial " + lista.adicionaNoInicio(10));

    lista.exibe();

    ListaObj<String> listaNome = new ListaObj(7);

    listaNome.adiciona("Maria");
    listaNome.adiciona("João");

    listaNome.exibe();


    }
}