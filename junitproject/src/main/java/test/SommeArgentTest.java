package test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.SommeArgent;

class SommeArgentTest {

	private SommeArgent m12CHF = new SommeArgent(12, "CHF");
	private SommeArgent m14CHF = new SommeArgent(14, "CHF");
	private static int i = 0;
	@BeforeEach
	void initialisation() {
		m12CHF = new SommeArgent(12, "CHD");
		m14CHF = new SommeArgent(14, "CHF");
		System.out.println(++i+"ime passage avant exécution d'une méthode de test");
	}
	@AfterEach
	void unde() {
		m12CHF = null;
		m14CHF = null;
		System.out.println(i+"ime passage APRES exécution d'une méthode de test");
	}
	@Test
	void test() {
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent result;
		result = m12CHF.add(m14CHF);

		if (expected.equals(result)) {
			System.out.println("Les deux somme sont égales");
		} else {
			System.out.println("Les deux somme ne sont pas éqales");
		}
	}
	@Test
    void testEquals() {
		SommeArgent m14USD= new SommeArgent(14, "USD");
		Assert.assertTrue(!m12CHF.equals(null));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));
	}
}
