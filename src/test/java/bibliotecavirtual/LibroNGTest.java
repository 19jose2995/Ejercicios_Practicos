/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package bibliotecavirtual;

import static org.testng.Assert.*;

/**
 *
 * @author Dell
 */
public class LibroNGTest {
    
    public LibroNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @org.testng.annotations.Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class Libro.
     */
    @org.testng.annotations.Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Libro instance = null;
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDisponible method, of class Libro.
     */
    @org.testng.annotations.Test
    public void testIsDisponible() {
        System.out.println("isDisponible");
        Libro instance = null;
        boolean expResult = false;
        boolean result = instance.isDisponible();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prestar method, of class Libro.
     */
    @org.testng.annotations.Test
    public void testPrestar() {
        System.out.println("prestar");
        Libro instance = null;
        instance.prestar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolver method, of class Libro.
     */
    @org.testng.annotations.Test
    public void testDevolver() {
        System.out.println("devolver");
        Libro instance = null;
        instance.devolver();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarInfo method, of class Libro.
     */
    @org.testng.annotations.Test
    public void testMostrarInfo() {
        System.out.println("mostrarInfo");
        Libro instance = null;
        instance.mostrarInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
