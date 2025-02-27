package controller;

import model.ContaCorrente;
import model.ContaPoupanca;

public class ContaController {
    public ContaCorrente cadastrarContaCorrente(int numeroConta, String nomeTitular, double saldoInicial) {
        return new ContaCorrente(numeroConta, nomeTitular, saldoInicial);
    }
    
    public ContaPoupanca cadastrarContaPoupanca(int numeroConta, String nomeTitular, double saldoInicial) {
        return new ContaPoupanca(numeroConta, nomeTitular, saldoInicial);
    }
}
