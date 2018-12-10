import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Mail {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/romanermasevic/Selenium/Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.tut.by");
        driver.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("roma420@tut.by");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("rrrr4444");
        driver.findElement(By.xpath("//*[@value=\"Войти\"]")).click();
        String refresh = Keys.chord(Keys.COMMAND, "R");

    }
}
