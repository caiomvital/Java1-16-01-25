package view;

import java.util.Scanner;

import controller.ContaController;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
        ContaController controller = new ContaController();
        
        ContaCorrente contaCorrente = null;
        ContaPoupanca contaPoupanca = null;
        
        String menuOperacoes = """
        		### Menu de Operações ###
        		1. Criar Conta Corrente
        		2. Criar Conta Poupança
        		3. Depositar
        		4. Sacar
        		5. Aplicar na Poupança
        		6. Resgatar da Poupança
        		7. Exibir Dados da Conta
        		8. Sair
        		Escolha uma opção: 
        		""";
        
        while (true) {
            System.out.println(menuOperacoes);
            
            
            int opcao = scan.nextInt(); scan.nextLine(); 
            
            switch (opcao) {
                case 1:
                    
                case 2:
                   
                case 3:
                    
                case 4:
                    
                case 5:
                    
                case 6:
                    
                case 7:
                    
                case 8:
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
