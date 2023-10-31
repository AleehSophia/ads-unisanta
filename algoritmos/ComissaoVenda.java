import java.util.Scanner;

/*
* Exercicio 4.4.4 - Logica de programacao.
* Considerando que um vendedor receberá uma comissão fixa de 3%
* sobre o valor de cada produto vendido, elabore um algoritmo onde, a partir
* do fornecimento do valor do produto vendido, seja apresentado na tela o valor
* da devida comissão.
*/
public class ComissaoVenda {

    public static void main(String[] args) {

        ComissaoVenda venda = new ComissaoVenda();
        venda.comissao();
    }

    public void comissao() {

        Scanner sc = new Scanner(System.in);

        double venda;
        double porcentagem;
        double totalComissao;

        porcentagem = 0.03;

        System.out.println("Insira o valor do produto.");
        venda = sc.nextDouble();

        totalComissao = venda * porcentagem;

        System.out.println("O valor da comissao sera de: R$" + totalComissao);
    }
}