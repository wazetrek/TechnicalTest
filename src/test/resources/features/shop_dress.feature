
Feature: Shopping of a dress in web shop

  Scenario: buy a dress without login

    Given Megan enters the web

    When she select dresses
    Then add shopping cart the most expensive
    And she should see the purchase receipt