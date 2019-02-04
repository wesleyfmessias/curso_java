package negocio;

public class ArrayJava {
	
	public static void main(String[] args) {
		
		int[] valor = new int[100];
		
		for(int i=0;i < valor.length;i++) {
			valor[i]=i*10;
		}
		
//		for(int i=0; i < valor.length;i++) {
//			System.out.println(valor[i]);
//		}
		//
		for(int x : valor) {
			System.out.println(x);
		}
	}
	

}
