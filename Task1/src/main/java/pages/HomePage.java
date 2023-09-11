package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{



    By searchButton= By.xpath("//*[@id=\"small-search-box-form\"]/button");
    By textResult=By.xpath("//div[@class=\"no-result\"]");
    public HomePage(WebDriver driver){
        super(driver);
    }
    public void ClickOnSearchButton(){
        driver.findElement(searchButton).click();
    }
    public String returnTextResult(){
       return driver.findElement(textResult).getText();
    }

}
