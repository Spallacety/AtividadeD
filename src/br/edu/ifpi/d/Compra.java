package br.edu.ifpi.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Compra {

	private double valor;
	private double descontos;
	private Cliente cliente;
	private List<Item> listaDeItens = new ArrayList<Item>();
	private Map<String, Integer> mapa = new TreeMap<String, Integer>();
	
	public Compra(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void addItem(Item item){
		this.listaDeItens.add(item);
	}
	
	public void calculaValorTotal(){
		Map<String, Integer> mapa2 = new TreeMap<String, Integer>();
		mapa = mapa2;
		
		for (Item item : listaDeItens) {
			if (!mapa.containsKey(item.getNome()))
				mapa.put(item.getNome(), 0);
			mapa.put(item.getNome(), mapa.get(item.getNome()) + 1);
			this.valor += item.getValor();
		}
		
		Promocao.calcularPromocoes(this);
		
	}
	
	public double getValor() {
		return valor;
	}

	public double getDescontos() {
		return descontos;
	}
	
	public void addDescontos(double descontos){
		this.descontos += descontos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Item> getListaDeItens() {
		return listaDeItens;
	}

	public Map<String, Integer> getMapa() {
		return mapa;
	}
	
	@Override
	public String toString() {
		String str = "Cliente " + this.cliente.getNome() + " (" + this.cliente.getPontos() + " pontos)";
		str += "\nValor das compras: R$ " + this.valor + "\nDescontos: R$ " + this.descontos + "\nValor final: R$ " + (this.valor - this.descontos);
		return str;
	}

}
