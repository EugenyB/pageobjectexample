package main.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class LoginFailedPage extends BasePage {

    @FindBy(xpath = "//*[@id='id_red']")
    WebElement divRed;

    @FindBy(xpath="//*[@id='id_gray']")
    WebElement divGray;

    @FindBy(xpath = "//*[@id='back']")
    WebElement link;

    public void assertThatUserDivIsAbsent() {
        try {
            divGray.isEnabled();
            fail();
        } catch (Exception ignored){}
    }

    public void assertThatErrorDivIsPresent() {
        assertThat(divRed.isDisplayed()).isTrue();
    }

    public void assertBackLinkExists() {
        assertThat(link.getText()).isEqualTo("Back to login page");
    }
}
