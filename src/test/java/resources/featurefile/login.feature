Feature: Login Test
  As user I want to login into nop commerce website
  Background: As User i entered com.nop,commerce in browser
    And I am on homepage
And  I click on login Link

  @smoke
  Scenario: User should navigate to login page successfully
    When I click on login link
    Then I should navigate to login page successfully

  @smoke
  Scenario: User should login successfully with valid credentials
    When I enter email "HDoshi123@gmail.com"
    And I enter password "hdoshi123"
    And I click on login button
    Then I should login successfully

  Scenario Outline: Verify the error message with invalid credentials
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
