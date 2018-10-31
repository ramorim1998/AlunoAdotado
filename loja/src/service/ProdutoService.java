package service;

import java.util.List;

import loja.Produto;
import repository.ProdutoRepository;

public class ProdutoService {
	private ProdutoRepository produtoR = new ProdutoRepository();

	public Produto adicionarProduto(Produto produto) {
		this.produtoR.adicionarProduto(produto);
		return produto;
	}

	public void removerProduto(Produto produto) {
		this.produtoR.deletarProduto(produto);

	}

	public void atualizarProduto(Produto produto, Long id) {
		this.produtoR.updateProduto(produto, id);
	}

	public List<Produto> listarAll() {
		return this.produtoR.readAll(null);
	}

}
