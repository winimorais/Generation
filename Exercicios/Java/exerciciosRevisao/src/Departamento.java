import java.util.ArrayList;

public class Departamento {

    private String nomeDoDepartamento;
    private String Funcionario;

    public Departamento(String nomeDoDepartamento, String funcionario) {
        this.nomeDoDepartamento = nomeDoDepartamento;
        Funcionario = funcionario;
    }

    public String getNomeDoDepartamento() {
        return nomeDoDepartamento;
    }

    public void setNomeDoDepartamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String funcionario) {
        Funcionario = funcionario;
    }

    public void listarDepartamentos() {

        ArrayList<String> departamentos = new ArrayList<String>();
    }

}