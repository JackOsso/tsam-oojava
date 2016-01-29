package osso.giacomo.harbour.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import osso.giacomo.harbour.Aereo;
import osso.giacomo.harbour.Gioco;
import osso.giacomo.harbour.Invasore;
import osso.giacomo.harbour.Sottomarino;

public class GiocoTest {

	@Test
	public void test() {
		Gioco g = new Gioco();
		
		
		
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
		
		
		
		g.attacco(invasori);
	}

}
