package aula02;

public class Guerreiro extends Lorey{
	
	// aumenta a energia
	public void beber() {
		super.setEnergia(super.getEnergia() + 20);
	}

}