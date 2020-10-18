Feature: Google Search
  As a user I want to test google search function

  Scenario: Basic search
    Given I open google search page
    When I lookup the word "ingenico group"
    Then search results display the word "ingenico group"


