
public class Salute {
	
	Salute(){
		
	}
	
	double calcolaBMR(Persona persona){    //passo oggetto persona che è di tipo Persona
		double MB = 0 ;
		 
		if(persona.sesso=='m'){
			MB = 655 + (9.6 * persona.peso) + (1.8 * persona.altezza) + (4.7 * persona.eta);  
		}else{
			MB = 655 + (13.8 * persona.peso) + (1.8 * persona.altezza) + (4.7 * persona.eta);
		}
		
		switch(persona.attivitaFisica){
		case "sedentario" :
			MB += (MB / 100) * 20;
			break;
		case "moderatamente attivo" :
			MB += (MB / 100) * 30;
			break;
		case "attivo" :
			MB += (MB / 100) * 40;
			break;
		case "molto attivo" :
			MB += (MB / 100) * 50;
			break;
		}
	
		
		return MB;
	}
	
}
