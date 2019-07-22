Feature: Title of your feature
  I want to use this template for my feature file
  
   Scenario Outline: Login
    Given   I want to enter the url
    And click on signin 
    And I enter "<username>" and  "<password>"
    
    And I click on Login
    Then Homepage is displayed
Examples:
    |username   | password   |
    |Lalitha    |Password123 |
    
