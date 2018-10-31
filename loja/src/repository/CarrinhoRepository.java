package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import loja.Carrinho;
import loja.Client;
import loja.Produto;

public class CarrinhoRepository {
	private List<Carrinho> carrinhos = new ArrayList<Carrinho>();

	public Carrinho addCarrinho(Carrinho carrinho) {
		carrinhos.add(carrinho);
		return carrinho;
	}

	public Carrinho updateCarrinho(Carrinho carrinho) {
		for (int i = 0; i < carrinhos.size(); i++) {
			Carrinho carrinhoAtual = carrinhos.get(i);
			if (carrinhoAtual.equals(carrinho)) {
				carrinhos.add(i, carrinho);
				break;
			}

		}
		return carrinho;
	}

	public void deleteCarrinho(Carrinho carrinho) {
		for (int i = 0; i < carrinhos.size(); i++) {
			Carrinho carrinhoAtual = carrinhos.get(i);
			if (carrinhoAtual.equals(carrinho)) {
				carrinhos.remove(i);
			}
		}
	}

	public List<Carrinho> readAll(Carrinho carrinho) {
		return this.carrinhos;
	}

	public HashMap<Long, Produto> addProduto(Carrinho carrinho, Produto produt) {
		if (carrinhos.contains(carrinho)) {
			carrinho.setLista(produt);

		}
		return null;
	}

	public Produto listaKdaClient(Carrinho carrinhos, Long cliente) {
		return carrinhos.getLista(cliente);
	}
}
