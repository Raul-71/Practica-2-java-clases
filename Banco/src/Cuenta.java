
public class Cuenta {

	
	
	
	
		// TODO Esbozo de método generado automáticamente
		private String NumeroCuenta;
		private String Titular;
		private int Saldo;
		private double InteresAnual;
		
		/*
		 * Constructores
		 */
		
		
		public Cuenta (String NumeroCuenta, String Titular, int Saldo, double InteresAnual ) {
			this.NumeroCuenta = NumeroCuenta;
			this.Titular = Titular;
			this.Saldo = Saldo;
			this.InteresAnual = InteresAnual;
		}
		
		/*
		 * Metodos de Cuenta
		 */
		public Cuenta(){
			NumeroCuenta = "IBAN";
			Titular = "Javier Garcia Fernandez";
			Saldo = 1275;
			InteresAnual = 1.25;
	}
		public void MostrarSaldo() {
			System.out.println("Saldo:"+ Saldo);
			
		}
		public void MostrarInterfaz() {
			System.out.println("Buenos dias "+ Titular);
			
		}
		//Hacemos los get y set
		 public String getnumeroCuenta() {
		        return NumeroCuenta;
		    }
		
		  public void setNumeroCuenta(String numeroCuenta) {
		        this.NumeroCuenta = numeroCuenta;
		    }

		  public String gettitular() {
		        return Titular;
		    }
		
		  public void settitular(String titular) {
		        this.Titular = titular;
		    }

		  public int getsaldo() {
		        return Saldo;
		    }
		
		  public void setsaldo(int saldo) {
		        this.Saldo = saldo;
		    }
		  
		  
		  public double getinteresAnual() {
		        return InteresAnual;
		    }
		
		  public void setinteresAnual(double interesAnual) {
		        this.InteresAnual = interesAnual;
		    }

		  
		  
}
