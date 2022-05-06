# CuentasBancarias
Gestor de cuentas bancarias 
Implementar la clase Banco, el cual contiene clientes y cuentas.
Una cuenta bancaria es un contrato financiero con una entidad bancaria en virtud del cual
se registran el balance y los subsiguientes movimientos de dinero del cliente.
Nosotros vamos a ser menos estrictos, ya que por el momento no nos interesa computar
los movimientos de dinero del cliente sino los totales instantáneos (es decir, cuánto dinero
tiene el cliente a cada momento luego de realizar cada transacción).
Tipos de cuentas
Vamos a establecer, para el contexto de este ejercicio, tres tipos de cuentas:
a. Cuenta Sueldo
b. Caja de Ahorros
c. Cuenta Corriente.
Cada una cumple con ciertas reglas de negocio, las cuales se detallan a continuación.
Cuenta Sueldo
Es el tipo de cuenta más simple, ya que se rige por la premisa de que en tanto y en
cuanto se tenga tanto o más dinero en cuenta del que se quiere extraer, la operación
se debe efectuar correctamente. 
Cuenta Corriente
La más compleja de las cuentas, ésta permite establecer una cantidad de dinero a
girar en descubierto. Es por ello que cada vez que se desee extraer dinero, no sólo
se considera el que se posee, sino el límite adicional que el banco estará brindando.
Por supuesto esto no es gratis, ya que el banco nos cobrará un 5% como comisión
sobre todo el monto en descubierto consumido en la operación.
Por ejemplo, si tuviéramos $ 100 en la cuenta, y quisiéramos retirar $ 200 (con un
descubierto de $ 150), podremos hacerlo. Pasaremos a deberle al banco $ 105 en
total: los $ 100 que nos cubrió, más el 5% adicional sobre el descubierto.
