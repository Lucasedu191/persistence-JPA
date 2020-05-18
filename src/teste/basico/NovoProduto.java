package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor 23", 789.89);
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluir(produto).fechar();
		
		System.out.println("ID do Produto: " + produto.getId());
		

	}

}
