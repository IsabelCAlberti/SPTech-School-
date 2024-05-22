public class Teste {
    public static void main(String[] args) {
        int[] vetor = {40, 10, 20, 30, 40, 40, 60, 40};
        int x = 40;

        int resultado = metodoRecursivo(vetor , x , 0 );
        System.out.println("Resultado: " + resultado);
    }

    public static int metodoRecursivo(int[] vetor, int x, int index) {
        int contador;
        if (index == vetor.length) {
            return 0;
        }
        if (vetor[index] == x){
            contador = 1 ;
        }else {
            contador = 0 ;
        }
        return contador + metodoRecursivo(vetor, x, index + 1 );
    }
}
