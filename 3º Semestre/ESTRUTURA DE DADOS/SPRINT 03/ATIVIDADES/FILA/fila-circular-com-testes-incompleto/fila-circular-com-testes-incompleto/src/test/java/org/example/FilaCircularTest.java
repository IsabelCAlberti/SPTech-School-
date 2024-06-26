package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilaCircularTest {
    @Test
    public void isFullQuandoFilaCheiaEquandoFilaNaoCheia() {
        FilaCircular filaTest = new FilaCircular(5);
        filaTest.insert("a");
        assertFalse(filaTest.isFull());
        filaTest.insert("b");
        assertFalse(filaTest.isFull());
        filaTest.insert("c");
        assertFalse(filaTest.isFull());
        filaTest.insert("d");
        assertFalse(filaTest.isFull());
        filaTest.insert("e");
        assertTrue(filaTest.isFull());
    }

    @Test
    public void isEmptyQuandoFilaVaziaEquandoFilaNaoVazia() {
        FilaCircular filaTest = new FilaCircular(8);
        assertTrue(filaTest.isEmpty());
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        filaTest.insert("d");
        filaTest.insert("e");
        filaTest.insert("f");
        filaTest.insert("g");
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertFalse(filaTest.isEmpty());
        filaTest.poll();
        assertTrue(filaTest.isEmpty());
    }

    @Test
    public void peekQuandoFilaRetornaPrimeiroElementoValidandoTamanhoInicioEfim() {
        FilaCircular filaTest = new FilaCircular(3);
        filaTest.insert("a");
        filaTest.insert("b");
        assertEquals(2, filaTest.getFim()); // fim deve ser 2 após duas inserções
        filaTest.insert("c");
        assertEquals(3, filaTest.getTamanho()); // tamanho deve ser 3 após três inserções
        assertEquals(0, filaTest.getFim()); // fim deve voltar para 0 após a terceira inserção (comportamento circular)
        assertEquals("a", filaTest.peek()); // peek deve retornar "a", que é o primeiro elemento
        assertEquals(0, filaTest.getInicio()); // inicio deve ser 0, pois não houve remoções
    }

    @Test
    public void pollQuandoFilaRetornaPrimeiroElementoValidandoTamanhoInicioEfim() {
        FilaCircular filaTest = new FilaCircular(5);
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        filaTest.insert("d");
        assertEquals(4, filaTest.getTamanho());
        assertEquals(4, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());
        assertEquals("a", filaTest.poll());
        assertEquals(3, filaTest.getTamanho());
        assertEquals(1, filaTest.getInicio());
    }

    @Test
    public void pollQuandoChamadoPelaSegundaVezRetornaPrimeiroElementoValidandoTamanhoInicioEfim() {
        FilaCircular filaTest = new FilaCircular(5);
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        filaTest.insert("d");
        assertEquals(4, filaTest.getTamanho());
        assertEquals(4, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());
        assertEquals("a", filaTest.poll());
        assertEquals(3, filaTest.getTamanho());
        assertEquals(1, filaTest.getInicio());
        assertEquals("b", filaTest.poll());
        assertEquals(2, filaTest.getTamanho());
        assertEquals(2, filaTest.getInicio());
    }

    @Test
    public void insertLancaIllegalStateExceptionQuandoFilaCheiaValidandoTamanhoInicioEfim() {
        FilaCircular filaTest = new FilaCircular(6);
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        assertEquals(3, filaTest.getTamanho());
        assertEquals(3, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());
        filaTest.insert("d");
        filaTest.insert("e");
        filaTest.insert("f");
        assertEquals(6, filaTest.getTamanho());
        assertEquals(0, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());

        assertThrows(IllegalStateException.class, () -> filaTest.insert("g"));
    }

    @Test
    public void insertValidandoTamanhoInicioFimEPrimeiroElemento() {
        FilaCircular filaTest = new FilaCircular(6);
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        assertEquals(3, filaTest.getTamanho());
        assertEquals(3, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());
        filaTest.insert("d");
        filaTest.insert("e");
        filaTest.insert("f");
        assertEquals(6, filaTest.getTamanho());
        assertEquals(0, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());
        assertEquals("a", filaTest.peek());
    }

    @Test
    public void insertValidandoTamanhoInicioFimQuandoFilaCheiaEvazia() {
        FilaCircular filaTest = new FilaCircular(4);
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        filaTest.insert("d");
        assertEquals(4, filaTest.getTamanho());
        assertEquals(0, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());
        filaTest.poll();
        filaTest.poll();
        filaTest.poll();
        filaTest.poll();
        assertEquals(0, filaTest.getTamanho());
        assertEquals(0, filaTest.getFim());
        assertEquals(0, filaTest.getInicio());
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        filaTest.insert("d");
        filaTest.poll();
        assertEquals(3, filaTest.getTamanho());
        assertEquals(0, filaTest.getFim());
        assertEquals(1, filaTest.getInicio());
    }

    @Test
    public void getFila() {
        String[] vetor = {"a","b","c"};

        FilaCircular filaTest = new FilaCircular(3);
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");

        String[] vetorGetFila = filaTest.getFila();

        for (int i = 0; i < vetor.length; i++){
            assertEquals(vetor[i], vetorGetFila[i]);
        }
    }

    @Test
    public void getFila1() {
        String[] vetor = {"2","3","4"};

        FilaCircular filaTest = new FilaCircular(3);
        filaTest.insert("1");
        filaTest.insert("2");
        filaTest.insert("3");

        filaTest.poll();
        filaTest.insert("4");

        String[] vetorGetFila = filaTest.getFila();

        for (int i = 0; i < vetor.length; i++){
            assertEquals(vetor[i], vetorGetFila[i]);
        }
    }




}
