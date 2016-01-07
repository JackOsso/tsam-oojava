
public class Persona {
	int altezza;
	int peso;
	int eta ;
	String attivitaFisica = ""; //"sedentario", "moderatamente attivo", "attivo", "molto attivo"
	char sesso; // "m" o "f"
	
	Persona(){
		
	}
	
	Persona(int altezza, int peso, int eta, String attivitaFisica, char sesso){
		
		this.altezza = altezza;
		this.peso = peso;
		this.eta = eta;
		this.attivitaFisica= attivitaFisica;
		this.sesso = sesso;
		
		
	}
	
	
}
