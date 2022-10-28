package com.zielonyfrak.springseleniumcucumba.pages.google;

import com.zielonyfrak.springseleniumcucumba.pages.PageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class CookiesInfoComponent extends PageObjectBase {

    @FindBy(id = "S3BnEe")
    private WebElement infoHeader;

    @FindBy(css = "#W0wltc")
    private WebElement rejectAllButton;

    @Override
    public boolean isAt() {
       return wait.until(d->infoHeader.isDisplayed());
    }

    public void rejectAllCookies(){
        rejectAllButton.click();
    }
}
