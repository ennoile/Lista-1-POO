import java.util.Scanner;

public class Restaurante extends Empresa {
    private String tipoComida;
    private double valorComida;

    public Restaurante(){
        super(); 
        this.tipoComida = "";
        this.valorComida = 0.0;
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone, String tipoComida, double valorComida){
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.valorComida = valorComida;
    }

    @Override
    public void lerDados(Scanner scanner){
        super.lerDados(scanner);
        System.out.print("Tipo de comida: ");
        tipoComida = scanner.nextLine();
        System.out.print("Valor da comida: R$");
        valorComida = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("\n---Menu do Restaurante---");
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Valor da comida: " + valorComida);
    }
}
