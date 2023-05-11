package main.steps;

import lombok.SneakyThrows;
import main.pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    public LoginSuccessSteps doLogin(String login, String password) {
        inputLoginData(login, password);
        return new LoginSuccessSteps();
    }

    @SneakyThrows
    public void inputLoginData(String login, String password) {
        loginPage.fillLoginField(login);
        loginPage.fillPasswordField(password);
        Thread.sleep(1000);
        loginPage.clickButton();
    }

    public LoginFailedSteps doIncorrectLogin(String login, String password) {
        inputLoginData(login, password);
        return new LoginFailedSteps();
    }
}
