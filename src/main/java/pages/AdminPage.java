package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AdminPage {

    private WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    private By adminMenu = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"][1]");
    private By usernameField = By.cssSelector(".oxd-form .oxd-input");
    private By searchButton = By.xpath("//button[@type=\"submit\"]");
    private By resetButton = By.xpath("//button[text()=' Reset ']");
    private By logOut = By.xpath("//a[text()=\"Logout\"]");

    // job filter с клик се отварят опциите на филтъра, основата на филтъра 1
    private By jobFilter = By.xpath("//span[@class=\"oxd-topbar-body-nav-tab-item\" and text()=\"Job \"]");
    // ul списък с линковете от дропдауна
    private By jobOptionsUl = By.xpath("//ul[@class=\"oxd-dropdown-menu\"]");
    // първия линк от списъка
    private By jobTitlesLink = By.xpath("//a[text()=\"Job Titles\"]");

    //dropdown
    private By organizationFilter = By.xpath("//span[@class=\"oxd-topbar-body-nav-tab-item\" and text()='Organization ']");
    //ul list
    private By organizationOptionsUl = By.xpath("//ul[@class=\"oxd-dropdown-menu\"]");


    // Organization Filter
    public void clickOrganizationFilterDropdown() {
        driver.findElement(organizationFilter).click();
    }
    // Organization Filter
    public List<String> getOrganizationFilterDropdownOptionsList(){
        List<WebElement> optionsList = driver.findElement(organizationOptionsUl).findElements(By.tagName("li"));
        System.out.println(optionsList.size());
        System.out.println(optionsList.stream().map(e -> e.getText()).collect(Collectors.toList()));
        return optionsList.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    // Job Filter
    public void clickJobFilterDropdown() {
        driver.findElement(jobFilter).click();
    }


    public void getJobFilterDropdownOptionsList() {
        List<WebElement> optionsList = driver.findElement(jobOptionsUl).findElements(By.tagName("li"));
        //дава броя на линковете
        System.out.println(optionsList.size());
        //дава списък на линковете
        System.out.println(optionsList.stream().map(e -> e.getText()).collect(Collectors.toList()));
    }


    // Job Filter Options
    public void clickOnPayGrades() {
        List<WebElement> optionsList = driver.findElement(jobOptionsUl).findElements(By.tagName("li"));
        for (WebElement li : optionsList) {
            if (li.getText().equals("Pay Grades")) {
                li.click();
                break;
            }
        }
    }

    public void clickOnJobTitles() {
        List<WebElement> optionsList = driver.findElement(jobOptionsUl).findElements(By.tagName("li"));
        for (WebElement li : optionsList) {
            if (li.getText().equals("Job Titles")) {
                li.click();
                break;
            }
        }
    }
    // Job Filter last method
    public void clickOnEmploymentStatus() {
        List<WebElement> optionsList = driver.findElement(jobOptionsUl).findElements(By.tagName("li"));
        for (WebElement li : optionsList) {
            if (li.getText().equals("Employment Status")) {
                li.click();
                break;
            }
        }
    }

    //another way to iterate through list
    public void iterateList() {
        List<WebElement> optionsList = driver.findElement(jobOptionsUl).findElements(By.tagName("li"));
        Iterator<WebElement> itr = optionsList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getText());
        }
    }

    public void clickAdminMenu() {
        driver.findElement(adminMenu).click();
    }

    public void selectUsername(String name) {
        driver.findElement(usernameField).sendKeys(name);
    }

    public void selectSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void selectResetButton() {
        driver.findElement(resetButton).click();
    }

    public void setLogOut() {
        driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
        driver.findElement(logOut).click();
    }

}


