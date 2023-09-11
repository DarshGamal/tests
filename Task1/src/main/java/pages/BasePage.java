package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    By loginButton=By.xpath("//a[@class=\"ico-login\"]");
    By registerButton= By.xpath("//a[@class=\"ico-register\"]");
    By searchTextBox= By.xpath("//*[@id=\"small-searchterms\"]");

    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnRigsterButton(){driver.findElement(registerButton).click();}
    public void enterTextInSearchBox(String txt){
        driver.findElement(searchTextBox).sendKeys(txt);
    }
    public void ClickLoginButton(){driver.findElement(loginButton).click();}


}
