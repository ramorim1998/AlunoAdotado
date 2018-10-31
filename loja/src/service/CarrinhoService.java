package service;

import java.util.HashMap;
import java.util.List;
import loja.Produto;
import loja.Carrinho;
import repository.CarrinhoRepository;

public class CarrinhoService {
	private CarrinhoRepository carrinho = new CarrinhoRepository();

	public Carrinho adicionarCarrinho(Carrinho carrinho) {
		this.carrinho.addCarrinho(carrinho);
		return carrinho;
	}

	public void removerCarrinho(Carrinho carrinho) {
		this.carrinho.deleteCarrinho(carrinho);
	}

	public void updateCarrinho(Carrinho carrinho, Long id) {
		this.carrinho.updateCarrinho(id, carrinho);
	}

	public List<Carrinho> listarAll() {
		return this.carrinho.readAll(null);
	}

	public HashMap<Long, Produto> adicionarProduto(Carrinho carrinho, Produto produto) {
		return this.carrinho.addProduto(carrinho, produto);
	}

	public Produto listarCliente(Carrinho carrinho, Long cliente) {
		return this.carrinho.listaKdaClient(carrinho, cliente);
	}

}
