package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGannotations {

    @BeforeMethod
    public void beforeMethods(){
        System.out.println("I am before method");
        //doesn't matter where you put it will always run before each method @Test
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("I am after method");
    }

        @Test(groups = "regression")
    public void aFirstTestCase(){
            System.out.println("I am the first test case");
        }

        @Test

    public void bSecondTestCase(){
            System.out.println("I am the second test case");
        }

        @Test
    public void cSecondTestCase(){
            System.out.println("I am the 3rd test case");
        }

        //Tests are executed in alphabetic order a,b,c...



}
