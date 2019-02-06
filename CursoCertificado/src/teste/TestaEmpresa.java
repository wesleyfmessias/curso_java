package teste;

import negocio.Data;
import negocio.Empresa;
import negocio.Funcionario;

public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[2];
		
		//se retirar essa linha abaixo onde tem a data, da nullpointexception
		Data data = new Data(21,01,2018);
		Funcionario f1 = new Funcionario();
		f1.setNome("Wesley");
		f1.setSalario(12000);
		f1.setDataDeEntrada(data);

		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Elenita");
		f2.setSalario(22000);
		Data data1= new Data(23,11,1991);
		
		f2.setDataDeEntrada(data1);
		
		empresa.adiciona(f2);
		
		empresa.mostraFuncionario();
		
	}
}
