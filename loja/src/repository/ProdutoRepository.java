package repository;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoRepository {
	private List<Produto> produtos = new ArrayList<Produto>();
	private Long idProd = 0L;

	public Produto adicionarProduto(Produto produto) {
		produto.setId(this.idProd);
		produtos.add(produto);
		this.incSequenceProduto();
		return produto;
	}

	public Produto updateProduto(Produto produto, Long id) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				Produto produtoAtual = produtos.get(i);
				if (produtoAtual.equals(produto)) {
					produtos.add(i, produto);
					break;
				}
			}
		}
		return produto;
	}

	public void deletarProduto(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			Produto produtoAtual = produtos.get(i);
			if (produtoAtual.equals(produto)) {
				produtos.remove(i);
			}
		}
	}

	public List<Produto> readAll(Produto produto) {
		return this.produtos;
	}

	private void incSequenceProduto() {
		this.idProd++;
	}

	public Produto getById(Long id) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				return this.produtos.get(i);
			}
		}
		return this.produtos.get(-1);
	}

	public void deleteById(Long id) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				produtos.remove(i);
			}

		}
	}
}
