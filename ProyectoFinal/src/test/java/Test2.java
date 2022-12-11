import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

    WebDriver wd;



    @BeforeClass
    @Parameters({"browser", "url"})
    public void setup(String browser, String app) {

        if (browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            wd = new ChromeDriver();


        } else if (browser.equalsIgnoreCase("firefox")){

            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            wd = new FirefoxDriver();


        }

        wd.get(app);

    }

    @Test(priority = 1)
    public void logintest() throws InterruptedException {


      /*  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        wd = new ChromeDriver();

        wd.get("http://oscaraw.com/qa");*/

        wd.findElement(By.name("user")).sendKeys("prueba1");
        wd.findElement(By.name("pass")).sendKeys("prueba1");
        wd.findElement(By.xpath("/html/body/form/input[3]")).click();
        Thread.sleep(5000);

    }



    @Test(priority = 2)
    public void logintest2() throws InterruptedException {


      /*  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        wd = new ChromeDriver();

        wd.get("http://oscaraw.com/qa");*/

        wd.findElement(By.name("user")).sendKeys("pedro1");
        wd.findElement(By.name("pass")).sendKeys("pedro1");
        wd.findElement(By.xpath("/html/body/form/input[3]")).click();

        Assert.assertEquals(wd.findElement(By.id("error")), wd.findElement(By.id("error")));
        Thread.sleep(5000);
    }



    @Test(priority = 4)
    public void logintest3() throws InterruptedException {


      //  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

     //   wd = new ChromeDriver();

      //  wd.get("http://oscaraw.com/qa");


        wd.findElement(By.xpath("/html/body/form/input[3]")).click();

        Assert.assertEquals(wd.findElement(By.xpath("/html/body/a")), wd.findElement(By.id("/html/body/form")));
        Thread.sleep(5000);
    }





    @AfterMethod
    public void teardown() {

        wd.quit();

    }


}
