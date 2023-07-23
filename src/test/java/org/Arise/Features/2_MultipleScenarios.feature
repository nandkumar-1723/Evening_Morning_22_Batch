@002

Feature: Search the products

  Scenario: Search the mobile on naaptol application

    Given launch the browser and navigates to home page

    When User search the product on the application and verify the price
      | name   | price |
      | Mobile | 200   |

  Scenario: Search the Laptop on naaptol application

    Given launch the browser and navigates to home page

    When User search the product on the application and verify the price
      | name   | price |
      | Laptop | 3000  |











