import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest{

    LoginPage loginPage;
    @Test(priority = 0)
    public void loginWithValidEmailAndPassword(){
        loginPage =new LoginPage(driver);
        loginPage.ClickLoginButton();
        loginPage.enterEmail("a@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.ClickLoginSubmit();
    }
    @Test(priority = 1)
    public void loginWithinValidEmailAndPassword(){
        loginPage =new LoginPage(driver);
        loginPage.ClickLoginButton();
        loginPage.enterEmail("uu@gmail.com");
        loginPage.enterPassword("1236456");
        loginPage.ClickLoginSubmit();
    }
    @Test(priority = 2)
    public void loginWithEmptyEmail(){
        loginPage =new LoginPage(driver);
        loginPage.ClickLoginButton();
        loginPage.enterEmail("");
        loginPage.enterPassword("1236456");
        loginPage.ClickLoginSubmit();
    }
}
