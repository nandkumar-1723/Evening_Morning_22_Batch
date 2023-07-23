@003
Feature: Search the products

  Scenario Outline: Search the mobile on naaptol application

    Given launch the browser and navigates to home page

    When User search the product on the application and verify the price
      | name          | price          |
      | <ProductName> | <ProductPrice> |

    Examples:
      | ProductName | ProductPrice |
      | Mobile      | 500          |
      | Laptop      | 2500         |













