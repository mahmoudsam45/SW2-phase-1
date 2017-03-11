

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
import java.util.ArrayList;
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
 ArrayList<Game>subgame=new ArrayList<Game>();
   // Vector<Game>subgame2=new Vector<Game>();
    g.setName ("Math1");
   g.setCategorie ("Math");
   g.setOwner ("Ahmed");
   g2.setName ("Math2");
   g2.setCategorie ("Math");
   g2.setOwner ("Ahmed");
   g3.addGame(g);
   g3.addGame(g2);
    subgame.add(g);
   subgame.add(g2);
       System.err.println("SUb Size"+subgame.size());
   assertEquals( g3.getGames("Math"),subgame);
   }
@Test//test to fail 
   public void test_Get_games2()
   {Game g = new Game();
   Game g2 = new Game();
   GameDBController g3 = new GameDBController();
   ArrayList<Game>subgame=new ArrayList<Game>();
   // Vector<Game>subgame2=new Vector<Game>();
    g.setName ("Math1");
   g.setCategorie ("Math");
   g.setOwner ("Ahmed");
   g2.setName ("Math2");
   g2.setCategorie ("Math");
   g2.setOwner ("Ahmed");
   g3.addGame(g);
   g3.addGame(g2);
   subgame.add(g);
   subgame.add(g2);
   assertEquals(subgame, g3.getGames("mAth"));
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
   
}
