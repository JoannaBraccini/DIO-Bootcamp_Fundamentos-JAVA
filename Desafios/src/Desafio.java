import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        // ler valores de entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // atribuir alíquota de 5% mediante salário:
            valorImposto = 0.05F * valorSalario;
            // TODO: condições para 10% e 15%
        } else if (valorSalario > 1100 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F + valorSalario;
        }
        // calcular e imprimir saída com 2 casas decimais
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

        leitorDeEntradas.close();
    }
}