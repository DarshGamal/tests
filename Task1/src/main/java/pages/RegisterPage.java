package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {
    By maleButton=By.xpath("//*[@id=\"gender-male\"]");
    By firstName=By.xpath("//*[@id=\"FirstName\"]\n");
    By lastName=By.xpath("//*[@id=\"LastName\"]\n");
    By day=By.xpath("//div[@class=\"date-picker-wrapper\"]//select[1]\n");
    By month=By.xpath("//div[@class=\"date-picker-wrapper\"]//select[2]\n");
    By year=By.xpath("//div[@class=\"date-picker-wrapper\"]//select[3]\n");
    By email=By.xpath("//*[@id=\"Email\"]");
    By Company=By.xpath("//*[@id=\"Company\"]\n");
    By password=By.xpath("//*[@id=\"Password\"]\n");
    By ConfirmPassword=By.xpath("//*[@id=\"ConfirmPassword\"]\n");
    By registerSubmit=By.xpath("//*[@id=\"register-button\"]\n");
    public RegisterPage(WebDriver driver){super(driver);}
    public void clickOnMaleCheckBox(){driver.findElement(maleButton).click();}
    public void enterFirstName(String fname){driver.findElement(firstName).sendKeys(fname);}
    public void enterLastName(String lname){driver.findElement(lastName).sendKeys(lname);}
    public void selectDay(String dayValue){
        Select Oday=new Select(driver.findElement(day));
        Oday.selectByValue(dayValue);
    }
    public void selectMonth(String monthDay){
        Select Omonth=new Select(driver.findElement(month));
        Omonth.selectByVisibleText(monthDay);
    }
    public void selectYear(String yearValue){
        Select Oyear=new Select(driver.findElement(year));
        Oyear.selectByValue(yearValue);
    }
    public void enterEmail(String mail){driver.findElement(email).sendKeys(mail);}
    public void enterCompanyName(String cname){driver.findElement(Company).sendKeys(cname);}
    public void enterPassword(String pass){driver.findElement(password).sendKeys(pass);}
    public void enterConfirmPassword(String cpass){driver.findElement(ConfirmPassword).sendKeys(cpass);}
    public void clickOnRegisterSubmit(){driver.findElement(registerSubmit).click();}

}
