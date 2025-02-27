package model;

public abstract class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public abstract void exibirDados();
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
       }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
    
    protected void alterarSaldo(double valor) {
        this.saldo += valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
}