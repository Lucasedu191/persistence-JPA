package teste.muitospramuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		Filme filmaA = new Filme("Star Wars EP 4", 8.7);
		Filme filmeB = new Filme("O Fugitivo", 8.9);
		
		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator ("Carrie Fisher");
		
		filmeA.adiconarAtor(atorA);
		filmeA.adicionarAtor(atrizB);

		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmaA);
		
	}
}
