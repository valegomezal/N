package productos.CuentaCredito;

import productos.Tarjeta.Tarjeta;

public interface ICuentaCredito {
	    public Tarjeta tarjeta();
		public String cuenta();
		public int Saldo();
		public int numeroCuenta();
		public int CuotaManejo();
}
