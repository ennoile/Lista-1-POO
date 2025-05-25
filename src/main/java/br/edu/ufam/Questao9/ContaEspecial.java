package br.edu.ufam.Questao9;

public class ContaEspecial extends Conta {
    private float limite;

    public float getlimite(){
        return limite;
    }
    public void setLimite(float limite){
        this.limite = limite;
    }

    @Override
    public void sacarSaldo(float saque){
        if(saque > getSaldo() + getlimite()){
            System.out.println("Saldo Insuficiente");
        }else{
            setSaldo(getSaldo() - saque);
        }
    }
}
