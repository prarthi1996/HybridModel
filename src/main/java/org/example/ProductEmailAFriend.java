package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriend extends Utils {
    LoadProp loadProp = new LoadProp();
    By _friendEmail = By.id("FriendEmail");
    By _personalMessage = By.id("PersonalMessage");
    By _sendEmail = By.xpath("//button[@class=\"button-1 send-email-a-friend-button\"]");

    public void verifyRegisteredUserCanReferAProductToFriend(){
        //Input Friends Email
        typeText(_friendEmail,loadProp.getProperty("email2") + currentTimeStamp() + loadProp.getProperty("email3"));
        //Input your email address
        // typeText(By.id("YourEmailAddress"),"prarthizalava@gmail.com");
        //Input Personal Message
        typeText(_personalMessage,loadProp.getProperty("personalMessage"));
        //click send email Button
        clickOnElement(_sendEmail);

    }
}
