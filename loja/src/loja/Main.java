package loja;

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
			clients.add(clientService.addClient(client));

		}
		System.out.println(clientService.listAll());
		ProdutoService produtoS = new ProdutoService();
		List<Produto> produtos = new ArrayList<Produto>();
		for (int i = 0; i < 3; i++) {
			Produto produ = new Produto();
			produ.setId((long) (i + i * 4));
			produ.setNome("ok" + i);
			produ.setQtd(i + 1);
			produ.setValor(i * i + 4.0);
			produ.setTipo("ta" + i);
			produtos.add(produtoS.addProduto(produ));
			Carrinho carrinho = new Carrinho(i + i * 4L);
			carrinho.setProduto(produ);
			CarrinhoService carrinhos = new CarrinhoService();
			System.out.println(carrinhos.addCarrinho(carrinho));
			carrinho.setLista(produ);
			System.out.println(carrinhos.listAll());
		}
		System.out.println(produtoS.listAll());

	}
}
