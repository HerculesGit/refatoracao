package aula01;

public class Animal {

	private String nome;
	private int idade;

	// construtor e getters e setters aqui


	// métodos
	public String andar(int passos){
		// lógica para andar
		
		return new StringBuilder().
				append("Andar por ").append(passos).append(" passos").toString();
	}

	public String dormir(int tempo){
		// lógica para dormir
		
		return new StringBuilder().
				append("Dormir por ").append(tempo).append(" segundos").toString();
	}

	public String defecar(){
		// logica para defecar
	
		return "defecando...";
	}

}
