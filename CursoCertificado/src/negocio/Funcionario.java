package negocio;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setDepartamento(String departamento) {
		this.departamento=departamento;
	}
	public String getDepartamento() {
		return this.departamento;
	}
			
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
	public void recebeAumento(double valor) {
		this.salario+=valor;
	} 
	
	public double calculaGanhoAnual() {
		return this.salario*12;
	}
	
	public double auxilioMoradia() {
		return this.salario*3;
	}
	
	public String mostraData(Data data) {
		return data.formatada();
	}
	
	public void mostra() {
		System.out.println("Nome:"+this.nome);
		System.out.println("Salario atual:"+this.salario);
		System.out.println("Ganho anual:"+calculaGanhoAnual());
		System.out.println("Auxilio Moradia:"+auxilioMoradia());
		System.out.println("Data da Entrada:"+mostraData(this.getDataDeEntrada()));
	}

}
