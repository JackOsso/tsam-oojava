
public class Dipendente {
    private String nome;
	private String cognome;
	private int anzianita;
	
	Contratto contratto;
	
	
	//costruttori
	Dipendente(){
		
	}
	Dipendente(String nome, String cognome, int anzianita){
		this.nome = nome;
		this.cognome = cognome;
		this.anzianita = anzianita;
		
	}
	
	
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getCognome(){
		return this.cognome;
	}
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	public int getAnzianita(){
		return anzianita;
	}
	public void setAnzianita(int anzianita){
		this.anzianita= anzianita;
	}
	
	
	//calcolo stipendio
	public double stipendio() {
		return contratto.getStipendioBase() + ((contratto.getStipendioBase() * 0.005) * anzianita);
	}
	
	
}
