package negocio;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Conta();
		Conta minhaConta = new Conta();
		
		minhaConta.dono = "Duke";
		minhaConta.setSaldo(1000.00);
		
		System.out.println("Saldo atual:"+minhaConta.getSaldo());
	}

}
