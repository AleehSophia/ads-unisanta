/*
* Exercicio 8.3.5 - Logica de programacao.
* Nesta oportunidade fazendo uso da estrutura de controle de repetição
* faça/enquanto, apresente na tela todos os números pares existentes
* entre 400 e 800, inclusive estes.
*/
public class ExercicioOnze {
    public static void main(String[] args) {

        int n = 400;

        do {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        } while (n <= 800);
    }
}