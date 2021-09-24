Feature: Add a new computer into computer database
@TC1
  Scenario: As a User I should be able to create a new computer record in the database

    Given User is on landing page
    When User clicks on "Add a new computer" button
    And User types new computer name inside the search bar
    And User inserts introduction date as "2020-09-21"
    And User inserts discontinued date as "2022-10-10"
    And User selects company name "Nokia"
    And User clicks on "Create this computer" button
    Then User is able to find new computer name in a search bar


