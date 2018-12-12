package aula02;

/*Super classe do time Lorey*/
public class Lorey {
	private String nome;
	private int energia;
	private int forca;

	public void golpear(){
		// lógica para golpear
	}

	public void levarDano(){
		// lógica para levar dano quando alguma coisa acontecer 	
	}
	



	// construtor e os getters e setters abaixo
	//...	
	public Lorey(){
		this.energia = 0;
		this.forca = 0;
		this.nome = "";
	}
	
	public Lorey(String nome, int energia, int forca) {
		this.nome = nome;
		this.energia = energia;
		this.forca = forca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	
	
	

} // end class



