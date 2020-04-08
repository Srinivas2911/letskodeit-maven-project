package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginPageWelcomeText = By.className("text-center");
    By emailField = By.id("user_email");
    By passwordField = By.id("user_password");
    By loginButton = By.name("commit");

    public void LoginPageTextIsDisplayed(){
        verifyThatTextIsDisplayed(loginPageWelcomeText, "    Log In to Let's Kode It");
    }

    public void enterEmailField (){
        sendTextToElement(emailField, "Roger123@gmail.com");
    }

    public void enterPasswordField (){
        sendTextToElement(passwordField, "Password123");
    }

public void clickOnLoginButton (){
        clickOnElement(loginButton);
}

}
