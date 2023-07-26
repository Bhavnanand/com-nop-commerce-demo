package com.nop.commerce.demo.pages;

import com.nop.commerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(tagName = "span")
    WebElement gender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthdate;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement birthMonth;
    @CacheLookup
    @FindBy(xpath = "select[name='DateOfBirthYear']")
    WebElement birthyear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='FirstName']")
    WebElement firstnameMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='LastName']")
    WebElement lastnameMessage;
    @CacheLookup
    @FindBy(xpath = ".field-validation-error[data-valmsg-for='Email']")
    WebElement emailMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement passwordConfirmMessage;
    @CacheLookup@FindBy(xpath = "//div[@class='result']")
    WebElement registrationMessage;

    public void getTextFromRegisterText() {
        String RegisterText = getTextFromElement(registerText);
    }

    public void clickOnGender() {
        clickOnElement(gender);
    }

    public void setFirstname(String fname) {
        sendTextToElement(firstname, fname);
    }

    public void setLastnames(String lname) {
        sendTextToElement(lastname, lname);
    }

    public void setPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void setConfirmPassword(String conpass) {
        sendTextToElement(confirmPassword, conpass);
    }

    public void setBirthdate(String BDate) {
        selectByValueFromDropDown(birthdate, BDate);
    }

    public void setBirthMonth(String BMonth) {
        selectByValueFromDropDown(birthMonth, BMonth);
    }

    public void setBirthyear(String BYear) {
        selectByValueFromDropDown(birthyear, BYear);
    }

    public void setEmail(String email1) {
        sendTextToElement(email, email1);
    }

    public void registerButtonClick() {
        clickOnElement(registerButton);
    }

    public String getFirstNameMessage() {
        return getTextFromElement(firstnameMessage);

    }

    public String getLastNAmeMessage() {
        return getTextFromElement(lastnameMessage);
    }

    public String getPasswordMessage() {
        return getTextFromElement(passwordMessage);
    }

    public String getConfirmPasswordMessage() {
        return getTextFromElement(passwordConfirmMessage);
    }

    public String getEmailMessage() {
        return getTextFromElement(emailMessage);
    }
    public  String registrationMessageText(){
        return getTextFromElement(registrationMessage);
    }

}
