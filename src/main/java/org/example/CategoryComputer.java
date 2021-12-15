package org.example;

import org.openqa.selenium.By;

public class CategoryComputer extends Utils{

   // By _categoryDesktop = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/h2/a");
   By _categoryDesktop =By.linkText("Desktops");


    public void userShouldBeAbleToClickOnDesktopCategory(){

        //click on desktop
        waitForClickable(_categoryDesktop, 30);
        clickOnElement(_categoryDesktop);


    }

}
