import java.util.Scanner;

public class Empresa {
    protected String nome;
    protected String endereco;
    protected String cidade;
    protected String estado;
    protected String cep;
    protected String fone;

    public Empresa(){
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.fone = "";
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep  = cep;
        this.fone = fone;
    }

    public void lerDados(Scanner scanner) {
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Cidade: ");
        cidade = scanner.nextLine();
        System.out.print("Estado: ");
        estado = scanner.nextLine();
        System.out.print("CEP: ");
        cep = scanner.nextLine();
        System.out.print("Telefone: ");
        fone = scanner.nextLine();
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Fone: " + fone);
    }
}
