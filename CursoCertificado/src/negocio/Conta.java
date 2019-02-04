package negocio;

public class Conta {
	public int numero;
	public String dono;
	private double saldo;
	private double limite;
	public Cliente titular;
	
	public Conta(){
		
	}
	
/*	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
*/	
	public void deposita(double quantidade) {
		this.setSaldo(this.getSaldo() + quantidade); 
	}
	
	public boolean saca(double valor) {
		if(this.getSaldo() < valor) {
			return false;
		} else {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
	}
	
	public boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if(retirou == false) {
			return false;
		}else {
			destino.deposita(valor);
			return true;
		}
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	/*void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo+valor;
	}
*/
}
