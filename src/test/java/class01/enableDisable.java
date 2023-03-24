package class01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false)
    public void aFirstTestCase(){
        System.out.println("I am the first test case");
    }

    @Test

    public void bSecondTestCase(){
        System.out.println("I am the second test case");
    }
    @Test(enabled = false)
    public void cSecondTestCase(){
        System.out.println("I am the 3rd test case");
    }


}


