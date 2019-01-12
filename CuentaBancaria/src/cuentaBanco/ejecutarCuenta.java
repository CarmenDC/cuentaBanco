package cuentaBanco;

import java.util.ArrayList;
import java.util.Collections;

public class ejecutarCuenta {

	public static void main(String[] args) {
		
		ArrayList<CuentaBanco> listaCuentasBancos = new ArrayList<>();
		
		listaCuentasBancos.add(new CuentaBanco(53333333, 2600, 3.2));
		listaCuentasBancos.add(new CuentaBanco(34555989, 104600, 3.98));
		listaCuentasBancos.add(new CuentaBanco(65433388, 23200, 4.6));
		listaCuentasBancos.add(new CuentaBanco(33455662, 5500, 2.12));

		System.out.println(listaCuentasBancos);
		
		for (CuentaBanco cuenta: listaCuentasBancos) {
			cuenta.actualizarSaldo();
		}
		
		System.out.println(listaCuentasBancos);
		
		for (CuentaBanco cuenta: listaCuentasBancos) {
			cuenta.ingresar(2000);
		}
		
		System.out.println(listaCuentasBancos);	
		
		for (CuentaBanco cuenta: listaCuentasBancos) {
			cuenta.retirar(1000);
		}
		
		System.out.println(listaCuentasBancos);	
		
		Collections.sort(listaCuentasBancos, new OrdenarPorSaldo());
		System.out.println(listaCuentasBancos);	
		
	}
	

}
