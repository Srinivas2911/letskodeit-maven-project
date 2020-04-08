package com.learn.letskodeit.testsuite;

import com.learn.letskodeit.pages.HomePage;
import com.learn.letskodeit.pages.LoginPage;
import com.learn.letskodeit.pages.MyCoursesPage;
import com.learn.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyCoursesPage myCoursesPage = new MyCoursesPage();

    @Test
    public void verifyThatLoginPageWelcomeTextisDisplayed() {
        homePage.clickOnLoginLink();
        loginPage.LoginPageTextIsDisplayed();
    }

    @Test
    public void verifyThatUserIsAbleToLogInSuccessfully() {
    homePage.clickOnLoginLink();
    loginPage.enterEmailField();
    loginPage.enterPasswordField();
    loginPage.clickOnLoginButton();
    myCoursesPage.myCourseTextIsDisplayed();
    String expectedText = "My Courses";
    String actualText = myCoursesPage.getMyCourseText();
    Assert.assertEquals(expectedText, actualText);
    }
}
