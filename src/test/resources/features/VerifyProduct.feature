@regression @smoke
Feature: Verify product is same on the Products page and the individual product page

  Background:
    Given user is already on the log in page and logged with valid username and password

  Scenario: matching the product price, description and title in different pages of the backpack
    When user click on the Backpack title
    Then the price should match '$29.99'
    And the product title should match 'Sauce Labs Backpack'
    Then Add to cart button should be visible

  Scenario: matching the product price, description and title in different pages of the fleece jacket
    When user click on the fleece jacket title
    Then the price should be '$49.99'
    And the product title should be 'Sauce Labs Fleece Jacket'
    Then AddToCart button should be visible
