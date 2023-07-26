package com.nop.commerce.demo.pages;

import com.nop.commerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    /*1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators
  and create appropriate methods for it.*/
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeMessage;
    public void loginLinkClick(){
        clickOnElement(loginLink);
    }

    public void setEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void setPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void loginButtonClick() {
        clickOnElement(loginButton);
    }
    public String welcomeMessageActual() {
        String actual = getTextFromElement(welcomeMessage);
        return actual;
    }
}

