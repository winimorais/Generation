package modelo;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public void depositarCheque(Cheque cheque) {
        super.saldo += cheque.getValor();
    }

    @Override
    public double sacar(double valor) {

        if (valor > super.saldo && valor <= super.saldo + this.chequeEspecial) {
            return super.saldo -= valor;
        } else {
            return super.saldo -= valor;
        }
    }

}