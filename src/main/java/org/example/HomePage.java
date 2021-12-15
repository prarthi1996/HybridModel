package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    By _registerButton = By.linkText("Register");
    By _categoryComputers = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a");
    By _newsLinkText = By.xpath("//a[@href=\"/news\"]");


    public void clickOnRegisterButton(){
        //Click on register button
        clickOnElement(_registerButton);
    }

    public void clickOnComputersCategory() {

        //click on computers
        clickOnElement(_categoryComputers);
    }

    public void clickOnNewsButton(){
        //Click on News link Text
        clickOnElement(_newsLinkText);

    }
}
