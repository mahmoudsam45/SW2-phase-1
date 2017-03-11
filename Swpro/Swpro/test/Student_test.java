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
import Three.Student;
import Three.StudentDBController;
import org.testng.annotations.Test;

/**
 *
 * @author amrfo_000
 */
public class Student_test {
    
    
    @Test
    public void test_update_student_score()
    {Student s=new Student();
    s.setAccountName("Ahmed");
    s.setScore(3.5);
    StudentDBController st=new StudentDBController();
    st.addAccount(s);
    st.updateScore("Ahmed",2.5);
    assertEquals(6.0, s.getScore());
    }
    
    @Test
    public void test_update_student_score2()
    {
    Student s=new Student();
    s.setAccountName("Ahmed");
    s.setScore(3.5);
    StudentDBController st=new StudentDBController();
    st.addAccount(s);
    st.updateScore("Ahmed",2.5);
        assertEquals(6.0001, s.getScore());
    } 
    
    public Student_test() {
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
