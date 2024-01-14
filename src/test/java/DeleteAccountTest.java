import com.github.javafaker.Faker;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class DeleteAccountTest extends BaseTest{

    Faker faker = new Faker();
    String username = faker.name().username();
    String password = "Rosa35B!";

    @Test
    public void deleteAccountTest(){
        sideBar.followLoginLink();
        loginPage.loginProcess(username, password);
        profilePage.getHeaderBooksTable().shouldBe(visible);
        profilePage.getRegisteredUserName().shouldBe(visible).shouldHave(text(username));
        profilePage.isBookCollectionDisplayed();
        profilePage.deleteAccount();
        profilePage.confirmModalWindow();
        loginPage.getLoginHeader().shouldBe(visible);
        loginPage.loginProcess(username, password);
        loginPage.getInvalidUsernameAndPasswordMessage().shouldBe(visible).shouldHave(text("Invalid username or password!"));
    }
}
