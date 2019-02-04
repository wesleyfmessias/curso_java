package teste;

import negocio.Data;
import negocio.Funcionario;

public class TestaFuncionario {
	//main ctrl+space
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		Data data = new Data();
	
		f1.nome="Wesley";
		f1.salario=12000;
		f1.recebeAumento(1000);
		f1.dataDeEntrada = data;
		f1.dataDeEntrada.dia=27;
		f1.dataDeEntrada.mes=01;
		f1.dataDeEntrada.ano=2019;
		
//		System.out.println("Salario atual:"+f1.salario);
//		System.out.println("Ganho anual:"+f1.calculaGanhoAnual());
//		System.out.println("Auxilio Moradia:"+f1.auxilioMoradia());
		
		f1.mostra();
		
		
				
		
	}
}
