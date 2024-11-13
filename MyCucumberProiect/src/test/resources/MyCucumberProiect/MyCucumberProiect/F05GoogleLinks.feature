#This is comment
@GoogleLinks
Feature: Google links

  Background: 
    Given Launch google application

@SmokeTest
  Scenario: To validate Gmail Link
    When Click on Gmail Link
    Then Gmail Page should open

@SanityTest
  Scenario: To validate Images link
    When Click on Images link
    Then Images page should open

@UITest
  Scenario: To validate Advertising Link
    When Click on Advt link
    Then Advertising page should open

@UsabilityTest
  Scenario: To validate Business link
    When Click on Business link
    Then Google business page should open
