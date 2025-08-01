@Support
Feature: Validate Support link on Dashboard

  Background:
    Given I am on the OrangeHRM login page

  Scenario: Validate support link text
    Given I have entered a valid username and password
    When I click on the login button
    And I close any popup if present
    And I click the profile dropdown
    And I click on Support link
    Then I should see text "Getting Started with OrangeHRM"
