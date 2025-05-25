
package br.edu.ufam;

import java.util.Scanner;

import br.edu.ufam.Questao3.Questao3;
import br.edu.ufam.Questao5.Questao5;
import br.edu.ufam.Questao7.Questao7;
import br.edu.ufam.Questao9.Questao9;

/**
 *
 * @author Ennoile Martins
 */
public class Lista1POO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1- Questão3");
        System.out.println("2- Questão5");
        System.out.println("3- Questão7");
        System.out.println("4- Questão9");
        System.out.println("Informe a opção que deseja vizualizar!");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                Questao3 questao3 = new Questao3();
                questao3.executar();
                break;
            case 2:
                Questao5 questao5 = new Questao5();
                questao5.execultar();
            case 3:
                Questao7 questao7 = new Questao7();
                questao7.executar();
            case 4:
                Questao9 questao9 = new Questao9();
                questao9.execultar();
            default:
                System.out.println("Opção Inválida");
        }

        scanner.close();
    }
}
