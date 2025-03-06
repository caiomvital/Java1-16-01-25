package view;

import model.Gerente;
import model.Recepcionista;
import model.Vendedor;
import model.Zelador;

public class Principal {

	public static void main(String[] args) {
		
		Vendedor v = new Vendedor();
		Gerente g = new Gerente();
		Recepcionista r = new Recepcionista();
		Zelador z = new Zelador();
		
		double salarioVendedor = v.calcularSalario(1512);
		System.out.println(salarioVendedor);
		
	}
}
