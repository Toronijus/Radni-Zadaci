import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class DemoblazeTest {
    private static final WebDriverManager wdm = new ChromeDriverManager();
    private static WebDriver driver;
     private static WebDriverWait wdw;


    @BeforeClass
    public void beforeClass() {


    }

    @BeforeMethod
    public void setUp() {
        wdm.setup();
        driver = new ChromeDriver();
        wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void SamsungGalaxy() throws InterruptedException {

        driver.navigate().to("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s6")));
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("#nava")).click();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Samsung galaxy s7")));
        driver.findElement(By.linkText("Samsung galaxy s7")).click();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("cartur")).click();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Delete")));
        driver.findElement(By.linkText("Delete")).click();
    }

    @Test
    public void Monitor() throws InterruptedException {
        driver.navigate().to("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Monitors")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("ASUS Full HD")).click();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("cartur")).click();
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Delete")));
        driver.findElement(By.linkText("Delete")).click();

            }

    @AfterMethod
    public void tearDown() {
        wdm.quit();
    }

    @AfterClass
    public void afterClass() {

    }
}
