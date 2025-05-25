//06) Crie uma classe Tempo com três atributos: horas, minutos e segundos. Crie dois construtores:
//um para inicializar os atributos com valor zero e outro para inicializar os atributos com valores
//passados como argumentos. Crie métodos para (1,0 ponto):
//a) Funcionar como getter e setter.
//b) Imprimir os atributos no formato hh:mm:ss.
//c) Subtrair dois objetos e colocar o resultado no objeto que o chamou.
//d) Somar dois objetos e colocar o resultado no objeto que o chamou.
//e) Sobrecarregue este último método para que retorne um objeto com o resultado da
//operação.

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        normalizar();
    }

    public int getHoras(){
        return horas;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

    public int getMinutos(){
        return minutos;
    }

    public void setMinutos(int minutos){
        this.minutos = minutos;
    }

    public int getSegundos(){
        return segundos;
    }

    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

    public void imprimir(){
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public void somar(Tempo outro){
        this.horas+= outro.horas;
        this.minutos+= outro.minutos;
        this.segundos+= outro.segundos;
        normalizar();
    }

    public Tempo somarNovo(Tempo outro){
        int h = this.horas + outro.horas;
        int m = this.minutos + outro.minutos;
        int s = this.segundos + outro.segundos;
        return new Tempo(h, m, s);
    }

    public void subtrair(Tempo outro){
        int totalSegundos1 = this.toSegundos();
        int totalSegundos2 = outro.toSegundos();
        int resultado = totalSegundos1 - totalSegundos2;
        if (resultado < 0) resultado = 0;
        this.horas = resultado / 3600;
        this.minutos = (resultado % 3600)/ 60;
        this.segundos = resultado % 60;
    }

    private int toSegundos(){
        return horas * 3600 + minutos * 60 + segundos;
    }

    private void normalizar(){
        if (segundos >= 60){
            minutos += segundos/60;
            segundos = segundos % 60;
        }
        if (minutos >= 60){
            horas += minutos/60;
            minutos = minutos % 60;
        }
    }

    public static void main(String[] args){
        Tempo t1 = new Tempo(1, 40, 30);
        Tempo t2 = new Tempo(0, 50, 45);

        System.out.print("Tempo 1: ");
        t1.imprimir();

        System.out.print("Tempo 2: ");
        t2.imprimir();

        t1.somar(t2);
        System.out.print("Soma no mesmo objeto: ");
        t1.imprimir();

        t1.subtrair(new Tempo(1, 0, 0));
        System.out.print("Apos subtrair uma hora: ");
        t1.imprimir();

        Tempo t3 = t1.somarNovo(t2);
        System.out.print("Nova soma(t1 + t2): ");
        t3.imprimir();
    }
}
