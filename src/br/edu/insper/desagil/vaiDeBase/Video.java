package br.edu.insper.desagil.vaiDeBase;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario,Integer> avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
		
	}

	public int getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void adiocionaAvalicao(Usuario nome, int avalicao) {
		if (nome != this.usuario && avalicao > 1 && avalicao < 5) {
			avaliacoes.put(nome, avalicao);
		}
	}
	
	public int mediaAvaliacoes() {
		double tot = 0.0;
		for (Usuario nome:avaliacoes.keySet()) {
			int nota = avaliacoes.get(nome);
			tot = tot + nota;
		}
		if (avaliacoes.size() != 0) {
			tot = tot/avaliacoes.size();;
		}
		return (int) Math.round(tot);
	}
}
