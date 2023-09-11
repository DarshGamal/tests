import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class test extends BaseTest{


    @Test(priority = 0)
    public void register() {

        WebElement register_btn = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register_btn.click();

        WebElement male = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
        male.click();

        WebElement fname = driver.findElement(By.xpath("//*[@id=\"FirstName\"]\n"));
        fname.sendKeys("Mostafa");

        WebElement lname = driver.findElement(By.xpath("//*[@id=\"LastName\"]\n"));
        lname.sendKeys("Gamal");

        WebElement day = driver.findElement(By.xpath("//div[@class=\"date-picker-wrapper\"]//select[1]\n"));
        Select s_day=new Select(day);
        s_day.selectByValue("13");

        WebElement month = driver.findElement(By.xpath("//div[@class=\"date-picker-wrapper\"]//select[2]\n"));
        Select s_month=new Select(month);
        s_month.selectByVisibleText("October");

        WebElement year = driver.findElement(By.xpath("//div[@class=\"date-picker-wrapper\"]//select[3]\n"));
        Select s_year=new Select(year);
        s_year.selectByValue("2001");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("mostafaaa@gmail.com");

        WebElement company = driver.findElement(By.xpath("//*[@id=\"Company\"]\n"));
        company.sendKeys("Foodex");

        WebElement check_box = driver.findElement(By.xpath("//*[@id=\"Newsletter\"]\n"));
        check_box.click();

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]\n"));
        pass.sendKeys("123456789");

        WebElement Cpass= driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]\n"));
        Cpass.sendKeys("123456789");

        WebElement register_btn2= driver.findElement(By.xpath("//*[@id=\"register-button\"]\n"));
        register_btn2.submit();

    }
   @Test(priority = 1)
    public void login(){
        WebElement login_btn= driver.findElement(By.xpath("//a[@class=\"ico-login\"] \n"));
        login_btn.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]\n"));
        email.sendKeys("mostafaaa@gmail.com");

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]\n"));
        pass.sendKeys("123456789");

        WebElement remember_me=driver.findElement(By.xpath("//*[@id=\"RememberMe\"]\n"));
        remember_me.click();

    WebElement login_btn2= driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]\n"));
    login_btn2.submit();

    }

}
