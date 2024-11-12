Feature: Login to OHRM

  Background: 
    Given Open OHRM

  Scenario: Login to OHRM using valid data
    When Enter valid userName as "admin" and password as "admin123"
    And I Click on Login button
    Then Dashboard page should display

  Scenario: Login to OHRM using invalid data
    When Enter invalid username as "puneeth" and password as "puneeth123"
    And Click on Login button
    Then Error message should be display
