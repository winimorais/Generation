public class Empresa {

    private String nome;
    private String CNPJ;
    private String departamentos;

    public Empresa(String nome, String CNPJ, String departamentos) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = departamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

}
