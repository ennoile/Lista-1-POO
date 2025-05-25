//Crie uma classe chamada Empresa capaz de armazenar os dados de uma empresa (nome,
//endereço, cidade, estado, cep e fone). Inclua um construtor sem argumentos e um que receba
//os dados como argumentos e os inicialize. Escreva duas funções, uma para fazer a interface
//com o usuário da entrada de dados, lerDados(), e outra para imprimir os dados, imprimirDados().
//Use a classe Empresa como base para criar a classe Restaurante. Inclua o tipo de comida, o
//preço médio de um prato, duas funções construtoras, a interface de entrada de dados, lerDados(),
//e a função que imprima os dados, imprimirDados(). Construa um programa para testar a classe
//Restaurante

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Restaurante restaurante =  new Restaurante();
        System.out.println("---Cadastro Restaurante---");
        restaurante.lerDados(scanner);

        System.out.println("\n---Dados do Restaurante---");
        restaurante.imprimirDados();

        scanner.close();
    }
}
