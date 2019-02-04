package teste;

import negocio.Cliente;
import negocio.Conta;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		
		minhaConta.titular = c;
		
		minhaConta.titular.nome = "Wesley";
		minhaConta.titular.sobrenome = "Messias";
		minhaConta.titular.cpf = "856.148.237-00";
		
		System.out.println("Nome:"+minhaConta.titular.nome+"\nSobrenome:"+minhaConta.titular.sobrenome+"\nCPF:"+minhaConta.titular.cpf);
	}

}
