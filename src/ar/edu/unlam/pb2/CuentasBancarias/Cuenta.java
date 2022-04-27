package ar.edu.unlam.pb2.CuentasBancarias;

public abstract class Cuenta {
	
	private Integer cbu;
	public Integer getCbu() {
		return cbu;
	}
	
	public abstract Boolean extraer(Integer cbu,Double monto);
	public abstract Boolean depositar(Integer cbu, Double monto);

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}

	private Double saldoActual;

	public Cuenta(Integer cbu, Cliente cliente, Double saldoActual) {
		this.cbu=cbu;
		this.saldoActual=saldoActual;
	}

}
