package admin;

import base.Base;
import org.testng.annotations.Test;
import pages.AdminPage;

public class JobTabTests extends Base {

    @Test
    public void iterateList()
            throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(3000);
        adminPage.clickJobFilterDropdown();
        Thread.sleep(3500);
        adminPage.iterateList();
        Thread.sleep(3500);

    }


    @Test
    public void clickUserRoleEmploymentStatus() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(1500);
        adminPage.clickAdminMenu();
        Thread.sleep(1000);
        adminPage.clickJobFilterDropdown();
        Thread.sleep(3000);
        adminPage.clickOnEmploymentStatus();
        Thread.sleep(3500);


    }
    @Test
    public void clickUserRolePayGrades() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(3000);
        adminPage.clickJobFilterDropdown();
        Thread.sleep(3500);
        adminPage.clickOnPayGrades();
        Thread.sleep(3500);


    }
    @Test
    public void clickUserRoleJobTitles() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(3000);
        adminPage.clickJobFilterDropdown();
        Thread.sleep(3500);
        adminPage.clickOnJobTitles();
        Thread.sleep(3500);


    }
    @Test
    public void getUserRolesLinks() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(1000);
        adminPage.clickJobFilterDropdown();
        Thread.sleep(3500);
        adminPage.getJobFilterDropdownOptionsList();
        Thread.sleep(3500);

    }



}
