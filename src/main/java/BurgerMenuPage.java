import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BurgerMenuPage {

    private SelenideElement loginInBurgerMenu = $("[class=\"btn btn-light active\"]");
    private SelenideElement bookStoreInBurgerMenu = $x("");
    private SelenideElement profileInBurgerMenu = $x("//*[@id=\"item-3\"]/span");

}
