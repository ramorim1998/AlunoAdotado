package service;

import java.util.HashMap;
import java.util.List;
import loja.Produto;
import loja.Carrinho;
import repository.CarrinhoRepository;

public class CarrinhoService {
	private CarrinhoRepository carrinho = new CarrinhoRepository();

	public Carrinho addCarrinho(Carrinho carrinho) {
		this.carrinho.addCarrinho(carrinho);
		return carrinho;
	}

	public void removeCarrinho(Carrinho carrinho) {
		this.carrinho.deleteCarrinho(carrinho);
	}

	public void attCarrinho(Carrinho carrinho) {
		this.carrinho.updateCarrinho(carrinho);
	}

	public List<Carrinho> listAll() {
		return this.carrinho.readAll(null);
	}

	public HashMap<Long, Produto> addProdu(Carrinho carrinho, Produto produto) {
		return this.carrinho.addProduto(carrinho, produto);
	}

	public Produto listaCliente(Carrinho carrinho, Long cliente) {
		return this.carrinho.listaKdaClient(carrinho, cliente);
	}

}
