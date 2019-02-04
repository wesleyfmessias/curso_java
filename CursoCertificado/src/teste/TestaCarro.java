package teste;

import negocio.Carro;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		
		System.out.println(meuCarro.velocidadeAtual);

	}

}
