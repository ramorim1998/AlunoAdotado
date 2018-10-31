package loja;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrinho {
	private Long id;
	private ArrayList<Produto> produto = new ArrayList<Produto>();
	private HashMap<Long, Produto> listA = new HashMap<Long,Produto>();
	private Double valorTotal = 0.0;
	
	public Carrinho(Long id) {
		super();
		this.id = id;
	}

	//GETTERS E SETTERS
	public Long getCliente() {
		return id;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto.add(produto);
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal() {
		for (int i = 0; i < produto.size(); i++) {

			this.valorTotal += produto.get(i).getValor()*produto.get(i).getQtd();
		}
	}
	public void setLista(Produto produto) {
		listA.put(this.id, produto);
	}
	public Produto getLista(Long cliente){
		for (int i = 0; i < listA.size(); i++) {
			if(listA.containsKey(cliente)) {
				return listA.get(cliente);
			}
		}
		return listA.get(1L);
	}

	@Override
	public String toString() {
		return "Carrinho [id=" + id + ", produto=" + produto + ", listA=" + listA + ", valorTotal=" + valorTotal + "]";
	}

}
