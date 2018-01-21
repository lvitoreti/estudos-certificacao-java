package br.com.alura.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaAtributos() {
		return this.getSaldo() * 0.1;
	}
}
