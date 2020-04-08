package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
HomePage homePage = new HomePage();

    @Test
    public void verifyThatPracticeLinkIsDisplayed (){
        homePage.practiceLinkisDisplayed();
            }
    @Test
    public void verifyThatLoginLinkIsDisplayed(){
        homePage.loginLinkIsDisplayed();
    }
    @Test
    public void verifyThatSignUpLinkIsDisplayed(){
        homePage.signUpLinkIsDisplayed();
    }
}
