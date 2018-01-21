package br.com.alura.contas.main;

import br.com.alura.contas.modelo.ContaCorrente;
import br.com.alura.contas.modelo.GerenciadorDeImpostoDeRenda;
import br.com.alura.contas.modelo.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		ContaCorrente cc = new ContaCorrente();

		gerenciador.adiciona(sv);
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		System.out.println(gerenciador.getTotal());
	}

}
