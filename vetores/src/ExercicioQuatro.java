import java.util.Scanner;

/*
* Exercicio 9.2.4 - Logica de programacao.
* Utilizando a estrutura de controle de repetição faça/enquanto em algum aspecto da sua solução,
* elabore um algoritmo que receba via teclado e armazene as médias (válidas) de 30 estudantes.
* Concluídas as entradas, e considerando que a média a ser obtida em um determinado curso é 6,
* sua solução deverá apresentar na tela a quantidade total de estudantes aprovados(as) e de exame.
*/
public class ExercicioQuatro {
    public static void main(String[] args) {
        media();
    }

    public static void media() {

        Scanner sc = new Scanner(System.in);

        double[] mediaAlunos = new double[30];
        double media;

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

        int alunosAprovados = 0;
        int alunosExame = 0;
        for (int j = 0; j < 30; j++) {
            if (mediaAlunos[j] >= 6) {
                 alunosAprovados++;
            }
            else {
                alunosExame++;
            }
        }
        System.out.printf("Total de estudantes aprovados: %d. Total de estudantes em exame: %d", alunosAprovados, alunosExame);
    }
}