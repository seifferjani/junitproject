package test;

import org.junit.jupiter.api.Test;

import org.PorteMonnaie;
import org.SommeArgent;

class PorteMonnaieTest {

	@Test
	void test() {
		 SommeArgent m1 = new SommeArgent(5, "EUR");
		 SommeArgent m2 = new SommeArgent(5, "EUR");
		 SommeArgent m3 = new SommeArgent(10, "EUR");
		PorteMonnaie porteMonnaie1 = new PorteMonnaie();
		PorteMonnaie porteMonnaie2 = new PorteMonnaie();
		porteMonnaie1.ajouteSomme(m1);
		porteMonnaie1.ajouteSomme(m2);
		porteMonnaie2.ajouteSomme(m3);
		System.out.println("porteMonnaie contient :"+ porteMonnaie1);
		System.out.println("Le deux porteMonnaie "+ porteMonnaie1.equals(porteMonnaie2));
	}

}
