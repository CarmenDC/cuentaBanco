package cuentaBanco;

import java.util.Comparator;

public class OrdenarPorSaldo implements Comparator<CuentaBanco>{

	@Override
	public int compare(CuentaBanco o1, CuentaBanco o2) {
		return (int) (o1.getSaldoAcual()-o2.getSaldoAcual());
	}
	

}
