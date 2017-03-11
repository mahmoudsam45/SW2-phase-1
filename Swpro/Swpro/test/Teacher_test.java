/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import Three.Account;
import Three.Teacher;
import  Three.TeacherDBController;
import org.testng.annotations.Test;

/**
 *
 * @author amrfo_000
 */
public class Teacher_test {
    
    @Test
    public void test_valid_Name()
    {Teacher t=new Teacher();
    TeacherDBController tt=new TeacherDBController();
    
    t.setAccountName("ahmed");
    t.setPassword("1234");
    TeacherDBController.addAccount(t);
        assertEquals(false, tt.validateName("ahmed"));
    }
    @Test
    public void test_valid_Name2()
    {Teacher t=new Teacher();
    TeacherDBController tt=new TeacherDBController();
    
   t.setAccountName("ahmed");
    t.setPassword("1234");
    TeacherDBController.addAccount(t);
        assertEquals(true, tt.validateName("ahmed ali"));
    }
    public Teacher_test() {
    }
    @Test
    public void test_LOgin()
    {
        Teacher t=new Teacher();
    TeacherDBController tt=new TeacherDBController();
    
    t.setAccountName("ahmed");
    t.setPassword("1234");
    TeacherDBController.addAccount(t);
        assertEquals(t, tt.validateLogin("ahmed", "1234"));
    }
     @Test
    public void test_LOgin2()
    {
        Teacher t=new Teacher();
    TeacherDBController tt=new TeacherDBController();
    
   t.setAccountName("ahmed");
    t.setPassword("1234");
    TeacherDBController.addAccount(t);
        assertEquals(t, tt.validateLogin("ahmed mohammed", "1234"));
    }
 @Test
    public void test_LOgin3()
    {Teacher t=new Teacher();
    TeacherDBController tt=new TeacherDBController();
    
    t.setAccountName("ahmed");
    t.setPassword("1234");
    TeacherDBController.addAccount(t);
        assertEquals(t, tt.validateLogin("ahmed", "123456718"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
}
