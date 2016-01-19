package osso.giacomo.azienda;

public class GestioneContabile {

	public static void main(String[] args) {
		
		Azienda prova = new Azienda();
		Dipendente jack = new Dipendente();
		Contratto contratto = new Contratto(600*100 , "apprendista");
		
		jack.setContratto(contratto);
		
		Dipendente[] dipendenti = new Dipendente[] {
				jack
		};
		
		System.out.println(prova.calcoloSommaStipendi(dipendenti));
		
	}

}
