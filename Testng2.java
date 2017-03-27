	
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Testng2 {
    public String baseUrl = "http://newtours.demoaut.com/";
    String driverPath = "C:\Users\Spandhana\Downloads\geckodriver-v0.9.0-win64\geckodriver.exe";
    public WebDriver driver ; 
     @AfterTest                            //Jumbled
      public void terminateBrowser(){
          driver.close();
      }
     @BeforeTest                            //Jumbled
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.firefox.marionette", driverPath);
          driver = new FirefoxDriver();
          driver.get(baseUrl);
      }
      @Test                                //Jumbled
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      
}