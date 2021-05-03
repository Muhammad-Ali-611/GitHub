package landingPage;


import base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Search  extends CommonAPI {

    @Test
    public void Search() throws InterruptedException {
     System.setProperty("WebDriver . chromeDrive","C:\\Users\\chma6\\Links\\GitHub\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.get("https://www.facebook.com/");
        driver.navigate();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("chma616@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Alidhoom3756");
        driver.findElement(By.id("login")).click();
    }



}