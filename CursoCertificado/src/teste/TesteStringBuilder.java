package teste;

public class TesteStringBuilder {

	public static StringBuilder nome = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nome.append("Carlos>").append("Maria>").append("Jose>").append("Renata");
		
		mostra();
		
		System.out.println(nome.length());
		
		nome.append(">Wesley");
		
		mostra();
		
		capacidade();
		
		nome.ensureCapacity(84);

		capacidade();


	}
	
	public static void mostra() {
		System.out.println(nome.toString());
		System.out.println(nome.charAt(0));
	}

	public static void capacidade() {
		System.out.println(nome.capacity());
	}
}
