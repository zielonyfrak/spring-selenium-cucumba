package com.zielonyfrak.springseleniumcucumba.pages.google;

import com.zielonyfrak.springseleniumcucumba.pages.PageObjectBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class GooglePage extends PageObjectBase {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private ResultComponent resultComponent;

    @Autowired
    private CookiesInfoComponent cookiesInfoComponent;

    @Value("${application.url}")
    private String url;

    public void navigateTo(){
        driver.get(url);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public ResultComponent getResultComponent() {
        return resultComponent;
    }

    public CookiesInfoComponent getCookiesInfoComponent() {
        return cookiesInfoComponent;
    }

    @Override
    public boolean isAt() {
        return searchComponent.isAt();
    }
}
