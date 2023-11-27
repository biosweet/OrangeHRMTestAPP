package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SidePanelPage {

    private WebDriver driver;

    public SidePanelPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchField = By.xpath("//input[@class=\"oxd-input oxd-input--active\"]");
    private By admin = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Admin\"]");
    private By pim = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"PIM\"]");
    private By leave = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Leave\"]");
    private By time = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Time\"]");
    private By recruitment = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Recruitment\"]");
    private By myInfo = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"My Info\"]");
    private By performance = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Performance\"]");
    private By dashboard = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Dashboard\"]");
    private By directory = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Directory\"]");
    private By maintenance = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Maintenance\"]");
    private By claim = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Claim\"]");
    private By buzz = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()=\"Buzz\"]");
    private By cancelButton = By.xpath("//button[@type=\"button\"]");


    public void clickCancelMaintenance() {
        driver.findElement(cancelButton).click();
    }

    public void clickOnSearchField(String text) {
        driver.findElement(searchField).sendKeys(text);
    }

    public void clickOnAdminPanel() {
        driver.findElement(admin).click();
    }

    public void clickOnPimPanel() {
        driver.findElement(pim).click();
    }

    public void clickOnLeavePanel() {
        driver.findElement(leave).click();
    }

    public void clickOnTimePanel() {
        driver.findElement(time).click();
    }

    public void clickOnRecruitmentPanel() {
        driver.findElement(recruitment).click();
    }

    public void clickOnMyInfoPanel() {
        driver.findElement(myInfo).click();
    }

    public void clickOnPerformancePanel() {
        driver.findElement(performance).click();
    }

    public void clickOnDashboardPanel() {
        driver.findElement(dashboard).click();
    }

    public void clickOnDirectoryPanel() {
        driver.findElement(directory).click();
    }

    public void clickOnMaintenancePanel() {
        driver.findElement(maintenance).click();
    }

    public void clickOnClaimPanel() {
        driver.findElement(claim).click();
    }

    public void clickOnBuzzPanel() {
        driver.findElement(buzz).click();
    }


}
