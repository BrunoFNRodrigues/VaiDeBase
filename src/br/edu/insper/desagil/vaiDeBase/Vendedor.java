package br.edu.insper.desagil.vaiDeBase;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
	private List<Produto> produtos;
	
	public Vendedor(String nome) {
		super(nome);
		this.produtos = new ArrayList<>();
	}
	
	public void cadastraProduto(String nome, double preco) {
		produtos.add(new Produto(nome, preco));
	}
}
