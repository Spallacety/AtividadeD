package br.edu.ifpi.d;

public class Cliente {

	private String nome;
	private int pontos;
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void addPontos(int pontos) {
		this.pontos += pontos;
	}
	
	public void dimunuirPontos(int pontos){
		this.pontos -= pontos;
	}
	
}
