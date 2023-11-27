package admin;

import base.Base;
import org.testng.annotations.Test;
import pages.AdminPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class OrganizationTabTests extends Base {

    @Test
    public void clickOrganizationFilterDropdown() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(1000);
        adminPage.clickOrganizationFilterDropdown();
        Thread.sleep(3500);

    }

    @Test
    public void getOptionsList() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(1000);
        adminPage.clickOrganizationFilterDropdown();
        Thread.sleep(3500);
        adminPage.getOrganizationFilterDropdownOptionsList();
        Thread.sleep(1000);

    }

    @Test
    public void getOptionsListCheck() throws InterruptedException {
        AdminPage adminPage = loginPage.clickLogInAdminPage();
        Thread.sleep(3500);
        adminPage.clickAdminMenu();
        Thread.sleep(1000);
        adminPage.clickOrganizationFilterDropdown();
        Thread.sleep(3500);
        adminPage.getOrganizationFilterDropdownOptionsList();
        Thread.sleep(1000);
        List<String> selectedOptions = adminPage.getOrganizationFilterDropdownOptionsList();
        assertEquals(selectedOptions.size(),3,"Incorrect number of selections");

    }





}
