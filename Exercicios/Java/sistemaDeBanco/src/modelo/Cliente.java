package modelo;

public class Cliente {
    private Integer numeroDeCliente;
    private String nome;
    private String sobreNome;
    private String numeroRg;
    private String numeroCpf;

    public Integer getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(Integer numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public Cliente(Integer numeroDeCliente, String nome, String sobreNome, String numeroRg, String numeroCpf) {
        this.numeroDeCliente = numeroDeCliente;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.numeroRg = numeroRg;
        this.numeroCpf = numeroCpf;
    }
}
