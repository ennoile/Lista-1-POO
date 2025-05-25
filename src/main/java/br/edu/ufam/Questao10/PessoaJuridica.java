public class PessoaJuridica extends Contribuinte{
    
    private double rendaBruta;

    public PessoaJuridica(String nome, String cnpj, double rendaBruta){
        super(nome, cnpj);
        this.rendaBruta = rendaBruta;
    }

    @Override
    public double calcularImposto(){
        return rendaBruta * 0.10;
    }

    @Override
    public void exibirImposto() {
        super.exibirImposto();
        System.out.printf("Renda Bruta: R$ %.2f\n", rendaBruta);
        System.out.println("---------------------------");
    }
}
