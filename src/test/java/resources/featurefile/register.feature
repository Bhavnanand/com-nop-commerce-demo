Feature: Register

  @Background: I am on HomePage
    And I click on Register link
    @Smoke
    Scenario: I want to verify ThatvFirstName,LastName,Email,Password And Confirm PasswordF ieldsAreMandatory() {
  When I Click on Register Link
    Then I Verify the error message "First name is required."
      And I Verify the error message "Last name is required."
  And  I Verify the error message "Email is required."
  And  I`Verify the error message "Password is required."
    And  I Verify the error message "Password is required."

  @Regression
      Scenario: I  want to Verify That User Should Create AccountS uccessfully() {
    When  IClick on Register Link
    And  I Select gender "Female"
    And  I enter firstname
    And  I enter lastname
    And I  Select day for birthdate
    And  I select month
    And  I select year
    And  I enter email
    And  I enter password
    And I Enter Confirm Password
    And  I click on "REGISTER" button
    And  I Verify message "Your registration completed"
