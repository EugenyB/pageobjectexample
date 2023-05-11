package main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
//    By loginFieldBy = By.xpath("//*[@id='login']");
    @FindBy(xpath = "//*[@id='login']")
    WebElement loginField;
//    By passwordFieldBy = By.xpath("//*[@id='passw']");
    @FindBy(xpath = "//*[@id='passw']")
    WebElement passwordField;
//    By buttonBy = By.xpath("//*[@id='okbutton']");
    @FindBy(xpath = "//*[@id='okbutton']")
    WebElement button;

    public void fillLoginField(String text) {
        //WebElement loginField = driver.findElement(loginFieldBy);
        loginField.clear();
        loginField.sendKeys(text);
    }

    public void fillPasswordField(String text) {
        //WebElement passwordField = driver.findElement(passwordFieldBy);
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void clickButton() {
        //WebElement button = driver.findElement(buttonBy);
        button.click();
    }
}
