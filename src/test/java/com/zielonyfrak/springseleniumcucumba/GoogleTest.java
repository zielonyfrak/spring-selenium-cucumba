package com.zielonyfrak.springseleniumcucumba;

import com.zielonyfrak.springseleniumcucumba.pages.google.GooglePage;
import com.zielonyfrak.springseleniumcucumba.util.ScreenShotUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import java.io.IOException;

@SpringBootTest
public class GoogleTest {

    @Autowired
    private GooglePage googlePage;

    @Lazy
    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {
        googlePage.navigateTo();

        if (googlePage.getCookiesInfoComponent().isAt()){
            googlePage.getCookiesInfoComponent().rejectAllCookies();
        }

        Assertions.assertTrue(googlePage.isAt());
        googlePage.getSearchComponent().search("Spring Boot");
        Assertions.assertTrue(googlePage.getResultComponent().isAt());
        Assertions.assertTrue(googlePage.getResultComponent().getResultsCount() > 3);
        screenShotUtil.takeScreenShot();
    }
}
