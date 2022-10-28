package com.zielonyfrak.springseleniumcucumba.pages.google;

import com.zielonyfrak.springseleniumcucumba.pages.PageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResultComponent extends PageObjectBase {

    @FindBy(css = "div.MjjYud")
    private List<WebElement> results;

    public int getResultsCount(){
        return results.size();
    }

    @Override
    public boolean isAt() {
        return wait.until(d->!results.isEmpty());
    }
}
