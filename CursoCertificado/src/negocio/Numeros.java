package negocio;

public class Numeros {

	static int t=12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 15;
		boolean amigoDoDono = true;
		if(idade < 18 && amigoDoDono == false){
			System.out.println("Não pode entrar");
		}else {
			System.out.println("Pode Entrar");
		}
		
		while(idade < 18) {
			System.out.println("Fora da Prisao:"+idade);
			idade+=1;
			if(idade >= 18) {
				System.out.println("Cadeia ou Morte");
			}
		}
		
		for(int i=0;i < 18; ++i) {
			System.out.println("Ola:"+i);
		}
		
		int x=t;
		int y=100;
		
		for(int l = x;l < y;l++ ) {
			if (l % 19==0) {
				System.out.println("Achei o numero divisivel por 19 entre:x e y "+x+"e"+y);
				break;
			}
		}
	}

}
