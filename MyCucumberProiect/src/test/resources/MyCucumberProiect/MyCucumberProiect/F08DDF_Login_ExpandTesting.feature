Feature: Data driven testing on Expand Testing site

  Scenario Outline: Validate login on ExpandTesting page
    Given Launch ExpandTesting page
    When Enter the "<UserName>" and "<Password>"
    When Click on Submit button for login
    Then Login page shoud open

    Examples: 
      | UserName | Password             |
      | Shruti   | shruti@123           |
      | Kiran    | kiran@123            |
      | practice | SuperSecretPassword! |
      | Swarna   | swarna@123           |
