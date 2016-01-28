package osso.giacomo.harbour;

public class Sottomarino extends Invasore {
	
	private int numeroArmamenti;
	private int stazza; 
	
	
	
	public int potenzaFuoco(){
		int potenzaFuoco = 0;
		
		potenzaFuoco=getNumeroArmamenti() * getStazza();
		
		return potenzaFuoco;
		
	}



	public int getNumeroArmamenti() {
		return numeroArmamenti;
	}



	public void setNumeroArmamenti(int numeroArmamenti) {
		this.numeroArmamenti = numeroArmamenti;
	}



	public int getStazza() {
		return stazza;
	}



	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	

}
