package osso.giacomo.harbour;

public class Gioco {
	
	
	
	
	public Gioco(){
			
			PortoNavale P = new PortoNavale();
			P.setDimensione(1000);
			
			Sottomarino s1 = new Sottomarino();
			s1.setNumeroArmamenti(1);
			s1.setStazza(1);
			s1.setModello("Sottomarino");
			
			Aereo a1 = new Aereo();
			a1.setNumeroArmamentiA(1);
			a1.setNumeroArmamentiB(1);
			a1.setModello("Aereo");
			
			
			Invasore[] invasori = new Invasore[]{
				s1,
				a1
			};
			
			
			
			attacco(invasori, P);
			
		
		}
	
	public void attacco(Invasore[] invasori, PortoNavale P){
		System.out.println("Inizio Gioco");
		
		int nAttacchi =0;
		System.out.println("Dimensione iniziale porto : " + P.getDimensione());
	
		do{
			for(Invasore i : invasori){
				if(P.isAlive()){
					
					//chi sta attaccando
					System.out.println("Attacco da: " + i.getModello()) ;
					
					
					P.setDimensione(P.getDimensione() - i.metriQuadriDistrutti());
					
					System.out.println("Dimensione porto : " + P.getDimensione());
					nAttacchi +=1;
					
				}else {
					System.out.println("Il porto è stato attaccato: " + nAttacchi ) ;
					
					System.out.println("Il porto è stato distrutto");
				}
			}
		}while(P.isAlive());
		
		System.out.println("Fine Gioco");
		
		
			
		
	}
	
	
	
	
	
	
}
