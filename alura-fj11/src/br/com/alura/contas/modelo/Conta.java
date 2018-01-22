package br.com.alura.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
	protected double saldo;
	private int numero;
	private String titular;

	public void setTitular(String nome) {
		this.titular = nome;
	}

	public String getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido:" + valor);
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	@Override
	public String toString() {
		return "Conta numero: " + this.numero + ", Saldo: " + this.saldo;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero;
	}

	@Override
	public int compareTo(Conta outraConta) {
		if (this.saldo < outraConta.saldo)
			return -1;
		if (this.saldo > outraConta.saldo)
			return 1;
		return 0;
	}

}
