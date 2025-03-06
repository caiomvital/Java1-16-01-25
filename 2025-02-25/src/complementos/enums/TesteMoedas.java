package complementos.enums;

public class TesteMoedas {
public static void main(String[] args) {
	
	Moeda moeda = Moeda.PES;
	Usuario u = new Usuario();
	u.nome = "Tadeu";
	u.tipoAcesso = TipoAcesso.ADMIN;
	System.out.println(u.tipoAcesso.getNome());
	
	System.out.println(moeda.getNome());
	System.out.println(moeda.getSimbolo());
	
}
}
