package osso.giacomo.harbour;

public class Aereo extends Invasore{
	
	private int numeroArmamentiA;
	private int numeroArmamentiB;
	
	
	public int potenzaFuoco(){
		int potenzaFuoco = 0;
		
		potenzaFuoco=(getNumeroArmamentiA() * 10) + ( getNumeroArmamentiB() * 25);
		
		return potenzaFuoco;
		
	}


	public int getNumeroArmamentiA() {
		return numeroArmamentiA;
	}


	public void setNumeroArmamentiA(int numeroArmamentiA) {
		this.numeroArmamentiA = numeroArmamentiA;
	}


	public int getNumeroArmamentiB() {
		return numeroArmamentiB;
	}


	public void setNumeroArmamentiB(int numeroArmamentiB) {
		this.numeroArmamentiB = numeroArmamentiB;
	}
	
	
	
	
}
