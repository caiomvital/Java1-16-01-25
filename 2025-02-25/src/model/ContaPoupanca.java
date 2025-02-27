package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numeroConta, String nomeTitular, double saldoInicial) {
        super(numeroConta, nomeTitular, saldoInicial);
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta Poupança - Titular: " + getNomeTitular() + ", Número: " + getNumeroConta() + ", Saldo: " + getSaldo());
    }
    
    public void resgatar(double valor, ContaCorrente contaCorrente) {
        if (sacar(valor)) {
            contaCorrente.depositar(valor);
        }
    }
}
