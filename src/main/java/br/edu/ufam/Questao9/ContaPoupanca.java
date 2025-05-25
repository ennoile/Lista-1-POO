package br.edu.ufam.Questao9;

public class ContaPoupanca extends Conta {
    private float diaRendimento;

    public float getdiaRendmento() {
        return diaRendimento;
    }

    public void setDiaRendimento(float diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo() {
        setSaldo((diaRendimento / 100 * getSaldo()) + getSaldo());
    }
}
