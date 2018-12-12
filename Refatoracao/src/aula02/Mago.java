package aula02;

public class Mago extends Lorey {
	private int magia;
	
	public Mago() {
		super();
	}
	
	public Mago(String nome, int energia, int forca, int magia) {
		super(nome, energia, forca);
		this.magia = magia;
	}
	
	// metodos abaixo
	public String lancarMagia() {
		// lógica para lançar magia
		return "Lançando magia";
	}
	
	//10% do tempo que ficou que curando
	public String curar(int tempo){
		
		int energia = super.getEnergia();
		energia-= (tempo * 0.10);
		
		super.setEnergia(energia);
		return "Curando ";
	}
	
	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}
	
	
}