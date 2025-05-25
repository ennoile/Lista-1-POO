public class PessoaFisica extends Contribuinte{
    
    private double rendaBruta;

    public PessoaFisica(String nome, String cpf, double rendaBruta){
        super(nome, cpf);
        this.rendaBruta = rendaBruta;
    }

    @Override
    public double calcularImposto(){
        if (rendaBruta <= 1400) return 0;
        else if (rendaBruta <= 2100) return rendaBruta * 0.10 - 100;
        else if (rendaBruta <= 2800) return rendaBruta * 0.15 - 270;
        else if (rendaBruta <= 3600) return rendaBruta * 0.25 - 500;
        else return rendaBruta * 0.30 - 700;
    }

    @Override
    public void exibirImposto(){
    super.exibirImposto();
    System.out.printf("Renda Bruta: R$ %.2f\n", rendaBruta);
    System.out.println("---------------------------");
    }
}
