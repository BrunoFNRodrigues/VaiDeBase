package br.edu.insper.desagil.vaiDeBase;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public Video postaVideo(int id, Produto prod) {
		return new Video(id, this, prod);
	}
	
	public int totalAvaliacoes() {
		int tot = 0;
		for (Video video: this.videos) {
			tot = tot + video.mediaAvaliacoes();
		}
		return tot;
	}
	
}
