package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandles {
    protected WebDriver driver;
    WebDriverWait wait;
    private final By Loader=By.cssSelector(".ajax-loading-block-window");
    public MethodHandles(WebDriver driver){
        this.driver=driver;
    }
    protected void invesiabiltyOfElement(By locator,int time){
     try {
         wait=new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));}
     catch (NoSuchElementException e){

     }
    }
    protected void explicitWait(By locator,int time){
        wait=new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOf(driver.findElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator),
                ExpectedConditions.presenceOfElementLocated(locator),
                ExpectedConditions.elementToBeClickable(locator)
        ));}
    protected static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
    }
    private WebElement webElement(By locator){

     return driver.findElement(locator);
    }

    protected void click(By locator){
        //wait untill invasiabilty of loader
        invesiabiltyOfElement(Loader,20);
        //wait
        explicitWait(locator,20);
        //scroll into elment
        scrollToElement(driver, driver.findElement(locator));
        webElement(locator).click();


    }
    protected void sendkeys(By locator,String text){
       explicitWait(locator,15);
        webElement(locator).sendKeys(text);

        ;}


}
