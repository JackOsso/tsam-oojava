package osso.giacomo.harbour;

public class PortoNavale {

	private String nome;
	private int numeroImbarcazioni;
	private int dimensione;				//in metri quadri
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroImbarcazioni() {
		return numeroImbarcazioni;
	}
	public void setNumeroImbarcazioni(int numeroImbarcazioni) {
		this.numeroImbarcazioni = numeroImbarcazioni;
	}
	public int getDimensione() {
		return dimensione;
	}
	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}
	
	public boolean isAlive(){
		if(dimensione<0){
			return false;
		}else{
			return true;
		}
	}
}
