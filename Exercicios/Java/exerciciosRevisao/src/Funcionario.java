import java.util.ArrayList;

public class Funcionario {

    private String nome;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, double salario, String dataAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void listarFuncionarios () {

        ArrayList<String> funcionario = new ArrayList<String>();


        System.out.println(funcionario);
    }
}
