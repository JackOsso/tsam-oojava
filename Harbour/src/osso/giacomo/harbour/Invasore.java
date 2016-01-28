package osso.giacomo.harbour;

public abstract class Invasore {
	private String id;
	private String modello;
	
	public abstract int potenzaFuoco();
	
	public int metriQuadriDistrutti(){
		int distrutti = 0;
		
		distrutti = (int) Math.round(potenzaFuoco() * 1.5);
		
		return distrutti;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	
}
