
public class Azienda {
	private String nomeAzienda;
	private String ragioneSociale;
	Dipendente[] dipendenti;
	
	Azienda(){
		}
	Azienda(String nomeAzienda, String ragioneSociale){
		this.nomeAzienda = nomeAzienda;
		this.ragioneSociale = ragioneSociale;
		}
	
	public void setNomeAzienda(String nomeAzienda){
		this.nomeAzienda = nomeAzienda;
	}
	String getNomeAzienda(){
		return this.nomeAzienda;
	}
	
	public void setRagioneSociale(String ragioneSociale){
		this.ragioneSociale = ragioneSociale;
	}
	String getRagioneSociale(){
		return this.ragioneSociale;
	}
	
	
	
	double calcoloSommaStipendi(Dipendente[] dipendenti){
		double sommaStipendi=0;
		
		for (Dipendente d: dipendenti){
			sommaStipendi += d.stipendio();
			
		}
		
		return sommaStipendi;
	}
	
	
	
	//void stipendiMassimi(){}
		
	
}
