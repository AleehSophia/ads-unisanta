import java.util.Scanner;

/* Exercicio 4.4.3 - Logica de programacao.
* Admitindo que a primeira nota digitada pelo usuário tenha peso 1 e a
* segunda nota tenha peso 2, produza um algoritmo capaz de calcular a média
* ponderada de um(a) determinado(a) estudante.
*/
public class MediaPonderada {
    public static void main(String[] args) {
        MediaPonderada mediaPonderada = new MediaPonderada();
        mediaPonderada.media();
    }

    public void media() {

        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        System.out.println("Insira sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        nota2 = sc.nextDouble();

//      multiplica a nota pelo peso e atribui na variavel
        nota1 *= 1;
        nota2 *= 2;

//      calcula a media ponderada(soma das notas pela soma dos pesos)
        media = (nota1 + nota2) / 3;
        System.out.printf("Sua média é: %.1f", media);
    }
}