
public class BaseMetabolicRate {

	public static void main(String[] args) {
		System.out.println("-----MASCHI-----");
		Persona Jack = new Persona(180 , 100 , 19 , "sedentario" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		Salute salute = new Salute();
		System.out.println(salute.calcolaBMR(Jack));
		
		Persona Nick = new Persona(180 , 100 , 19 , "moderatamente attivo" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Nick));
		
		Persona Mel = new Persona(180 , 100 , 19 , "attivo" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Mel));
		
		Persona Piero = new Persona(180 , 100 , 19 , "molto attivo" , 'm');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Piero));
		
		System.out.println("-----DONNE-----");
		Persona Anna = new Persona(180 , 100 , 19 , "sedentario" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Anna));
		
		Persona Giada = new Persona(180 , 100 , 19 , "moderatamente attivo" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Giada));
		
		Persona Carol = new Persona(180 , 100 , 19 , "attivo" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Carol));
		
		Persona Nicole = new Persona(180 , 100 , 19 , "molto attivo" , 'f');  //int altezza, int peso, int eta, String attivitaFisica, char sesso
		System.out.println(salute.calcolaBMR(Nicole));
	}

}
