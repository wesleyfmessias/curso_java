package negocio;

public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
		
		System.out.println("Gastos no Trimestre:"+gastosTrimestre);
		
		System.out.println("Media mensal:"+gastosTrimestre/3);
		
		
		

	}

}
