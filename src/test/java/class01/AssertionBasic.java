package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionBasic {

    public static WebDriver driver;
    @BeforeMethod
    public void SetupBrowser(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);// should be in the final result /it's ok to use it just to test
        driver.quit();
    }
    @Test
    public void InvalidCredentials() {

        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("abracadabra");
        WebElement loginBtn= driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();
        WebElement error = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String errorMsg = error.getText();

        String expectedError = "Invalid credentials";

       /* if (errorMsg.equalsIgnoreCase(expectedError)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }*/
        //can't be used in testing because the test case will pass regardless we need to use Assertions

        Assert.assertEquals(expectedError,errorMsg);
        System.out.println("I am here");

        password= driver.findElement(By.xpath("//input[@id='txtPassword']"));

        boolean passwordDisplayed = password.isDisplayed();

        Assert.assertTrue(passwordDisplayed);
        //Hard Assertions as soon one of the conditions fails the rest of the code will not execute

    }
}
