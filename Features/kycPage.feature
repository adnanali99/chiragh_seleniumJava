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
      | userName              | password | required | message                                 |
      | alia.dnan38@gmail.com | A1122a@@ | Login    | Property Auction In Dubai - Chiragh.com |

  @LoginValidation
  Scenario Outline: KYC Form validation messages check. User tries to submit KYC form without submitting required fields (without Company Name)
    Given User is on the login page
    When User is providing an email "<userName>" and password "<password>"
    And clicks on the "<required>" button
   # Then User is getting an appropriate "<message>"
    And User clicks on profile icon and then username
    And User lands on Profile Dashboard page
    And clicks on profile link
    And clicks on KYC application link
    Then User lands on the KYC application form
    And User enters Company Name to make company related fields enable
    And click on Submit button
    Then User can see "<TradeLnoMsg>","<dateOfIncorpMsg>", "<placeOfIncorpMsg>", "<companyAddMsg>","<BeneOwnerMsg>","<nationalityMsg>", "<ScannedPassportMsg>", "<ScannedIDMsg>", "<TradeLDocument>", "<FactaDecMsg>", "<UserCompMsg>", "<UserCompMsg2>" and "<UserCompMsg3>",
    And Close the browser

    Examples:
      | userName              | password | required | TradeLnoMsg                       | dateOfIncorpMsg                    | placeOfIncorpMsg                          | companyAddMsg                                | BeneOwnerMsg                         | nationalityMsg                 | ScannedPassportMsg                 | ScannedIDMsg                 | TradeLDocument                          | FactaDecMsg              | UserCompMsg              | UserCompMsg2             | UserCompMsg3             |
      | alia.dnan38@gmail.com | A1122a@@ | Login    | Trade license number is required. | Date of incorporation is required. | Place of incorporation field is required. | Company address  (Line 1) field is required. | Beneficiary owner field is required. | Nationality field is required. | Scanned Passport Copy is required. | Scanned ID Copy is required. | Company Trade License copy is required. | Please select an option. | Please select an option. | Please select an option. | Please select an option. |

  @LoginValidation1
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
      | userName              | password | required | message                                 |
      | alia.dnan38@gmail.com | A1122a@@ | Login    | Property Auction In Dubai - Chiragh.com |