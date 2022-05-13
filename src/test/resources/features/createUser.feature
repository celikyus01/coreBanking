@herhangibisey
Feature: Create User

  Scenario: Create User with valid data
    Given I am on the login screen
    Then Verify title as "ToolsQA"
    When I navigate to create user page
    Then I verify the page header as "Practice Form"

  Scenario: Delete User
    Given I am on the login screen
    Then Verify title as "ToolsQA"


# BDD: Behavioral Drivin Testing
#  For Java we can achieve BDD with Cucumber tool (c# icin specflow)
#  Don't forget to instal Gerkhin plugin in inteliJ market place
#  We can define Gerkhin language (given-when-then) in .feature files
#  there are 2 benefits gerkhin provide us:
#    1. plain english, even non-technical people can understand it
#    2. any step created can be reased