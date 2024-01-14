import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.By.className;


public class LoginPage {
    private SelenideElement loginHeader = $x("//div[text()='Login']");
    public SelenideElement getLoginHeader() {
        return loginHeader;
    }
    private SelenideElement userNameInputField = $(By.id("userName"));

    private SelenideElement usernameField = $("[placeholder=\"UserName\"]");
    private SelenideElement passwordField = $("[placeholder=\"Password\"]");
    private SelenideElement loginButtonInLoginPage = $(By.id("login"));
    private SelenideElement newuserButton = $(By.id("newUser"));
    private SelenideElement errorLoginMessage = $(className("mb-1"));
    private SelenideElement invalidUserNameForm = $x("//*[@class='mr-sm-2 is-invalid form-control' and @id='userName']");
    private SelenideElement invalidPasswordForm = $x("//*[@class='mr-sm-2 is-invalid form-control' and @id='password']");
    private SelenideElement profileLink = $(byText("Profile"));
    public void followProfileLink(){
        profileLink.scrollTo().shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
    }

    public SelenideElement getInvalidUsernameAndPasswordMessage() {
        return invalidUserNameForm;
    }



    public SelenideElement getErrorLoginMessage() {
        return errorLoginMessage;
    }

    public SelenideElement getInvalidUserNameForm(){
        return invalidUserNameForm;
    }
    public SelenideElement getInvalidPasswordForm(){
        return invalidPasswordForm;
    }

    public SelenideElement getLoginButtonInLoginPage (){return loginButtonInLoginPage;}


    public void enterUsername(String usernameValue){
        usernameField.shouldBe(visible, Duration.ofSeconds(10));
        usernameField.setValue(usernameValue);
    }

    public  void enterPassword(String passwordValue){
        passwordField.shouldBe(visible).setValue(passwordValue);
    }

    public void clickOnLoginButton(){
        loginButtonInLoginPage.scrollIntoView(true).click();
    }
    private SelenideElement passwordInputField = $(By.id("password"));
    private SelenideElement loginButton = $(By.cssSelector("[class='btn btn-primary']"));

    public void loginProcess(String userName, String password){
        userNameInputField.shouldBe(visible).setValue(userName);
        passwordInputField.shouldBe(visible).setValue(password);
        loginButton.scrollTo().shouldBe(visible).click();
    }



}
