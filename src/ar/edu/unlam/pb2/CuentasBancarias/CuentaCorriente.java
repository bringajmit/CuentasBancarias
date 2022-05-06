package ar.edu.unlam.pb2.CuentasBancarias;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente extends Cuenta {

	/*La m�s compleja de las cuentas, �sta permite establecer una cantidad de dinero a
girar en descubierto. Es por ello que cada vez que se desee extraer dinero, no s�lo
se considera el que se posee, sino el l�mite adicional que el banco estar� brindando.
Por supuesto esto no es gratis, ya que el banco nos cobrar� un 5% como comisi�n
sobre todo el monto en descubierto consumido en la operaci�n.
Por ejemplo, si tuvi�ramos $ 100 en la cuenta, y quisi�ramos retirar $ 200 (con un
descubierto de $ 150), podremos hacerlo. Pasaremos a deberle al banco $ 105 en
total: los $ 100 que nos cubri�, m�s el 5% adicional sobre el descubierto otorgado. */
	
	private Set<Cliente> clientesCc;	
	
	public CuentaCorriente(Integer cbu, Cliente cliente, Double saldoActual) {
		super(cbu, cliente, saldoActual);
		clientesCc=new HashSet<Cliente>();
		clientesCc.add(cliente);
	}

	public Set<Cliente> getClientesCc() {
		return clientesCc;
	}

	public void setClientesCc(Set<Cliente> clientesCc) {
		this.clientesCc = clientesCc;
	}

	@Override
	public Boolean extraer(Integer cbu, Double monto) {
		boolean aprobado=true;
		boolean rechazado=false;
		Double descubierto=0.05;
		if(monto>getSaldoActual()) {
			double recargo=(monto-getSaldoActual())*descubierto;
			setSaldoActual(getSaldoActual()-(recargo+monto));
			return aprobado;
		}if(monto<=getSaldoActual()) {
			setSaldoActual(getSaldoActual()-monto);
			return aprobado;
		}
		
		return rechazado;
	}

	@Override
	public Boolean depositar(Integer cbu, Double monto) {
		setSaldoActual(getSaldoActual()+monto);
		return null;
	}

}
