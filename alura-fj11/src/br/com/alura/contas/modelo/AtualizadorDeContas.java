package br.com.alura.contas.modelo;

public class AtualizadorDeContas {
	private double selic;
	private double saldoTotal;

	public AtualizadorDeContas(double taxa) {
		this.selic = taxa;
	}

	public void roda(Conta c) {
		System.out.println("=================================");
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo atualizado: " + c.getSaldo());
		saldoTotal += c.getSaldo();
		System.out.println("=================================");
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}
