Feature: Logging into Rediff Money

  @Login12
  Scenario Outline: Logging into Rediff
    Given I open <Browser>
    And I go to loginURL
    And I click link register
    When user enters Contact Information 
    And mailing information is entered 
    And user information is entered 
    Then the registration form is submitted 
    
    
    Examples: 
      |Browser |   Result     |
      #|Mozilla |   success    |
      |BrowserStack|   success    |