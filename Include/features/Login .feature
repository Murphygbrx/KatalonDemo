#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@CustomerportalloginFeature
Feature: Login
  Test the customer portal login functionality

  @smoke
  Scenario: Test the login functionality of customer portal for Enspire application
    Given I want to navigate to the customer portal login page
    And I enter the username as "GMS/customer.portal" and password as "123456789"
    And I click the login button
    Then I should see the home page
    