import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaucedemoLogIn {

    private static WebDriverManager wdmanager = new ChromeDriverManager();
    private static WebDriver driver;
    private static WebDriverWait wdwait;

    public static List<String> usernamesL() {
        String username = driver.findElement(By.cssSelector("#login_credentials")).getText();
        List<String> usernames = new ArrayList<String>(Arrays.asList(username.split("\n")));
        usernames.remove(0);
        return usernames;

    }

    public static String password() {
        driver.navigate().to("https://www.saucedemo.com/");
        String password0 = driver.findElement(By.className("login_password")).getText();
        List<String> passwords = new ArrayList<String>(Arrays.asList(password0.split("\n")));
        passwords.remove(0);
        String password1 = passwords.get(0).toString();

        return password1;
    }

    public static void logStandard() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        wdmanager.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void logIn1() {
        String pass = password();
        String user = usernamesL().get(0);
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#login-button")).click();
        String strana = driver.getCurrentUrl();
        Assert.assertEquals(strana, "https://www.saucedemo.com/inventory.html");
    }


    @Test
    public void logIn2() {
        String pass = password();
        String user = usernamesL().get(1);
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#login-button")).click();
        String strana = driver.getCurrentUrl();
        WebElement error = driver.findElement(By.cssSelector("div.login_wrapper div.login_wrapper-inner div.form_column div.login-box form:nth-child(1) div.error-message-container.error:nth-child(3) > h3:nth-child(1)"));
        Assert.assertEquals(error.getText(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void logIn3() {
        String pass = password();
        String user = usernamesL().get(2);
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#login-button")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void logIn4() {
        String pass = password();
        String user = usernamesL().get(3);
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#login-button")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }
    @Test
    public void invalidUsername() {
        String pass = password();
        String user = "Slobodan";
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#login-button")).click();
        WebElement error = driver.findElement(By.cssSelector("div.login_wrapper div.login_wrapper-inner div.form_column div.login-box form:nth-child(1) div.error-message-container.error:nth-child(3) > h3:nth-child(1)"));
        Assert.assertEquals(error.getText(), "Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void invalidPassword() {
        String pass = "password";
        String user = usernamesL().get(0);
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#login-button")).click();
        WebElement error = driver.findElement(By.cssSelector("div.login_wrapper div.login_wrapper-inner div.form_column div.login-box form:nth-child(1) div.error-message-container.error:nth-child(3) > h3:nth-child(1)"));
        Assert.assertEquals(error.getText(), "Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void invalidBoth() {
        String pass = "password";
        String user = "Slobodan";
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#login-button")).click();
        WebElement error = driver.findElement(By.cssSelector("div.login_wrapper div.login_wrapper-inner div.form_column div.login-box form:nth-child(1) div.error-message-container.error:nth-child(3) > h3:nth-child(1)"));
        Assert.assertEquals(error.getText(), "Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void logOut() {
        logStandard();
        driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
        wdwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#logout_sidebar_link"))));
        driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
        Assert.assertEquals(driver.getCurrentUrl(),  "https://www.saucedemo.com/");;
    }

}