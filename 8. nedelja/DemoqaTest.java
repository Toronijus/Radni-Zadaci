import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DemoqaTest {
 private static WebDriverManager wdm = new ChromeDriverManager();
 private static WebDriver driver;
/*
 Nisam stigao vise da testiram i kucam zbog obaveza,
*/
    @BeforeClass
    public void beforeClass() {
        wdm.setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setUp() {
        driver.navigate().to("https://demoqa.com/");
    }


    @Test
    public void Elementi() throws InterruptedException {
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        Element.click();
        System.out.println(driver.getCurrentUrl());
        WebElement textbox = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
        textbox.click();
        WebElement ime = driver.findElement(By.cssSelector("#userName"));
        ime.sendKeys("Slobodan Bogdanovic");
        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("prvipokusaj");
        Thread.sleep(5000);
        email.clear();
        email.sendKeys("bogdanovic.slobodan90@gmail.com");
        WebElement adresa = driver.findElement(By.cssSelector("#currentAddress"));
        adresa.sendKeys("Maljenska 10");
        WebElement adresa2 = driver.findElement(By.cssSelector("#permanentAddress"));
        adresa2.sendKeys("Maljenska 10");
        Thread.sleep(2000);
        WebElement potvrda = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));
        potvrda.click();
        WebElement output = driver.findElement(By.xpath("//*[@id=\"output\"]"));
        System.out.println(output.isDisplayed());

        Thread.sleep(5000);

    }

    @Test
    public void checkbox() {
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        Element.click();
        System.out.println(driver.getCurrentUrl());
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]"));
        checkbox.click();
        WebElement kvadrat = driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox > svg"));
        kvadrat.click();
        WebElement output2 = driver.findElement(By.xpath("//*[@id=\"result\"]/span[17]"));

        System.out.println(output2.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {

    }


}