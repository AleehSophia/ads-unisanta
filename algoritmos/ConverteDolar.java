import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
* Exercicio 4.4.2 - Lógica de programacao.
* A partir do fornecimento do preço de um determinado produto em
* dólar, e do valor da cotação do dólar do dia, crie um algoritmo capaz de
* apresentar o valor do respectivo produto em reais.
*/
public class ConverteDolar {

    public static void main(String[] args) {

        ConverteDolar converteDolar = new ConverteDolar();
        converteDolar.conversorDolar();
    }

    public void conversorDolar() {
//      Formata decimal com duas casas
        DecimalFormat df = new DecimalFormat("0.00");
//      Nao permite arredondar
        df.setRoundingMode(RoundingMode.DOWN);
        Scanner sc = new Scanner(System.in);

        double produto;
        double dolarHoje;
        double reais;

        System.out.println("Insira o valor do produto em dolar: ");
        produto = sc.nextDouble();
        System.out.println("Insira o valor da cotacao do dolar hoje: ");
        dolarHoje = sc.nextDouble();

        reais = produto * dolarHoje;
        System.out.println("O produto de $"
                + df.format(produto)
                + " com a cotacao do dolar no valor de R$"
                + df.format(dolarHoje)
                + ". É convertido em R$"
                + df.format(reais)
                + ".");
    }
}