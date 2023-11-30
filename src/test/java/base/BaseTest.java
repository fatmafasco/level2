package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import reader.ReaderDataFromJson;

import java.io.FileNotFoundException;

public class BaseTest {
    WebDriver driver;
   protected ReaderDataFromJson readerDataFromJson;
   protected HomePage homePage;
    @BeforeClass
    public void setUp() throws FileNotFoundException {
        readerDataFromJson=new ReaderDataFromJson();
        driver=new ChromeDriver();
        driver.get(readerDataFromJson.raedJsonFile().URL
        );
        homePage=new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
