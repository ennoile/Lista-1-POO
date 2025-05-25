package br.edu.ufam.Questao5;

public class Questao5 {
    public void execultar(){

        Banco banco = new Banco();
        float valor = 50;
        
        banco.setNumeroCOnta(12345);
        banco.setNomeCliente("Rafaela");
        banco.setSaldoConta(20.f);
        System.out.println("Saldo Atual: "+banco.getSaldoConta());
        
        banco.depositarConta(valor);
        System.out.println("Foi depositado:"+valor);
        System.out.println("Saldo Atual: "+banco.getSaldoConta());
        
        valor=70;
        banco.sacarSaldo(valor);
        System.out.println("Foi sacado:"+valor);
        System.out.println("Saldo Atual: "+banco.getSaldoConta());
        
        valor=70;
        banco.sacarSaldo(valor);
        System.out.println("Saldo Atual: "+banco.getSaldoConta());

    }

}
