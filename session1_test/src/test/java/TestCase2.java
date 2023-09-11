import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

    WebDriver driver;
    SoftAssert soft=new SoftAssert();
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void search(){
        WebElement txt =driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        txt.sendKeys("mo salah");
        txt.sendKeys(Keys.ENTER);
     }
    @Test(priority = 1)
    public void Remove_search(){
        WebElement txt =driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        txt.clear();
        txt.sendKeys("Ronaldo");
        txt.sendKeys(Keys.ENTER);
    }
   /* @Test(priority = 2)
    public void Assertion(){
        WebElement actual_result =driver.findElement(By.xpath("//*[@id=\"result-stats\"]/text()"));
        String actual=actual_result.getText();
        System.out.println(actual);
        String expected="حوالى 708,000,000 نتيجة";
       // soft.assertEquals(actual,expected,"error in the assertion");
    }*/
   @Test(priority = 3)
   public void scrolling_down(){

   }

    @AfterTest
    public void close(){
        driver.close();
       // soft.assertAll();
    }



}
