package org;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testSomeArgent {

    @Test
    public void add(){
        SommeArgent m12CHF= new SommeArgent(12, "CHF");
        SommeArgent m14CHF= new SommeArgent(14, "CHF");
        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);
    }

    @Test
    public void equals(){
        SommeArgent m12CHF= new SommeArgent(12, "CHF");
        SommeArgent m14CHF= new SommeArgent(14, "CHF");
        SommeArgent m14USD= new SommeArgent(14, "USD");
       // Assert.assertTrue(!m12CHF.equals(null));
        Assert.assertEquals(m12CHF, m12CHF);
       // Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
      //  Assert.assertTrue(!m12CHF.equals(m14CHF));
      //  Assert.assertTrue(!m14USD.equals(m14CHF));
    }


    private SommeArgent m12CHF;
    private SommeArgent m14CHF;
    @Before
    public void mesInitialisations() {
        m12CHF= new SommeArgent(12, "CHF"); // (1)
        m14CHF= new SommeArgent(14, "CHF");
    }
    @Test
    public void testeLAddition() {
        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF); // (2)
        Assert.assertTrue(expected.equals(result)); // (3)
    }
    @After
    public void before(){

    }

}
