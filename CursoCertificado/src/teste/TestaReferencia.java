package teste;

import negocio.Conta;

public class TestaReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta();
		
		c1.deposita(100);
		
		Conta c2 = c1;
		c2.deposita(200);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());

	}

}
