package admin;

import base.Base;
import org.testng.annotations.Test;
import pages.AdminPage;

public class AdminPageTests extends Base {

    @Test
    public void clickAdminMenu() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(1000);

    }

    @Test
    public void clickSearchButton() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(3000);
        adminPage.selectUsername("Admin");
        Thread.sleep(3000);
        adminPage.selectSearchButton();
        Thread.sleep(1000);


    }

    @Test
    public void clickResetButton() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(3000);
        adminPage.selectUsername("Admin");
        Thread.sleep(3000);
        adminPage.selectResetButton();
        Thread.sleep(1000);


    }










}
