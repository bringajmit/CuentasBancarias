package ar.edu.unlam.pb2.CuentasBancarias;

public class Cliente {

	private String nombre;
	private Integer dni;
	private Double saldoInicial;

	public Cliente(String nombre, Integer dni, Double saldoInicial) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldoInicial=saldoInicial;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

}
