/*
 * Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e
o saldo atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem
sacar somente enquanto a conta possuir saldo positivo
 */

package br.edu.ufam.Questao5;

public class Banco {
    private int numeroConta;
    private String nomeCliente;
    private float saldoConta;

    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroCOnta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getNomeClinente(){
        return nomeCliente;
    }
    public void setNomeCliente(String nomeClinete){
        this.nomeCliente = nomeClinete;
    }

    public float getSaldoConta(){
        return saldoConta;
    }
    public void setSaldoConta(float saldoConta){
        this.saldoConta = saldoConta;
    }

    public void depositarConta(float valor){
        setSaldoConta(getSaldoConta() + valor);
    }
    public void sacarSaldo( float saque){
        if(saque > saldoConta){
            System.out.println("Saldo Insuficiente");
        }else{
            setSaldoConta(saldoConta - saque);
        }
    }

}
