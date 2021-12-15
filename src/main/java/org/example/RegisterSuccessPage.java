package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends Utils{
    LoadProp loadProp = new LoadProp();
    By _registerSuccessfulMessage = By.xpath("//div[@class=\"result\"]");

    public void userHasRegisteredSuccessfully(){
        // Verifying the message sent success
        String actualRegisterCompletionMessage = getTextFromElement(_registerSuccessfulMessage);
      //  String expectedRegisterCompletedMessage = "Your registration completed";
        Assert.assertTrue(actualRegisterCompletionMessage.equals(loadProp.getProperty("expectedRegisterCompletedMessage")));
    }
}
