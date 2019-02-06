package teste;

import negocio.Data;
import negocio.Funcionario;

public class TestaFuncionario {
	//main ctrl+space
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		Data data = new Data(27,01,2019);
	
		f1.setNome("Wesley");
		f1.setSalario(12000);
		f1.recebeAumento(1000);
		f1.setDataDeEntrada(data);
		
		f1.mostra();
		
		
				
		
	}
}
