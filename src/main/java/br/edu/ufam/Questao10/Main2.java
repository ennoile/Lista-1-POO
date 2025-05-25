//10) Imposto de Renda - A receita Federal possui um cadastro dos contribuintes. Cada
//contribuinte possui CPF ou CNPJ e nome. Os contribuintes podem ser (1,0 ponto)

public class Main2 {
    public static void main (String[] args){
        Contribuinte[] contribuintes = new Contribuinte[6];

        contribuintes[0] = new PessoaFisica("Paulo", "234.345.678-00",1200);
        contribuintes[1] = new PessoaFisica("Ricardo", "294.125.648-00",2000);
        contribuintes[2] = new PessoaFisica("Ana", "224.345.608-00",3223);
        contribuintes[3] = new PessoaFisica("LTGA", "245.446.629-00",9000);
        contribuintes[4] = new PessoaFisica("RN-Modas", "274.155.671-00",14000);
        contribuintes[5] = new PessoaFisica("SAFIRA-AE", "217.675.038-00",5000);

        for (Contribuinte c : contribuintes){
            c.exibirImposto();
        }
    }
}
