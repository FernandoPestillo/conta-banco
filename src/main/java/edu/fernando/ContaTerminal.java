package edu.fernando;

import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) {
        cadastrarConta();
    }

    public static void cadastrarConta() {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite o número da Conta.");
        conta.numero = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Digite a agência da Conta.");
        conta.agencia = scanner.nextLine();

        System.out.println("Digite o nome do titular da Conta.");
        conta.nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da Conta.");
        conta.saldo = scanner.nextDouble();

        System.out.println("Olá ".concat(conta.nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(conta.agencia)
                .concat(", conta ").concat(String.valueOf(conta.numero))
                .concat(" e seu saldo R$").concat(String.format("%.2f", conta.saldo))
                .concat(" já está disponível para saque.")
        );
    }
}
