package br.edu.ifpi.d;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Lucas");
		cliente.addPontos(10000);
		
		Compra compra = new Compra(cliente);
		
		Item item = new Item(3, "bolacha");
		Item item2 = new Item(1001, "biscoito");
		
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item);
		compra.addItem(item2);

		compra.calculaValorTotal();
	
		System.out.println(compra);
	}
}
