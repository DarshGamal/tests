import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class SampleTest2 extends BaseTest {



    @Test(priority = 0)
    public void searchTest(){
        SoftAssert softAssert=new SoftAssert();
        HomePage homePage=new HomePage(driver);
        homePage.enterTextInSearchBox("test");
        homePage.ClickOnSearchButton();
        softAssert.assertEquals(homePage.returnTextResult(),"No products were found that matched your criteria.","errrror");
        softAssert.assertAll();

    }
}
