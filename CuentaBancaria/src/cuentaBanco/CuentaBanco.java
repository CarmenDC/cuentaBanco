package cuentaBanco;

public class CuentaBanco {
	
	private static long identificadorCuenta = 100001;
	
	private long numCuenta;
	private long dniCliente;
	private double saldoActual;
	private double interesAnual;
	
	public long getNumCuenta() {
		return numCuenta;
	}
	public long getDniCliente() {
		return dniCliente;
	}
	public double getSaldoAcual() {
		return saldoActual;
	}
	public double getInteresAnual() {
		return interesAnual;
	}
	
	public CuentaBanco() {
		
	}
	public CuentaBanco(long dniCliente, double saldoAcual, double interesAnual) {
		super();
		this.numCuenta = identificadorCuenta;
		identificadorCuenta ++;
		this.dniCliente = dniCliente;
		this.saldoActual = saldoAcual;
		this.interesAnual = interesAnual;
	}
	
	public void actualizarSaldo() {
		saldoActual = saldoActual*(1+interesAnual/100/365);
	}
	
	public void ingresar (double ingreso) {
		saldoActual += ingreso;
	}
	
	public void retirar (double ingreso) {
		saldoActual -= ingreso;
	}
	@Override
	public String toString() {
		return "\n"+ "Cuenta: " + numCuenta + ", dni: " + dniCliente + ", saldo: " + saldoActual
				+ "€, interesAnual " + interesAnual+"%";
	}

	
}
