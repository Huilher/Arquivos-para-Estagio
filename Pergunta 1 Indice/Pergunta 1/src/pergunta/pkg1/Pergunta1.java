
package pergunta.pkg1;


public class Pergunta1 {


    public static void main(String[] args) {
  int INDICE = 13, SOMA = 0;

        for (int K = 1; K <= INDICE; K++) {
            SOMA += K;
            
            System.out.println("Iteração " + K + ": K = " + K + ", SOMA = " + (SOMA - K) + " + " + K + " = " + SOMA);
        }

        System.out.println("\nO valor final da variável SOMA é: " + SOMA);
    }
    
}
