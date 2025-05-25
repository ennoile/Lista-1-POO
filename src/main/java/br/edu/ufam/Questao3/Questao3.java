package br.edu.ufam.Questao3;

import java.time.LocalDate;

public class Questao3 {
    public void executar() {
        JogadoFutebol jogador = new JogadoFutebol();

        jogador.setNome("rubens");
        jogador.setPosicao("Defesa");
        jogador.setNacionalidade("Brasileiro");
        jogador.setAltura(1.68f);
        jogador.setPeso(58);
        jogador.setData(LocalDate.of(2008, 12, 26));

        jogador.imprimirDados();
        int idade = jogador.calcularIdade();
        System.out.println("O Jagador tem: " + idade + " anos");

        jogador.aposentadoria();
    }
}
