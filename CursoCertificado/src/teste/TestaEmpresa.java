package teste;

import negocio.Data;
import negocio.Empresa;
import negocio.Funcionario;

public class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[2];
		
		//se retirar essa linha abaixo onde tem a data, da nullpointexception
		Data data = new Data();
		Funcionario f1 = new Funcionario();
		f1.nome = "Wesley";
		f1.salario = 12000;
		f1.dataDeEntrada = data;
		f1.dataDeEntrada.dia=21;
		f1.dataDeEntrada.mes=01;
		f1.dataDeEntrada.ano=2018;
		
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Elenita";
		f2.salario = 22000;
		Data data1= new Data();

		f2.dataDeEntrada = data1;
		f2.dataDeEntrada.dia=23;
		f2.dataDeEntrada.mes=11;
		f2.dataDeEntrada.ano=1991;

		
		empresa.adiciona(f2);
		
		empresa.mostraFuncionario();
		
	}
}
