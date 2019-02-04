package negocio;

public class Funcionario {
	public String nome;
	public String departamento;
	public double salario;
	public Data dataDeEntrada;
	public String rg;
	public boolean estaNaEmpresa;
	
	public void recebeAumento(double valor) {
		this.salario+=valor;
	} 
	
	public double calculaGanhoAnual() {
		return this.salario*12;
	}
	
	public double auxilioMoradia() {
		return this.salario*3;
	}
	
	public void mostra() {
		System.out.println("Nome:"+this.nome);
		System.out.println("Salario atual:"+this.salario);
		System.out.println("Ganho anual:"+calculaGanhoAnual());
		System.out.println("Auxilio Moradia:"+auxilioMoradia());
		System.out.println("Data da Entrada:"+this.dataDeEntrada.formatada());
	}

}
