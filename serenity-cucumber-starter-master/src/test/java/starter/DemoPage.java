package starter;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage extends PageObject {

    @FindBy(css = "[id='lst-ib']")
    private WebElement search_input;

    @FindBy(css = "[value='Google Search']")
    private WebElement search_button;

    public void search(String keyword) {
        search_input.sendKeys(keyword);
    }

    public void clickSearch() {
        search_button.click();
    }

    public boolean isSearchDisplayed() {
        return search_input.isDisplayed();
    }
}