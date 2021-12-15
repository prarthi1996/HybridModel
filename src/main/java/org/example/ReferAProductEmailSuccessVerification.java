package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferAProductEmailSuccessVerification extends  Utils{
    LoadProp loadProp = new LoadProp();

    By _messageSentSuccessReferAProduct = By.xpath("//div[@class=\"page email-a-friend-page\"]/div[2]/div[2]");

    public void userHasSuccessfullySentMessageToFriend(){
        // Verifying the message sent success
        String actualRegisterCompletionMessage = getTextFromElement(_messageSentSuccessReferAProduct);
        Assert.assertTrue(actualRegisterCompletionMessage.equals(loadProp.getProperty("expectedEmailAFriend")));

    }
}
