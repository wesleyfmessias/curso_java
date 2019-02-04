package negocio;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	public Data(){}
	
	public String formatada(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	}

}
