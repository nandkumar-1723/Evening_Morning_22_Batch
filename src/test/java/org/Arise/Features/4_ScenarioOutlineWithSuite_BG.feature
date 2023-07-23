@004
Feature: Search the products

  Background: navigates to the naptop home page

    Given navigates to the home page

  Scenario Outline: Search the mobile on naaptol application

    When User search the product on the application and verify the price
      | name          | price          |
      | <ProductName> | <ProductPrice> |

    Examples:
      | ProductName | ProductPrice |
      | Mobile      | 500          |
      | Laptop      | 2500         |













