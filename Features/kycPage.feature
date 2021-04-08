Feature: KYC Form functional Tests
  @LoginValidation
  Scenario Outline: Submit KYC form with valid data
    Given User is on the login page
    When User is providing an email "<userName>" and password "<password>"
    And clicks on the "<required>" button
   # Then User is getting an appropriate "<message>"
    And User clicks on profile icon and then username
    And User lands on Profile Dashboard page
    And clicks on profile link
    And clicks on KYC application link
    Then User lands on the KYC application form
    And provide KYC form details
    And click on Submit button
    Then User can see "" as a success message
    And Close the browser

    Examples:
      | userName               | password  | required | message                                         |
      | alia.dnan38@gmail.com  | A1122a@@  | Login    | Property Auction In Dubai - Chiragh.com         |
