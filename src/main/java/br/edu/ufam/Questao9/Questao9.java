package br.edu.ufam.Questao9;

public class Questao9 {

    public void execultar() {
        Conta conta = new Conta();
        float valorDeposito = 10;
        float valorSaque = 5;
        float valorSaqueMaior = 70;

        conta.setNomeCliente("Raquel");
        conta.setNumeroConta(123456);
        conta.setSaldo(20);

        System.out.println("\nDados Conta.\n");
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        conta.depositarConta(valorDeposito);
        System.out.println("Depositei: R$" + valorDeposito);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        conta.sacarSaldo(valorSaque);
        System.out.println("Saquei: R$" + valorSaque);
        System.out.println("Saldo atual: R$" + conta.getSaldo());
        conta.sacarSaldo(valorSaqueMaior);
        System.out.println("Tentei Sacar: R$" + valorSaqueMaior);
        System.out.println("Saldo atual: R$" + conta.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.setNomeCliente("Raquel");
        contaPoupanca.setNumeroConta(123456);
        contaPoupanca.setSaldo(20);
        contaPoupanca.setDiaRendimento(100);
        contaPoupanca.calcularNovoSaldo();
        System.out.println("\nDados Conta Poupança.\n");
        System.out.println("Minha taxa de rendimento foi de: " + contaPoupanca.getdiaRendmento() + "%");
        System.out.println("Saldo atual da minha conta poupança é: R$" + contaPoupanca.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.setNomeCliente("Raquel");
        contaEspecial.setNumeroConta(123456);
        contaEspecial.setSaldo(100);
        contaEspecial.setLimite(100);
        contaEspecial.sacarSaldo(50);
        System.out.println("\nDados Conta Especial.\n");
        System.out.println("o Saldo é:" + contaEspecial.getSaldo());
    }
}
