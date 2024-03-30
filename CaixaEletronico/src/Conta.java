
public class Conta {
	private String dono;
	private Double saldo;

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;

		} else {
			System.out.print("Saldo insulficiente || ");
		
		}
	}

	public String stingSaldo() {
		return String.format("R$%.2f%n", saldo);

	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}
}