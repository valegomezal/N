package productos.cdt;

import java.util.Date;

public interface ICdt {
	
	public Date FechaApertura();
	public Date FechaCierre();
	public long NumeroCuenta();
	public long saldo();
	public int interes();
	public long MinimoApertura();
}
