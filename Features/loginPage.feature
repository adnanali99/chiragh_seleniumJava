Feature: Login Page regression testcases

  @LoginValidation1
  Scenario Outline: Test login functionality with no data
    Given User is on the login page
    When clicks on the "<required>" button
    Examples:
      | required                         |
      | Not a Chiragh user yet? Register |

  @LoginValidation2
  Scenario Outline: Verify that user is getting logged in with valid credentials. Getting error message with invalid
  credentials (valid email, invalid password) and (invalid email, valid password) and both (invalid email and password)
    Given User is on the login page
    When User is providing an email "<userName>" and password "<password>"
    And clicks on the "<required>" button
    Then User is getting an appropriate "<message>"

    Examples:
      | userName               | password  | required | message                                         |
      | aliadnan3.8@gmail.com  | A1122a@@  | Login    | Property Auction In Dubai - Chiragh.com         |
      | aliadnan3.8@gmail.com  | A.1122a@@ | Login    | Invalid email or password                       |
      | aliadnan33.8@gmail.com | A1122a@@  | Login    | Invalid email or password                       |
      | aliadnan33.8@gmail.com | A1122a@@@ | Login    | Invalid email or password                       |
      |                        |           | Login    | Invalid email or password                       |
      | aliadnan3.8@gmail.com  |           | Login    | Invalid email or password                       |
      |                        | A1122a@@@ | Login    | Invalid email or password                       |
      | A1122a@@@              |           | Login    | Enter valid email address e.g example@email.com |
      | 12931923               |           | Login    | Enter valid email address e.g example@email.com |

  @LoginValidation1
  Scenario Outline: Verify that all the elements and label texts of Login Page are available
    Given User is on the login page
    Then  User can see all the login page elements e.g "<loignTitle>" , "<Email>" and "<Password>" fields and their labels. The lables of "<Login button>" , "<Disclaimer>" , "<Register>" and "<Forgot Password>"
    Examples:
      | loignTitle | Email | Password | Login button | Disclaimer                                                                           | Register                         | Forgot Password  |
      | Log In     | Email | Password | Log In       | By clicking \"Log in\" you agree to Chiragh.com's Terms of Use and Privacy Statement | Not a Chiragh user yet? Register | Forgot Password? |

  @LoginValidation
  Scenario Outline: Test login functionality with no
    Given User is on the login page
    When clicks on the "<required>" button
    And User clicks on profile icon and then username
    And clicks on profile link
    And clicks on KYC application link
    Then selects the date

    Examples:
      | required |
      | Login    |