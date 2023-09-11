import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3 {
    WebDriver driver;
    SoftAssert soft=new SoftAssert();
    @BeforeTest
    public void setup(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
    }
    @Test(priority = 0)
    public void Get_current_url(){
        String myurl= driver.getCurrentUrl();
        soft.assertEquals(myurl,"https://www.google.com/","error ");

    }

    @Test(priority = 1)
    public void get_title(){
        String title=driver.getTitle();
        soft.assertEquals(title,"Google","error2 ");
    }
    @AfterTest
    public void close(){
        driver.close();
        soft.assertAll();
    }


}
