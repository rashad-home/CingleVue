Feature: Search Results on Site

  Scenario: Validate Results Quantity
    Given I navigate to CingleVue site
    When I click on search bar
    And I enter the text "CingleVue"
    And I click search button
    Then I get the results of more than ten

   