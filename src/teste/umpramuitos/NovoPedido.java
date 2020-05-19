package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedidos;

public class NovoPedido {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Pedidos pedido = new Pedidos();
		Produto produto = new Produto("Geladeira", 2789.89);
		ItemPedido item = new ItemPedido(pedido,produto ,10, 214.12);
		
		dao 
			.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT();
	}
}
