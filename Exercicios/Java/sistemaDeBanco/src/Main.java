import modelo.Cliente;
import modelo.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente jaiminho = new Cliente(12345, "Jaime", "Carteiro", "32.244.100-X", "123.456.789-00");

        ContaPoupanca contaPoupancaJaiminho = new ContaPoupanca(jaiminho, 2000);

        System.out.println("O seu saldo é de R$" + contaPoupancaJaiminho.consultar());
        System.out.println("O seu saldo após o saque é de R$" + contaPoupancaJaiminho.sacar(150));
        contaPoupancaJaiminho.depositar(500);
        System.out.println("O seu saldo após o depósito é de R$" + contaPoupancaJaiminho.consultar());

    }

}
