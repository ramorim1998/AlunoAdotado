package model;

import service.CarrinhoService;
import service.ClientService;
import service.ProdutoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ClientService clientService = new ClientService();

		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < 3; i++) {
			Client client = new Client((long) (i * i + 4), "ful" + i, i + i, i * i + 2);
			clients.add(clientService.adicionarClient(client));

		}
		System.out.println(clientService.listarAll());
		ProdutoService produtoS = new ProdutoService();
		List<Produto> produtos = new ArrayList<Produto>();
		for (int i = 0; i < 3; i++) {
			Produto produto = new Produto();
			produto.setId((long) (i + i * 4));
			produto.setNome("ok" + i);
			produto.setQtd(i + 1);
			produto.setValor(i * i + 4.0);
			produto.setTipo("ta" + i);
			produtos.add(produtoS.adicionarProduto(produto));
			Carrinho carrinho = new Carrinho(i + i * 4L);
			carrinho.setProduto(produto);
			CarrinhoService carrinhos = new CarrinhoService();
			System.out.println(carrinhos.adicionarCarrinho(carrinho));
			carrinho.setLista(produto);
			System.out.println(carrinhos.listarAll());
		}
		System.out.println(produtoS.listarAll());

	}
}
