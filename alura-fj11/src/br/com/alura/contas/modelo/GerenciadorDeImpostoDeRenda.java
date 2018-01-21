package br.com.alura.contas.modelo;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adiconando Tributo..");
		this.total += t.calculaAtributos();
	}

	public double getTotal() {
		return this.total;
	}
}
