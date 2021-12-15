package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils{
    LoadProp loadProp = new LoadProp();

    By _radioButton = By.id("gender-female");
    By _firstName = By.id("FirstName");
    By _lastName = By.id("LastName");
    By _selectDateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By _selectBirthOfMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By _selectBirthOfYear = By.xpath("//select[@name='DateOfBirthYear']");
    By _email = By.id("Email");
    By _newsLetter = By.id("Newsletter");
    By _password = By.xpath("//input[@id='Password']");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton = By.id("register-button");

    public void verifyUserIsOnRegistrationPage(){
        //Verify user is on register page
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }


    public void userEnteringRegistrationDetails() {
        //Click Radio Button
        clickOnElement(_radioButton);
        //type first name
        typeText(_firstName, loadProp.getProperty("firstname"));
        //type LastName
        typeText(_lastName, loadProp.getProperty("lastname"));
        //Select Day from DropDown
        selectFromDropDownIndexValue(_selectDateOfBirth, Integer.parseInt(loadProp.getProperty("DobDate")));
        //Select Month from DropDown
        selectFromDropDownVisibleText(_selectBirthOfMonth, loadProp.getProperty("DobMonth"));
        //Select Year from DropDown
        selectFromDropDownVisibleText(_selectBirthOfYear, loadProp.getProperty("DobYear"));
        //type email
        typeText(_email, loadProp.getProperty("email") + currentTimeStamp() + loadProp.getProperty("email1"));        //newsletter
        clickOnElement(_newsLetter);
        //Password
        typeText(_password, loadProp.getProperty("password"));
        //ConfirmPassword
        typeText(_confirmPassword, loadProp.getProperty("confirmpassword"));
    }

    public void userClickOnRegisterButton() {
            //Click Register Button
            clickOnElement(_registerButton);
        }

}
