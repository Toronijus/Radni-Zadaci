import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.slf4j.*;

import javax.swing.*;
import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.testng.Assert.*;

public class youtubeTest {
    public static WebDriverManager wdm = new ChromeDriverManager();
    public static WebDriver driver;
    public static WebDriverWait wdw;

    @BeforeMethod
    public void setUp() {
        wdm.setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void laksiNacin() throws InterruptedException {
        driver.navigate().to("https://www.youtube.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement pretraga = driver.findElement(By.cssSelector("input[id='search']"));
        pretraga.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        pretraga.sendKeys("rick astley");
        driver.findElement(By.cssSelector("#search-icon-legacy")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)")).click();

    }

    @Test
    public void teziNacin() throws InterruptedException {
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name = 'q']")).sendKeys("youtube");
        driver.findElement(By.cssSelector("input[name = 'q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > h3")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[id='search']")).sendKeys(Keys.ENTER);
        ;
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='search']")).sendKeys("rick astley");
        driver.findElement(By.cssSelector("#search-icon-legacy")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Official Music Video)")).click();
        Thread.sleep(20000);
        /*
        pokusavao sam i pokupio elemente ali mi prijavljuje da nisu klikabilni i nece da izvrsi komandu da prebaci
        List<WebElement> next = driver.findElements(By.id("video-title"));
        System.out.println(next.size());
        for (int i =0;i< next.size(); i++){
            System.out.print(next.get(i).getText() + " ");

        }
        String drugi = next.get(2).getText();
        driver.findElement(By.linkText(drugi)).click();

*/
        }
    }