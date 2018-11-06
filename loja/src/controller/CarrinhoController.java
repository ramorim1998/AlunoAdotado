package controller;

import java.util.List;

import model.Carrinho;
import service.CarrinhoService;

public class CarrinhoController {

	CarrinhoService Carrinho;

	public List<Carrinho> getAll() {
		return Carrinho.listarAll();
	}

	public Carrinho addCarrinho(Carrinho Carrinho) {
		return this.Carrinho.adicionarCarrinho(Carrinho);
	}

	public void updatePublic(Carrinho Carrinho, Long id) {
		this.Carrinho.updateCarrinho(Carrinho, id);
	}

	public Carrinho getById(Long id) {
		return this.Carrinho.getById(id);
	}

	public void deletarById(Long id) {
		this.Carrinho.deleteById(id);
	}

}
