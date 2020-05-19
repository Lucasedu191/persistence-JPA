package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedidos;

public class ObterPedido {
	public static void main(String[] args) {
		DAO<Pedidos> dao = new DAO<>(Pedido.class);
		Pedidos pedido = dao.obterPorID(1L);
		for (ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
		}
		dao.fecharT();
	}
}
