package org.example;

import org.openqa.selenium.By;

public class LeaveYourComment extends Utils {
    LoadProp loadProp = new LoadProp();
    By _commentTitle = By.id("AddNewComment_CommentTitle");
    By _commentText = By.id("AddNewComment_CommentText");
    By _addCommentButton = By.xpath("//button[@class='button-1 news-item-add-comment-button']");

    public void userAbleToEnterDetailsInCommentSection(){
        //adding title to comment section
        typeText(_commentTitle,loadProp.getProperty("commentTitle"));
        //adding comment in comment box
        typeText(_commentText,loadProp.getProperty("commentText"));
        //click on add comment button
        clickOnElement(_addCommentButton);


    }
}
