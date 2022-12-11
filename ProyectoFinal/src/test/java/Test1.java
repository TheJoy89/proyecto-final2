import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {


    WebDriver wd;

    @BeforeMethod
    public void inputtest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        wd = new ChromeDriver();

        wd.get("http://oscaraw.com/qa");

        WebElement input =  wd.findElement(By.xpath("/html/body/form/input[3]"));

        Assert.assertTrue(input.isDisplayed());
        Thread.sleep(5000);

    }




    @Test
    public void pagetitle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        wd = new ChromeDriver();

        wd.get("http://oscaraw.com/qa");

        wd.findElement(By.xpath("/html/body/form/input[3]"));

        WebElement logo;
        Assert.assertEquals(wd.getTitle(), "Productos");
        Thread.sleep(5000);


    }






    @Test()
    public void registrartest() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        wd = new ChromeDriver();

        wd.get("http://oscaraw.com/qa");


        Thread.sleep(5000);
    }




    @AfterMethod
    public void teardown() {

        wd.quit();

    }
}



