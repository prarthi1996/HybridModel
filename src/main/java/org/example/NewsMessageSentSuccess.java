package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class NewsMessageSentSuccess {
    LoadProp loadProp = new LoadProp();

    By _newsMessageSent = By.xpath("//div[@class='result']");

    public void verifyUserHasAddedAComment(){
        //get text comments successfully added.
        String actualMessage = getTextFromElement(_newsMessageSent);
        String expectedMessage = "News comment is successfully added.";
        Assert.assertTrue(actualMessage.equals(loadProp.getProperty("expectedNewsCommentAdd")));
    }
}
