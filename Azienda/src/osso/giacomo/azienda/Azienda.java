package osso.giacomo.azienda;

public class Azienda {
	private String partitaIVA;
	private String ragioneSociale;
	Dipendente[] dipendenti;
	
	Azienda(){
		}
	Azienda(String partiaIVA, String ragioneSociale){
		this.partitaIVA = partitaIVA;
		this.ragioneSociale = ragioneSociale;
		}
	
	public void setPartitaIVA(String partitaIVA){
		this.partitaIVA = partitaIVA;
	}
	String getPartitaIVA(){
		return partitaIVA;
	}
	
	public void setRagioneSociale(String ragioneSociale){
		this.ragioneSociale = ragioneSociale;
	}
	String getRagioneSociale(){
		return ragioneSociale;
	}
	
	
	
	int calcoloSommaStipendi(Dipendente[] dipendenti){
		int sommaStipendi=0;
		
		for (Dipendente d: dipendenti){
			sommaStipendi += d.stipendio();
			
		}
		
		return sommaStipendi;
	}
	
	
	
	//void stipendiMassimi(){}
		
	
}
