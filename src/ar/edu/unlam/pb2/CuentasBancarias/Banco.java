package ar.edu.unlam.pb2.CuentasBancarias;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Banco {

	private String nombre;
	private List<CuentaCorriente> cuentasCorrientes;
	private List<CajaDeAhorro> cajasDeAhorro;
	private List<Cliente> clientes;
	private Integer cbu;
	private Double saLdoActual;
	
	public Banco(String nombre) {
		this.nombre=nombre;
		cuentasCorrientes=new ArrayList<CuentaCorriente>();
		cajasDeAhorro=new ArrayList<CajaDeAhorro>();
	}

	public void agregarCajaDeAhorro(CajaDeAhorro cA) {
		
		 cajasDeAhorro.add(cA);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CuentaCorriente> getCuentasCorrientes() {
		return cuentasCorrientes;
	}

	public void setCuentasCorrientes(List<CuentaCorriente> cuentasCorrientes) {
		this.cuentasCorrientes = cuentasCorrientes;
	}

	public List<CajaDeAhorro> getCajasDeAhorro() {
		return cajasDeAhorro;
	}

	public void setCajasDeAhorro(List<CajaDeAhorro> cajasDeAhorro) {
		this.cajasDeAhorro = cajasDeAhorro;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Double getSaLdoActual() {
		return saLdoActual;
	}

	public void setSaLdoActual(Double saLdoActual) {
		this.saLdoActual = saLdoActual;
	}

	public void agregarCuentaCorriente(CuentaCorriente cc) {

		cuentasCorrientes.add(cc);
		
	}

	public Cuenta buscarCliente(Integer cbu) {
		for (CajaDeAhorro cajaDeAhorro : cajasDeAhorro) {
			if(cajaDeAhorro.getCbu()==cbu) {
				return cajaDeAhorro;
			}
		}
		return null;
	}

	
}
