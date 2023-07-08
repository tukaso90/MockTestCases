@regression
Feature: Verify numbers of items in the cart change by adding them

  Background:
    Given user is already on the log in page and logged with valid username and password

  Scenario: Checking if the cart updates properly
    When the user click on the Add to cart button of the Sauce Labs Backpack
    Then the cart will display number one
@smoke
  Scenario: Checking if the cart updates properly
    When the user clicks on the Add to cart button of the Sauce Labs Backpack
    And  the user clicks on the Add to car button of the Sauce Labs Onesie
    Then the cart will display number two
@smoke
  Scenario: Checking if the cart updates properly
    When the user click on the Add to cart button of the Sauce Labs Backpack
    And clicks on the cart button
    Then the 'Sauce Labs Backpack' should appear in the cart

  Scenario: Checking if the cart updates properly
    When the user clicks on the Add to cart button of the Sauce Labs Backpack
    And  the user clicks on the Add to car button of the Sauce Labs Onesie
    And clicks on the cart button
    And the user clicks on the Remove button in the cart
    And clicks on the Continue Shopping button
    Then the cart will display number one

  Scenario: Checking if the cart updates properly
    When the user clicks on the Add to cart button of the Sauce Labs Backpack
    And the user logouts
    And the user logs in again
    Then the cart will display number one

  Scenario: Checking if the cart updates properly
    When the user clicks on the Add to cart button of the Sauce Labs Backpack
    And clicks on the cart button
    And the user clicks on the Checkout button
    And the user clicks on the Cancel button
    Then the 'Sauce Labs Backpack' should appear in the cart






