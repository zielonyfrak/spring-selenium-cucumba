package com.zielonyfrak.springseleniumcucumba.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Lazy
@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}/screen.png")
    private Path path;

    public void takeScreenShot() throws IOException {
        File sourceFile = driver.getScreenshotAs(OutputType.FILE); //TODO create output folder
        FileCopyUtils.copy(sourceFile, path.toFile());
    }
}