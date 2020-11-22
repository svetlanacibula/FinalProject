@FullTest
Feature: OnlineShopping adventure

  Background:
    Given Open 1a homepage

  Scenario: Open browser and make purchase
    When Search for product and choose it from left menu and from submenu
    And Choose highly rated filter and first available brand
    And Go to product page
    And Add product to cart
    Then Go to cart and enter email to submit without registration
    And Choose delivery option and enter name, last name, phone
    And Choose payment method