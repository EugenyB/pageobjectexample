package main.steps;

import main.pages.LoginFailedPage;

public class LoginFailedSteps {

    LoginFailedPage page = new LoginFailedPage();

    public void verifyThatFailedPageVisible() {
        page.assertThatErrorDivIsPresent();
        page.assertThatUserDivIsAbsent();
    }

    public void verifyThatBackLinkVisible() {
        page.assertBackLinkExists();
    }
}
