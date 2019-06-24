package modelo;

public abstract class Conta {
    
 protected Cliente cliente;
    protected double saldo;

    public Conta() {
    }

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract double sacar(double valor);

    public double consultar() {
        return this.saldo;
    }

}
