package br.edu.ufam.Questao7;

public class Questao7 {
    public void executar() {
        int valor = 20;
        int segundo = Conversao.conversaoMinutoEmSegundo(valor);
        System.out.println(valor + " minutos tem: " + segundo + " Segundos");

        valor = 2;
        int minuto = Conversao.conversaoHoraEmMinutos(valor);
        System.out.println(valor + " horas tem: " + minuto + " minutos");

        valor = 3;
        int hora = Conversao.conversaoDiaEmHora(valor);
        System.out.println(valor + " dias tem: " + hora + " horas.");

        valor = 2;
        int diaSemana = Conversao.conversaoSemanaEmDias(valor);
        System.out.println(valor + " semanas tem: " + diaSemana + " dias.");

        valor = 1;
        int diaMes = Conversao.conversaoMesemDias(valor);
        System.out.println(valor + " Meses tem: " + diaMes + " dias");
    }
}
