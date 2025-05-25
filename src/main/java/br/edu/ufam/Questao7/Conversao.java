/*Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão
aproximada das unidades de tempo segundo a lista abaixo (1,0 ponto).
 1 minuto = 60 segundos
 1 hora = 60 minutos
 1 dia = 24 horas
 1 semana = 7 dias
 1 mês = 30 dias */

package br.edu.ufam.Questao7;

public class Conversao {
    public static int conversaoMinutoEmSegundo(int minuto){
        return minuto*60;
    }

    public static int  conversaoHoraEmMinutos(int hora){
        return hora *60;
    }

    public static int conversaoDiaEmHora(int dia){
        return dia * 24;
    }
    
    public static int conversaoSemanaEmDias(int semana){
        return  semana * 7 ;
    }

    public static int conversaoMesemDias(int mes){
        return mes * 30;
    }
    
    
}
