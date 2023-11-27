package login;

import base.Base;
import org.testng.annotations.Test;

public class LoginTests extends Base {

    @Test
    public void successfulLogin() throws InterruptedException {
    goHome();
    Thread.sleep(3500);
    loginPage.setName("Admin");
    Thread.sleep(3500);
    loginPage.setPassword("admin123");
    Thread.sleep(3500);
    loginPage.clickLoginButton();
    Thread.sleep(3500);
    }

    @Test
    public void successfulLoginAll() throws InterruptedException {
        Thread.sleep(3500);
        loginPage.logIn();
    }


}
