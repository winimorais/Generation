public class Pessoa {

    //        Exercicio 2
//
//         Desenvolva um programa em java que leia o nome e a idade de 3 pessoas
//        e mostre o nome da pessoa mais velha e o nome da pessoa mais nova.


    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}



