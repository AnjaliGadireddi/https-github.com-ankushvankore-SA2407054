Feature: Registration process

  Scenario: To validate registration process on Rediff
    Given Launch rediff
    When I pass the data as follows
      | Nilima | nilima@rediff.com | nilima123 | 1234567890 |
      | Durga  | durga@rediff.com  | durga123  | 2345678901 |
      | Shruti | shruti@rediff.com | shruti123 | 3456789012 |
    Then registration process shold success
