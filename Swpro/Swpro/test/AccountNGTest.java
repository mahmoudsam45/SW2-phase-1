

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Three.Game;
import Three.Account;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Three.Game;
import Three.GameDBController;
import java.util.Vector;

/**
 *
 * @author amrfo_000
 */
public class AccountNGTest {
   
   
   
   @Test// test to pass
   public void test_Get_games1()
   {Game g = new Game();
   Game g2 = new Game();
   GameDBController g3 = new GameDBController();
    Vector<Game>subgame=new Vector<Game>();
   // Vector<Game>subgame2=new Vector<Game>();
    g.setName ("Math1");
   g.setCategorie ("Math");
   g.setOwner ("Ahmed");
   g2.setName ("Math2");
   g2.setCategorie ("Math");
   g2.setOwner ("Ahmed");
   g3.addGame(g);
   g3.addGame(g2);
       assertEquals(subgame, g3.getGames("Math"));
   }
@Test//test to fail 
   public void test_Get_games2()
   {Game g = new Game();
   Game g2 = new Game();
   GameDBController g3 = new GameDBController();
    Vector<Game>subgame=new Vector<Game>();
   // Vector<Game>subgame2=new Vector<Game>();
    g.setName ("Math1");
   g.setCategorie ("Math");
   g.setOwner ("Ahmed");
   g2.setName ("Math2");
   g2.setCategorie ("Math");
   g2.setOwner ("Ahmed");
   g3.addGame(g);
   g3.addGame(g2);
       assertEquals(subgame, g3.getGames("math"));
   }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getAccountName method, of class Account.
     */
    @Test
    public void testGetAccountName() {
        System.out.println("getAccountName");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getAccountName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountName method, of class Account.
     */
    @Test
    public void testSetAccountName() {
        System.out.println("setAccountName");
        String accountName = "";
        Account instance = new Account();
        instance.setAccountName(accountName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Account.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Account.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Account instance = new Account();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthdate method, of class Account.
     */
    @Test
    public void testGetBirthdate() {
        System.out.println("getBirthdate");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getBirthdate();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthdate method, of class Account.
     */
    @Test
    public void testSetBirthdate() {
        System.out.println("setBirthdate");
        String birthdate = "";
        Account instance = new Account();
        instance.setBirthdate(birthdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class Account.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Account instance = new Account();
        instance.register();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showProfile method, of class Account.
     */
    @Test
    public void testShowProfile() {
        System.out.println("showProfile");
        Account instance = new Account();
        instance.showProfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMore method, of class Account.
     */
    @Test
    public void testShowMore() {
        System.out.println("showMore");
        Account instance = new Account();
        instance.showMore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
