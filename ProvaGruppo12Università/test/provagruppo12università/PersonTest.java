/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provagruppo12università;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author nando
 */
public class PersonTest {

    Person anando;

    public PersonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        anando = new Person("anando", "sica", 22, 00);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    @DisplayName("simple getName test")
    public void testGetName() {
        System.out.println("getName");
        String expResult = "anando";
        String result = anando.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "ludovico";
        Person instance = new Person("toChange" , "maritato" , 22 , 0);
        instance.setName(name);
        assertEquals("ludovico", instance.getName());
    }

    /**
     * Test of getSurname method, of class Person.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        String expResult = "sica";
        String result = anando.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSurname method, of class Person.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "maritato";
        Person instance = new Person("ludovico" , "toCghange" , 22 , 0);
        instance.setSurname(surname);
        assertEquals("maritato", instance.getSurname());
    }

    /**
     * Test of getEta method, of class Person.
     */
    @Test
    public void testGetEta() {
        System.out.println("getEta");
        int expResult = 22;
        int result = anando.getEta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEta method, of class Person.
     */
    @Test
    public void testSetEta() {
        System.out.println("setEta");
        int eta = 23;
        Person instance = new Person("ludovico" , "toCghange" , 22 , 0);
        instance.setEta(eta);
        assertEquals(eta, instance.getEta());
    }

    /**
     * Test of getSesso method, of class Person.
     */
    @Test
    public void testGetSesso() {
        System.out.println("getSesso");
        int expResult = 0;
        int result = anando.getSesso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSesso method, of class Person.
     */
    @Test
    public void testSetSesso() {
        System.out.println("setSesso");
        int sesso = 0;
        Person instance = new Person("ludovico" , "toCghange" , 22 , 1);
        instance.setSesso(sesso);
         assertEquals(sesso, instance.getSesso()); 
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Il nome del soggetto e' name=  anando, surname = sica, eta = 22 sesso = Decisamente pcoo ";
        String result = anando.toString();
        assertEquals(expResult, result);
    }

}
