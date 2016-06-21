package br.edu.ifpi.d;

import java.util.Map;

public class Promocao {

	public static void calcularPromocoes(Compra compra){
		calcular20ItensOuMais(compra);
		calcular1000Reais(compra);
		verificarPontosCliente(compra);
	}
	
	private static void calcular1000Reais(Compra compra){
		if(compra.getValor() > 1000){
			double desconto = compra.getValor() * 0.1;
			compra.addDescontos(desconto);
		}
	}
	
	private static void verificarPontosCliente(Compra compra){
		if (compra.getCliente().getPontos() >= 1000){
			double desconto = compra.getValor() * 0.05;
			compra.addDescontos(desconto);
		}
	}
	
	private static void calcular20ItensOuMais(Compra compra){
		Item temp = null;
		for (Map.Entry<String, Integer> item : compra.getMapa().entrySet()) {
			if (item.getValue() >= 20){
				for (Item item2 : compra.getListaDeItens()){
					if (item2.getNome() == item.getKey()){
						temp = item2;
						break;
					}
				}
				double desconto = (item.getValue() * temp.getValor()) * 0.1;
				compra.addDescontos(desconto);
			}
		}
	}
	
}
