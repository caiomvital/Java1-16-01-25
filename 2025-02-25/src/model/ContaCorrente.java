package model;

public class ContaCorrente extends Conta implements Tarifavel {
    public ContaCorrente(int numeroConta, String nomeTitular, double saldoInicial) {
        super(numeroConta, nomeTitular, saldoInicial);
    }

    @Override
    public void exibirDados() {
        System.out.println("Conta Corrente - Titular: " + getNomeTitular() + ", Número: " + getNumeroConta() + ", Saldo: " + getSaldo());
    }
    
    public void aplicar(double valor, ContaPoupanca contaPoupanca) {
        if (sacar(valor)) {
            contaPoupanca.depositar(valor);
        }
    }
    
    @Override
    public void aplicarTarifaMensal(double valor) {
        sacar(valor);
    }
    
    @Override
    public void cobrarTaxa(double valor) {
        sacar(valor);
    }
}
