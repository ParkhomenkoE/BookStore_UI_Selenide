import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    final String BASE_URL = "https://demoqa.com/books";

    @Before
    public void setUp() {
        //Configuration.timeout = 10000;
        open(BASE_URL);
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }


    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();
    BookStorePage bookStorePage = new BookStorePage();
    RegisterPage registerPage = new RegisterPage();
    BookDetailPage bookDetailedInformation = new BookDetailPage();
    SideBarPage sideBar = new SideBarPage();


}
