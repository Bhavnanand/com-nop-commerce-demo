package com.nop.commerce.demo.steps;

import com.nop.commerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    @When("IClick on Register Link")
    public void iclickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }
    @Then("I Verify the error message {string}")
    public void iVerifyTheErrorMessage() {
    }
    @And("I`Verify the error message {string}")
    public void iVerifyTheErrorMessage(String arg0) {
    }
    @And("I Select gender {string}")
    public void iSelectGender(String arg0) {
    }
    @And("I enter firstname")
    public void iEnterFirstname() {
    }
    @And("I enter lastname")
    public void iEnterLastname() {
    }
    @And("I  Select day for birthdate")
    public void iSelectDayForBirthdate() {
    }
    @And("I select month")
    public void iSelectMonth() {
    }
    @And("I select year")
    public void iSelectYear() {
    }
    @And("I enter email")
    public void iEnterEmail() {
    }
    @And("I enter password")
    public void iEnterPassword() {
    }
    @And("I Enter Confirm Password")
    public void iEnterConfirmPassword() {
    }

    @And("I click on {string} button")
    public void iClickOnButton(String arg0) {
    }
    @And("I Verify message {string}")
    public void iVerifyMessage(String arg0) {
    }
}
