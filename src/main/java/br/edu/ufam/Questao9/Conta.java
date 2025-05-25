/*
 * Conta Bancária - Elabore uma classe ContaBancaria com os seguintes atributos: nomeCliente, numConta, saldo e os 
seguintes métodos: sacar (o saldo não pode ficar negativo), depositar (1,0 ponto).
Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as seguintes
características:
 ContaPoupança: atributo diaRendimento. Método calcularNovoSaldo, recebe taxa de
rendimento da poupaça e atuliza o saldo.
 ContaEspecial: atributo limite. Sobreescreva o método sacar com a nova lógica
necessária.
Crie uma classe Teste que contenha a seguinte lógica:
 Criar contas
 Sacar um valor das contas
 Depositar
 Mostrar um novo salvo a partir de um rendimento
 Mostrar os dados Conta do Cliente
 */

package br.edu.ufam.Questao9;

public class Conta {
    private String nomeCliente;
    private int numeroConta;
    private float saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomecliente) {
        this.nomeCliente = nomecliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositarConta(float valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacarSaldo(float saque) {
        if (saque > getSaldo()) {
            System.out.println("Saldo Insuficiente");
        } else {
            setSaldo(getSaldo() - saque);
        }
    }

}
