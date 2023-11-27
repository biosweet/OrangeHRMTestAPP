package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.cssSelector("input[name='username']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[@type=\"submit\"]");

    public void setName(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void logIn() {
        setName("Admin");
        setPassword("admin123");
        clickLoginButton();
    }

    public AdminPage clickLogInAdminPage() throws InterruptedException {
        Thread.sleep(3500);
        logIn();
        return new AdminPage(driver);
    }

    public SidePanelPage clickLogInSidePanelPage() throws InterruptedException {
        Thread.sleep(3500);
        logIn();
        return new SidePanelPage(driver);
    }

}
