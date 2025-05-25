public abstract class Contribuinte {
    protected String nome;
    protected String documento;

    public Contribuinte(String nome, String documento){
        this.nome = nome;
        this.documento = documento;
    }

    public abstract double calcularImposto();

    public void exibirImposto(){
        System.out.println("Nome: " + nome);
        System.out.println("Documento(CPF ou CNPJ): " + documento);
        System.out.printf("Imposto a ser pago: R$%.2f\n", calcularImposto());
    }
}
