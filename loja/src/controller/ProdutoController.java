package controller;

import java.util.List;

import model.Produto;
import service.ProdutoService;

public class ProdutoController {
	ProdutoService produto;
	public List<Produto> getAll() {
		return produto.listarAll();
	}

	public Produto addProduto(Produto produto) {
		return this.produto.adicionarProduto(produto);
	}

	public void updatePublic(Produto produto, Long id) {
		this.produto.atualizarProduto(produto, id);
	}

	public Produto getById(Long id) {
		return this.produto.getById(id);
	}

	public void deletarById(Long id) {
		this.produto.deleteById(id);
	}
	
}
