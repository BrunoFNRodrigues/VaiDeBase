package br.edu.insper.desagil.vaiDeBase;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Teste {
	Video video;
	Usuario usuario = new Usuario("Ademir");;
	@BeforeEach
	void setUp() {
		video = usuario.postaVideo(42, new Produto("Puff",50.00));

	}
	@Test
	void test1() {
		video.adiocionaAvalicao(usuario,4);
		video.adiocionaAvalicao(new Usuario("Gucci"),5);
		video.adiocionaAvalicao(new Usuario("Basil"),1);
		assertEquals(0,video.mediaAvaliacoes());
	}
	
	@Test
	void test2() {
		video.adiocionaAvalicao(new Usuario("Basil"),4);
		assertEquals(4,video.mediaAvaliacoes());
	}
	
	@Test
	void test3() {
		video.adiocionaAvalicao(new Usuario("Gucci"),4);
		video.adiocionaAvalicao(new Usuario("Basil"),3);
		assertEquals(4,video.mediaAvaliacoes());
	}
	
	@Test
	void test4() {
		video.adiocionaAvalicao(new Usuario("Rimuru"),4);
		video.adiocionaAvalicao(new Usuario("Gucci"),4);
		video.adiocionaAvalicao(new Usuario("Basil"),2);
		assertEquals(3,video.mediaAvaliacoes());
	}
	
	@Test
	void test5() {
		Video video2 = usuario.postaVideo(02, new Produto("Puff",50.00));
		video.adiocionaAvalicao(new Usuario("Rimuru"),4);
		video.adiocionaAvalicao(new Usuario("Gucci"),4);
		video2.adiocionaAvalicao(new Usuario("Basil"),2);
		assertEquals(6,usuario.totalAvaliacoes());
	}
}
