package negocio;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	public Data() {}
	
	public Data(int dia,int mes,int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public String formatada(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	}

}
