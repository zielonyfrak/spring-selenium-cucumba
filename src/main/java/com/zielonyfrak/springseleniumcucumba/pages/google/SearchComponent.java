package com.zielonyfrak.springseleniumcucumba.pages.google;

import com.zielonyfrak.springseleniumcucumba.pages.PageObjectBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchComponent extends PageObjectBase {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchButtons;

    public void search(String keyword){
        searchBox.sendKeys(keyword);
        searchBox.sendKeys(Keys.TAB);
        searchButtons.stream()
                .filter(sb-> sb.isDisplayed() && sb.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

    @Override
    public boolean isAt() {
        return wait.until(d -> searchBox.isDisplayed());
    }
}
