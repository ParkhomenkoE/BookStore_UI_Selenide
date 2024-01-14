import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class SideBarTest extends BaseTest{
    @Test
    public void sideBarTest(){

        sideBar.followLoginLink();
        loginPage.getLoginHeader().shouldBe(visible).shouldHave(text("Login"));
        sideBar.followBookStoreLink();
        bookStorePage.getBookStoreHeader().shouldBe(visible).shouldHave(text("Book Store"));
        sideBar.followProfileLink();
        profilePage.getProfileHeader().shouldBe(visible).shouldHave(text("Profile"));
    }
}
