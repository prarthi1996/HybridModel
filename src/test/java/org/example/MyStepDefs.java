package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs  {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    CategoryComputer categoryComputer = new CategoryComputer();
    BuildComputerSubCategory buildComputerSubCategory = new BuildComputerSubCategory();
    SubCategoryDesktop subCategoryDesktop = new SubCategoryDesktop();
    News news = new News();
    LeaveYourComment leaveYourComment = new LeaveYourComment();
    NewsMessageSentSuccess newsMessageSentSuccess = new NewsMessageSentSuccess();
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    ReferAProductEmailSuccessVerification referAProductEmailSuccessVerification = new ReferAProductEmailSuccessVerification();


    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.verifyUserIsOnRegistrationPage();
        registrationPage.userEnteringRegistrationDetails();

    }

    @When("click on register submit button")
    public void click_on_register_submit_button() {
        registrationPage.userClickOnRegisterButton();

    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registerSuccessPage.userHasRegisteredSuccessfully();

    }

    @Given("user is on home page")
    public void user_is_on_home_page() {
        homePage.clickOnComputersCategory();

    }
    @When("user clicks on computer category")
    public void user_clicks_on_computer_category() {
        categoryComputer.userShouldBeAbleToClickOnDesktopCategory();

    }

    @Then("user should able to navigate to desktop category page.")
    public void user_should_able_to_navigate_to_desktop_category_page() {
        subCategoryDesktop.verifyUserIsOnDesktopPage();

    }
    @Given("user click on newsButton on homepage")
    public void user_click_on_news_button_on_homepage() {
        homePage.clickOnNewsButton();
    }
    @When("user clicks on detailsButton on News page")
    public void user_clicks_on_details_button_on_news_page() {
        news.clickOnDetailsPage();

    }
    @When("user enter the comment in the commentSection")
    public void user_enter_the_comment_in_the_comment_section() {
      leaveYourComment.userAbleToEnterDetailsInCommentSection();
    }
    @Then("user should be able to add a comment")
    public void user_should_be_able_to_add_a_comment() {
        newsMessageSentSuccess.verifyUserHasAddedAComment();

    }
    @Given("user is a registered user")
    public void user_is_a_registered_user() {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegistrationPage();
        registrationPage.userEnteringRegistrationDetails();
        registrationPage.userClickOnRegisterButton();

    }
    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        categoryComputer.userShouldBeAbleToClickOnDesktopCategory();
        subCategoryDesktop.userShouldBeAbleToClickOnAddToCartButton();


    }
    @When("click on email a friend button")
    public void click_on_email_a_friend_button() {
        buildComputerSubCategory.userShouldBeAbleClickOnEmailAFriendButton();

    }
    @Then("registered user should be able to refer a product via email")
    public void registered_user_should_be_able_to_refer_a_product_via_email() {
     productEmailAFriend.verifyRegisteredUserCanReferAProductToFriend();
     referAProductEmailSuccessVerification.userHasSuccessfullySentMessageToFriend();


    }





}
