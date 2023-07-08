@regression
Feature: Verify different users could purchase the product

  Background:
    Given user is already on the log in page and logged with valid username and password
    And  the user clicks on the Add to car button of the Sauce Labs Onesie
    And clicks on the cart button
    And the user clicks on the Checkout button
  @smoke
  Scenario Outline: Checking the payment functionality with different valid credentials
    And the user puts "<First Name>", "<Last Name>" and "<Zip Code>"
    And the user clicks Continue button
    And the user clicks on the Finish button
    Then the user should see 'Thank you for your order!' note
    Examples:
      | First Name | Last Name | Zip Code |
      | Muhtar     | Kutlay    | 04609    |
      | Peter      | Michael   | 58099    |
      | Carlito    | Perez     | 34112    |
      | Diego      | Sanchez   | 99882    |
      | Michael    | Corse     | 12114    |
      | Louis      | Vitton    | 44291    |


  Scenario Outline: Checking the payment functionality with missing credentials
    And the user puts "<First Name>", "<Last Name>" and "<Zip Code>"
    And the user clicks Continue button
    Then the screen should show "<Error Message>"
    Examples:
      | First Name | Last Name | Zip Code | Error Message                                          |
      |            |           |          | Error: First Name, Last Name and Zip code are required |
      |            | Tikyy     | 34112    | Error: First Name is required                          |
      | Pero       |           | 84772    | Error: Last Name is required                           |
      | Mitar      | Miric     |          | Error: Postal Code is required                         |









