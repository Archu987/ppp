Feature: Title of your feature
  I want to use this template for my feature file
  Scenario Outline: login
    Given Enter the URL for TestMeApp"<url>"
    When TestMe page is displayed
    And Enter the data"<username>" ,"<password>"
    Then click login button

    Examples: 
      | username | password    |
      | Lalitha  | Password123 |
