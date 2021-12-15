package org.example;

import org.openqa.selenium.By;

public class BuildComputerSubCategory extends Utils{
    By _emailAFriendButton = By.xpath("//div[@class=\"overview-buttons\"]//div[3]");


    public void userShouldBeAbleClickOnEmailAFriendButton(){
        //click on Email Friend Button
        clickOnElement(_emailAFriendButton);

    }
}
