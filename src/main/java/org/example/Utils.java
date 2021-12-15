package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager{

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }

    public static void selectFromDropDownVisibleText(By by, String textvalue) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(textvalue);

    }

    public static void selectFromDropDownIndexValue(By by, int indexvalue) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(indexvalue);

    }

    public static void waitForClickable(By by, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForVisible(By by, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void captureScreenshot(String fileName)
    {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);
        File destFile=new File("src/test/java/Screenshots/"+fileName+""+currentTimeStamp()+" .png");
        try {
            FileUtils.copyFile(SrcFile, destFile);
        } catch (IOException e){
            e.printStackTrace();
        }

    }


}
