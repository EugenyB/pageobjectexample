package main.tests;

import main.steps.LoginFailedSteps;
import org.testng.annotations.Test;

public class LoginFailTest extends BaseTest {

    @Test(dataProvider = "loginDataFailed")
    public void testLoginFailed(String login, String password) {
        visit("");
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.verifyThatFailedPageVisible();
    }

    @Test(dependsOnMethods = {"testLoginFailed"}, dataProvider = "loginDataFailed")
    public void testLoginFailedAndBackLinkPresent(String login, String password) {
        visit("");
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.verifyThatBackLinkVisible();
    }
}
