package repository;

import java.util.ArrayList;
import java.util.List;
import loja.Produto;

public class ProdutoRepository {
	private List<Produto> produtos = new ArrayList<Produto>();
	private Long idProd = 0L;
	
	public Produto AddProduto(Produto produto) {
		produto.setId(this.idProd);
		produtos.add(produto);
		this.incSequenceProduto();
		return produto;
	}
	
	public Produto updateProduto(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			Produto produtoAtual = produtos.get(i);
			if (produtoAtual.equals(produto)) {
				produtos.add(i,produto);
				break;
			}
		}
		return produto;
	}
	
	public void deleteProduto(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			Produto produtoAtual = produtos.get(i);
			if(produtoAtual.equals(produto)) {
				produtos.remove(i);
			}
		}
	}
	
	public List<Produto> readAll(Produto produto){
		return this.produtos;
	}
	
	private void incSequenceProduto() {
		this.idProd++;
	}
}