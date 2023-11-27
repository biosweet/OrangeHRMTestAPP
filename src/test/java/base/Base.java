package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class Base {


    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        this.driver = new ChromeDriver(options);
        this.driver.manage().window().maximize();
        goHome();
        loginPage = new LoginPage(driver);
    }

    @BeforeMethod

    public void goHome() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod

    public void logOut() {
        driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
    }

    @AfterClass

    public void tearDown() {
        driver.quit();
    }


}
