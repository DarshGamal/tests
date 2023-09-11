import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.RegisterPage;

public class SampleTest1 extends BaseTest{


    @Test(priority = 0)
    public void RegisterTest(){
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.clickOnRigsterButton();
        registerPage.clickOnMaleCheckBox();
        registerPage.enterFirstName("sasa");
        registerPage.enterLastName("mostafa");
        registerPage.selectDay("13");
        registerPage.selectMonth("October");
        registerPage.selectYear("2001");
        registerPage.enterEmail("a@gmail.com");
        registerPage.enterCompanyName("dxc");
        registerPage.enterPassword("123456");
        registerPage.enterConfirmPassword("123456");
        registerPage.clickOnRegisterSubmit();
    }
    @Test(priority = 1)
    public void loginTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.ClickLoginButton();
        loginPage.enterEmail("a@gmail.com");
        loginPage.enterPassword("123456");
       loginPage.ClickLoginSubmit();

    }


}
