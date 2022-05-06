package ar.edu.unlam.pb2.CuentasBancarias;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente extends Cuenta {

	/*La más compleja de las cuentas, ésta permite establecer una cantidad de dinero a
girar en descubierto. Es por ello que cada vez que se desee extraer dinero, no sólo
se considera el que se posee, sino el límite adicional que el banco estará brindando.
Por supuesto esto no es gratis, ya que el banco nos cobrará un 5% como comisión
sobre todo el monto en descubierto consumido en la operación.
Por ejemplo, si tuviéramos $ 100 en la cuenta, y quisiéramos retirar $ 200 (con un
descubierto de $ 150), podremos hacerlo. Pasaremos a deberle al banco $ 105 en
total: los $ 100 que nos cubrió, más el 5% adicional sobre el descubierto otorgado. */
	
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
