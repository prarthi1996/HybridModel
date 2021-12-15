package org.example;

import org.openqa.selenium.By;

public class News extends Utils{

    By _newsDetails = By.xpath("//div[@class='page-body']/div[1]/div[1]/div[3]/a");

    public void clickOnDetailsPage(){
        //Click on details to add comment
        clickOnElement(_newsDetails);


    }
}
