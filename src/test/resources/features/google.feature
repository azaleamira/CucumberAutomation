@search @whatever @google @regression
Feature: Google search

     #UserStory: SUP-93

 @work
  Scenario: Verifying the results for google search
    Given I am on the google page
    When I search for "cucumber"
    Then I should see only "cucumber" related results



  Scenario: Verifying image result
    Given I am on the google page
    When I search for "James Bond"
    And I click on image option
    Then I should see only "James Bond" related images
