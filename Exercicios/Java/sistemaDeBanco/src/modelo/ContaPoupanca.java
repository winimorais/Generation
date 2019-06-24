package modelo;

public class ContaPoupanca extends Conta {
    
 private double taxaJuros;

    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    public double recolherJuros() {
        this.taxaJuros = this.saldo * 0.10;
        return this.saldo += this.taxaJuros;
    }




}
