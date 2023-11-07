/*
* Exercicio 7.3.2 - Logica de programacao.
* Desenvolva um algoritmo capaz de exibir na tela, em ordem
* decrescente, os números existentes entre 200 e 1, inclusive estes.
* Dica do professor Alexandre: lembre-se da importância da instrução responsável
* pelo controle do passo para a implementação deste algoritmo.
*/
public class SegundoExercicio {
    public static void main(String[] args) {

        int n = 1;

        for (int i = 200; i >= n; i--) {
            System.out.println(i);
        }
    }
}