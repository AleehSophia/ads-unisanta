import java.util.Scanner;

/*
* Exercicio 9.2.5 - Logica de programacao.
* Adapte o algoritmo anterior de modo que, após todas as entradas, e a partir da digitação de uma determinada nota
* a ser buscada, seja exibido na tela o total de estudantes que obtiveram especificamente a nota digitada. Caso
* não haja nenhum caso, exiba na tela um aviso ao usuário.
*/
public class ExercicioCinco {
    public static void main(String[] args) {
        buscaMedia();
    }

    public static void buscaMedia() {

        Scanner sc = new Scanner(System.in);

        double[] mediaAlunos = new double[30];
        double media;
        double buscador;

        int count = 0;
        do {
            media = sc.nextInt();
            if (media >= 0 && media <= 10) {
                mediaAlunos[count] = media;
                count++;
            } else {
                System.out.println("Media inválida");
            }
        } while (count < 30);

        int notaMatch = 0;
        System.out.println("Insira a nota que deseja buscar.");
        buscador = sc.nextInt();
        for (int j = 0; j < 30; j++) {
            if (mediaAlunos[j] == buscador) {
                notaMatch++;
            }
        }
        if (notaMatch == 0) {
            System.out.printf("Nenhuma nota %s encontrada.", buscador);
        } else {
            System.out.printf("Foram encontrados %d alunos com a nota %s.", notaMatch, buscador);
        }
    }
}