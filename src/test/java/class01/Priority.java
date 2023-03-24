package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 3)
    public void aTest(){
        System.out.println("I am test A");
    }
    @Test(priority = 1)
    public void bTest(){
        System.out.println("I am test B");
    }
    @Test(priority = 2)
    public void cTest(){
        System.out.println("I am test C");
    }
    //0 has the highest priority then 1,2.......
}
