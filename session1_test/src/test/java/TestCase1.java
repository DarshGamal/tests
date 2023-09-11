import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 {
    SoftAssert soft=new SoftAssert();
    @BeforeClass
    public void before_class() {
        System.out.println("Before class");
    }

    @Test(enabled = true)
    public void test1(){
       // soft.assertTrue(5>10,"condionannnnno");
        System.out.println("This is my first test");
    }
    @Test
    public void test2(){

        soft.assertEquals(1,2,"واحد مش بيساوي اتنين ");
        System.out.println("This is my second test");
    }
    @AfterClass
    public void after_class() {
        System.out.println("After class");

    }

}
