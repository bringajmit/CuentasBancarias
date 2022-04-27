package ar.edu.unlam.pb2.CuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBanco {

	/*Implementar la clase Banco, el cual contiene clientes y cuentas.
Una cuenta bancaria es un contrato financiero con una entidad bancaria en virtud del cual
se registran el balance y los subsiguientes movimientos de dinero del cliente.
Nosotros vamos a ser menos estrictos, ya que por el momento no nos interesa computar
los movimientos de dinero del cliente sino los totales instantáneos (es decir, cuánto dinero
tiene el cliente a cada momento luego de realizar cada transacción).
Tipos de cuentas
Vamos a establecer, para el contexto de este ejercicio, tres tipos de cuentas:
a. Cuenta Sueldo
b. Caja de Ahorros
c. Cuenta Corriente. */
	
	@Test
	public void testQueSePuedaCrearUnaCajaDeAhorro() {
		
		Banco miBanco=new Banco("Deme su Dinero");
		Cliente juan=new Cliente("Juan", 31981186, 250.0);
		
		CajaDeAhorro cA=new CajaDeAhorro(1111,juan,juan.getSaldoInicial());
		miBanco.agregarCajaDeAhorro(cA);
		
		cA.extraer(1111,150.0);
		//System.out.println(miBanco.buscarCliente(cA.getCbu()).getSaldoActual());
		//System.out.println(miBanco.getCajasDeAhorro().size());
		assertEquals(miBanco.getCajasDeAhorro().size(),1);
		assertEquals(miBanco.buscarCliente(cA.getCbu()).getSaldoActual(), 100.0, 0.01);
		
		cA.depositar(cA.getCbu(), 100.0);
		//System.out.println(cA.getSaldoActual());
	}
	
	@Test
	public void testQueSePuedaExtraerDeUnaCajaDeAhorro() {
		
		Banco miBanco=new Banco("Deme su Dinero");
		Cliente juan=new Cliente("Juan", 31981186, 250.0);
		
		CajaDeAhorro cA=new CajaDeAhorro(1111,juan,juan.getSaldoInicial());
		miBanco.agregarCajaDeAhorro(cA);
		
		cA.extraer(1111,150.0);
		
		assertEquals(miBanco.buscarCliente(cA.getCbu()).getSaldoActual(), 100.0, 0.01);
		
	}
	
	@Test
	public void testQueSePuedaDepositarEnUnaCajaDeAhorro() {
		
		Banco miBanco=new Banco("Deme su Dinero");
		Cliente juan=new Cliente("Juan", 31981186, 250.0);
		
		CajaDeAhorro cA=new CajaDeAhorro(1111,juan,juan.getSaldoInicial());
		miBanco.agregarCajaDeAhorro(cA);
		
		cA.depositar(cA.getCbu(), 100.0);
		Double esperado=350.0;
		Double obtenido=cA.getSaldoActual();
		assertEquals(esperado,obtenido,0.01);
	}
	
	@Test
	public void testQueSePuedaCrearUnaCuentaCorriente() {
		
		Banco miBanco=new Banco("Deme su Dinero");
		Cliente juan=new Cliente("Juan", 31981186, 100.0);
		
		CuentaCorriente cc=new CuentaCorriente(1111,juan,juan.getSaldoInicial());
		miBanco.agregarCuentaCorriente(cc);
		
		//System.out.println(miBanco.getCajasDeAhorro().size());
		assertEquals(miBanco.getCuentasCorrientes().size(),1);
		
		cc.extraer(cc.getCbu(), 200.0);
		//System.out.println(cc.getSaldoActual());
		
	}
	
	@Test
	public void testQueSePuedaExtraerConDescubiertoDeUnaCuentaCorriente() {
		
		Banco miBanco=new Banco("Deme su Dinero");
		Cliente juan=new Cliente("Juan", 31981186, 100.0);
		
		CuentaCorriente cc=new CuentaCorriente(1111,juan,juan.getSaldoInicial());
		miBanco.agregarCuentaCorriente(cc);
		
		cc.extraer(cc.getCbu(), 200.0);
		Double obtenido=cc.getSaldoActual();
		Double esperado=-105.0;
		
		assertEquals(esperado,obtenido,0.01);
		
		
	}
	
	@Test
	public void testQueSePuedaExtraerDeUnaCuentaCorriente() {
		
		Banco miBanco=new Banco("Deme su Dinero");
		Cliente juan=new Cliente("Juan", 31981186, 100.0);
		
		CuentaCorriente cc=new CuentaCorriente(1111,juan,juan.getSaldoInicial());
		miBanco.agregarCuentaCorriente(cc);
		
		cc.extraer(cc.getCbu(), 52.0);
		Double obtenido=cc.getSaldoActual();
		Double esperado=48.0;
		
		assertEquals(esperado,obtenido,0.01);	
	}
	
	@Test
	public void testQueSePuedaDepositarUnaCuentaCorriente() {
		
		Banco miBanco=new Banco("Deme su Dinero");
		Cliente juan=new Cliente("Juan", 31981186, 100.0);
		
		CuentaCorriente cc=new CuentaCorriente(1111,juan,juan.getSaldoInicial());
		miBanco.agregarCuentaCorriente(cc);
		
		cc.depositar(cc.getCbu(), 223.0);
		Double obtenido=cc.getSaldoActual();
		Double esperado=323.0;
		
		assertEquals(esperado,obtenido,0.01);
	
	}

}
