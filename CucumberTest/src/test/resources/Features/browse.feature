
Feature: Feature to test search functionality in Google
  
  Scenario: Check search is successful with a given search string
    Given User launches chrome broswer
    And opens google.com
    When user enters a search string
    And click search button
    Then user is navigated to the search result page
