Feature:Search Functionality
  Agile Story: As a user I should be able to search for anything
  Scenario: Search on Google
    Given I am on the Google home page
    When I search for "hm" and click the search button
    Then I should see the results related to "hm"