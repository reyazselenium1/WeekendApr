@smoke
Feature: To validate Newtours login functionality

  Scenario Outline: Validate Login
    Given I open <Browser>
    And I go to loginURL
    And I Login inside application
    |qshore| qshore123|
    #Then Login should be <Result>
    
  Examples: 
      |Browser |   Result     |
      |Chrome  |   success    |
