package negocio;

public class Empresa {
	public Funcionario[] empregados;
	public String cnpj;
	public int codigo;
	
	public void adiciona(Funcionario f) {
		this.empregados[this.codigo]=f;
		this.codigo++;
	}

	public void mostraFuncionario() {
			for(int i=0;i<this.empregados.length;i++) {
					this.empregados[i].mostra();
			}
		
	}
}
