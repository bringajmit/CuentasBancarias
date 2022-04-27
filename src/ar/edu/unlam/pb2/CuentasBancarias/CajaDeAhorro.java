package ar.edu.unlam.pb2.CuentasBancarias;

public class CajaDeAhorro extends Cuenta {

	/*Es el tipo de cuenta más simple, ya que se rige por la premisa de que en tanto y en
cuanto se tenga tanto o más dinero en cuenta del que se quiere extraer, la operación
se debe efectuar correctamente. 
*/
	
	public CajaDeAhorro(Integer cbu, Cliente cliente, Double saldoActual) {
		super(cbu, cliente, saldoActual);
	}

	@Override
	public Boolean extraer(Integer cbu, Double monto) {
		boolean aprobado=true;
		boolean rechazado=false;
		
		if(monto<=getSaldoActual()) {
			setSaldoActual(getSaldoActual()-monto);
			return aprobado;
		}
		
		return rechazado;
	}

	@Override
	public Boolean depositar(Integer cbu, Double monto) {
		setSaldoActual(getSaldoActual()+monto);
		return true;
	}
	
	

}
