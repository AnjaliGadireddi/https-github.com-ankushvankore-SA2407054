Feature: Registration process

  Background: 
    Given Launch rediff

  Scenario: To validate registration process on Rediff
    When I pass the data as follows
      | Nilima | nilima@rediff.com | nilima123 | 1234567890 |
      | Durga  | durga@rediff.com  | durga123  | 2345678901 |
      | Shruti | shruti@rediff.com | shruti123 | 3456789012 |
    Then registration process shold success

  Scenario: To validate registration process on Rediff via title
    When I Pass the following data
      | FullName | EmailId            | Password    | MobileNo   |
      | Nilesh   | nilesh@rediff.com  | nilesh@123  | 7878787878 |
      | Puneeth  | puneeth@rediff.com | puneeth@123 | 9898989898 |
      | Anil     | anil@rediff.com    | anil@123    | 8989898989 |
    Then Registration success
