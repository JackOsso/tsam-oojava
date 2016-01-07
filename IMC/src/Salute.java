
public class Salute {
 // imc = massa / altezza (m*m)
	Salute(){
		}
	void calcolaIMC(Persona persona){
		
		double altezzaS = persona.altezza / 100;
		double imc = persona.massa / ( altezzaS * altezzaS );
		
		System.out.println(altezzaS);
		System.out.println(imc);
		
		if(imc<18.5){
			System.out.println("sottopeso");
		}else if (imc >= 18.5 && imc <25){
			System.out.println("normale");
		}else if(imc >=25 && imc < 30){
			System.out.println("sovrappeso");
		}else {
			System.out.println("obeso");
		}
			
		
				
	}
		
	
	
}
