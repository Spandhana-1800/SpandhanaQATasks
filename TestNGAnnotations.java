package FirstTestNg;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class TestNGAnnotations {
  @org.testng.annotations.Test
  public void Test()
  {
         System.out.println("Test");
  }
  @BeforeClass
  public void BeforeClass()
  {
         System.out.println("@BeforeClass");
  }
  @AfterClass
  public void AfterClass()
  {
         System.out.println("@AfterClass");
  }
  @BeforeTest
  public void BeforeTest()
  {
         System.out.println("@BedforeTest");
  }
  @AfterTest
  public void AfterTest()
  {
         System.out.println("@AfterTest");
  }
  @BeforeSuite
  public void BeforeSuite()
  {
         System.out.println("@BeforeSuite");
  }
  @AfterSuite
  public void AfterSuite()
  {
         System.out.println("@AfterSuite");
  }     
}
