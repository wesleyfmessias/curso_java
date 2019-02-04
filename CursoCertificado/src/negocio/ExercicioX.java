package negocio;

public class ExercicioX {
	
	public static void main(String[] args) {
		
		int inicio=150;
		while(inicio<301) {
			System.out.println("Numero:"+inicio);
			++inicio;
		}
		int valor=0;
		int somar=0;
		while(valor <1001) {
			somar+=valor++;
			System.out.println("Soma:"+somar);
			valor++;
		}
		
	}

}
