import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {

    private SelenideElement firstnameField = $("[placeholder=\"First Name\"]");
    private SelenideElement lastnameField = $("[placeholder=\"Last Name\"]");
    private SelenideElement usernameField = $("[placeholder=\"UserName\"]");
    private SelenideElement passwordField = $("[placeholder=\"Password\"]");
    private SelenideElement registerButton = $(By.id("register"));
    // Please verify reCaptcha to register!
    private SelenideElement backToLoginButton = $(By.id("gotologin"));


}
