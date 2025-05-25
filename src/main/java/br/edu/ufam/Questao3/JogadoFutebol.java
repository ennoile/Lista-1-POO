/* 03) Crie uma classe para representar um jogador de futebol, com os atributos nome, posição,
data de nascimento, nacionalidade, altura e peso. Crie os métodos públicos necessários para
sets e gets e também um método para imprimir todos os dados do jogador. Crie um método para
calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se
aposentar. Para isso, considere que os jogadores da posição de defesa se aposentam em média
aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35 (1,0 ponto).*/
package br.edu.ufam.Questao3;

import java.time.LocalDate;

public class JogadoFutebol {
    private String nome;
    private String posicao;
    private String nacionalidade;
    private float altura;
    private float peso;
    private LocalDate data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Data de Nascimento: " + getData());
    }

    public int calcularIdade() {
        int idade = LocalDate.now().getYear() - getData().getYear();
        return idade;
    }

    public void aposentadoria() {
        int tempoRestante = 0;

        if ("Defesa".equals(getPosicao())) {
            tempoRestante = 40 - calcularIdade();
        } else if ("Meio-Campo".equals(getPosicao())) {
            tempoRestante = 38 - calcularIdade();
        } else {
            tempoRestante = 35 - calcularIdade();
        }

        System.out.println("Restam " + tempoRestante + "Anos para o " + getNome() + " se aposentar.");
    }
}