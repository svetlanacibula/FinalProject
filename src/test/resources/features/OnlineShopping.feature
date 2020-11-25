Feature: OnlineShopping adventure

  Background:
    Given Open 1a homepage

  @FullTest
  Scenario: Open online shop and make purchase
    When Search for product
    And Choose it from left menu
    And Choose highly rated filter and first available brand
    And Go to product page
    Then Add product to cart
    And Proceed to cart
    And Validate product name and set price
    And Go to checkout
    And Enter email to submit without registration
    And Choose delivery option and enter name, last name, phone
    And Validate product price
    And Go to next step
    And Choose payment method