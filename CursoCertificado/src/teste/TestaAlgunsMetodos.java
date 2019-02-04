package teste;

import negocio.Conta;

public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta = new Conta();
		
		minhaConta.dono = "Duke";
		minhaConta.setSaldo(1000);
		
		boolean consegui = minhaConta.saca(2000);
		
		if(consegui) {
			System.out.println("Consegui sacar!!!");
		} else {
			System.out.println("Não Consegui sacar !!!");
		}
		
		minhaConta.deposita(500);
		
		System.out.println(minhaConta.getSaldo());

	}

}
