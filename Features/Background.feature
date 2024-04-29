
Feature: Test Backgrund feature
Description: The purpose of this feature is to test the Background keyword
  
Background: User is Logged in
    Given I navigate to the login login page
    When I submit username and password
    Then I should be logged in
  Scenario: search a product and add the first product to the User basket
    Given User search for lenovo Laptop
    When Add the first laptop that appers in the search result to the basket
    Then User basket should display with added item

   Scenario: navigate to a product and add the same to the user basket
   Given: user navigate for lenovo lap
   When Add the laptop to the basket
   Then User basket should display with added item
