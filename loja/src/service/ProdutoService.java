package service;

import java.util.List;

import loja.Produto;
import repository.ProdutoRepository;

public class ProdutoService {
	private ProdutoRepository produtoR = new ProdutoRepository();

	public Produto addProduto(Produto produto) {
		this.produtoR.AddProduto(produto);
		return produto;
	}

	public void removeProduto(Produto produto) {
		this.produtoR.deleteProduto(produto);

	}

	public void attProduto(Produto produto) {
		this.produtoR.updateProduto(produto);
	}

	public List<Produto> listAll() {
		return this.produtoR.readAll(null);
	}

}
