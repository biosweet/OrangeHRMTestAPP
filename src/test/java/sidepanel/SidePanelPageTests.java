package sidepanel;

import base.Base;
import org.testng.annotations.Test;
import pages.SidePanelPage;

public class SidePanelPageTests extends Base {

    @Test
    public void checkAdminPanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnAdminPanel();
        Thread.sleep(3500);
    }

    @Test
    public void checkLeavePanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnLeavePanel();
        Thread.sleep(3500);
    }

    @Test
    public void checkTimePanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnTimePanel();
        Thread.sleep(3500);
    }
    @Test
    public void checkRecruitmentPanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnRecruitmentPanel();
        Thread.sleep(3500);
    }
    @Test
    public void checkMyInfoPanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnMyInfoPanel();
        Thread.sleep(3500);
    }
    @Test
    public void checkPerformancePanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnPerformancePanel();
        Thread.sleep(3500);
    }
    @Test
    public void checkDashboardPanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnDashboardPanel();
        Thread.sleep(3500);
    }
    @Test
    public void checkDirectoryPanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnDirectoryPanel();
        Thread.sleep(3500);
    }
    @Test
    public void checkMaintenancePanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnMaintenancePanel();
        Thread.sleep(2000);
        sidePanelPage.clickCancelMaintenance();
        Thread.sleep(2000);
    }
    @Test
    public void checkClaimPanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnClaimPanel();
        Thread.sleep(3500);
    }
    @Test
    public void checkBuzzPanel() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnBuzzPanel();
        Thread.sleep(3500);
    }

    @Test
    public void checkSearchField() throws InterruptedException {
        SidePanelPage sidePanelPage = loginPage.clickLogInSidePanelPage();
        Thread.sleep(2000);
        sidePanelPage.clickOnSearchField("Admin");
        Thread.sleep(3500);
    }




}
