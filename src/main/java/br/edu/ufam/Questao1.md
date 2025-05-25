# 1°Questão
## a)
### Classe
É como uma receita ou molde. Ela define como alguma coisa deve ser, o que ela sabe fazer e o que ela tem. Por exemplo: uma classe "Cachorro" pode dizer que todo cachorro tem um nome, uma raça e pode latir.

### Objeto 
É como o bolo feito a partir da receita. Ou seja, é algo real, criado com base na classe.
Exemplo: se a classe é "Cachorro", um objeto seria o cachorro "Rex", da raça poodle. Ele é um exemplo real da classe.

## b)

### Instanciar um objeto
É o processo de criar um objeto real a partir de uma classe. É como usar um molde para fabricar algo: a classe é o molde, e o objeto é o que foi criado

Vamos imaginar que você tem essa classe:

        public class Cachorro {
            String nome;
            public Cachorro(String nome) {
            t   his.nome = nome;
            }
            public void latir() {
                System.out.println(nome + " está latindo!");
            }
        }
Instanciando um objeto:

       public class Main {
            public static void main(String[] args) {
                Cachorro meuCachorro = new Cachorro("Rex");
                meuCachorro.latir();  // Saída: Rex está latindo!
                }
        }
Cachorro é a classe.
meuCachorro é o objeto.
new Cachorro("Rex") é o momento em que estamos instanciando o objet