Feature: To Validate Adactin website

  Scenario: To Validate Adactin Login Page
    Given User launch the browser and navigate to adactin login page
    When User enters the username and password in adacting page
    And User clicks the login button in adacting page
    Then User navigated to the adacting home page
    When Close the Browser