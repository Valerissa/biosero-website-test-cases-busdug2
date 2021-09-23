Feature: Add a new computer into computer database
@TC1
  Scenario: As a User I should be able to create a new computer record in the database

    Given User is on landing page
    When User clicks on "Add a new computer" button in the right top corner
    And User types new computer name inside the search bar
    And User inserts introduction date in required date format bar
    And User inserts discontinued date in required format
    And User is able to select company name from provided dropdown
    And User is able to click on "create this computer" button
    Then User should see alert "Done!Computer has been created



