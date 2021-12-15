package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SubCategoryDesktop extends Utils{
    LoadProp loadProp = new LoadProp();

    By _DesktopTitle = By.xpath("//div[@class=\"center-2\"]/div/div[1]/h1");
    By _addToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 product-box-add-to-cart-button\"]");

    public void verifyUserIsOnDesktopPage()
    {
        String actualRegisterCompletionMessage = getTextFromElement(_DesktopTitle);

        Assert.assertTrue(actualRegisterCompletionMessage.equals(loadProp.getProperty("expectedRegisterCompletedMessageCategory")),"User is on Correct Page");
    }

    public void userShouldBeAbleToClickOnAddToCartButton()
    {
        //click on add to chart button
        clickOnElement(_addToCartButton);

    }

}