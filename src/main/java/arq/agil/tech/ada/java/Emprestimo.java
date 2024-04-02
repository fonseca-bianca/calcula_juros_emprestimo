package arq.agil.tech.ada.java;


import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorEmprestimo;
        double valorParcela;
        double juros;
        double totalApagarComJuros;
        int quantidadeParcelas;

        System.out.print("Qual o valor do empréstimo? R$");
        valorEmprestimo = input.nextDouble();

        System.out.print("Em quantas vezes deseja parcelar o empréstimo? ");
        quantidadeParcelas = input.nextInt();

        juros = (valorEmprestimo * 20) / 100;
        totalApagarComJuros = valorEmprestimo + juros;
        valorParcela = totalApagarComJuros / quantidadeParcelas;

        System.out.printf("O valor total do empréstimo com juros é de R$%.2f\n", totalApagarComJuros);
        System.out.printf("O valor de cada parcela com juros é de R$%.2f\n", valorParcela);
    }
}