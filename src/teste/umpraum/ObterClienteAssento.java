package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());
		
		daoCliente.fecharT();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		@SuppressWarnings("unused")
		Assento assento = daoAssento.obterPorID(4L);
		
		daoAssento.fecharT();
	}
}
