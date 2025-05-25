//Uma academia mantém registro de seus alunos armazenando nome, idade, peso e altura. A
//academia faz um desconto especial para menores de idade, portanto, é necessário saber
//distinguir entre um aluno maior e menor. Além disso, a academia também tem interesse em
//acompanhar o desempenho de seus alunos, por isso, ela também necessita conhecer o índice
//de massa corporal (IMC) deles, sendo que o IMC = peso / altura ^ 2

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }   

    public double calculaIMC(){
        return peso/(altura*altura);
    }

    public boolean menorDeIdade(){
        return idade < 18;
    }

    public void exibirInformacoes(){
        System.out.println("\nNome do aluno: " + nome);
        System.out.println("Idade: " + idade + (menorDeIdade() ? "(menor de idade)" : "(maior de idade)"));
        System.out.printf("Imc: %.2f\n", calculaIMC());
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        System.out.println("Insira o nome do aluno: ");
        String nome = ler.nextLine();

        System.out.println("Insira a idade: ");
        int idade = ler.nextInt();

        System.out.println("Insira o peso: ");
        double peso = ler.nextDouble();

        System.out.println("Insira a altura: ");
        double altura = ler.nextDouble();

        Aluno aluno = new Aluno(nome, idade, peso, altura);
        aluno.exibirInformacoes();

        ler.close();
    }
    
}
