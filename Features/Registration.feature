Feature: As a user i should be able to register into the application
#
# @FirstName&LastnameValidations
#
#  Scenario Outline: check validation on First Name and Last Name Text input Fields
#
#    Given I am on the RegistrationPage.
#    When The user enters firstname"<input>"
#    Then user should get FirstName validation "<message>"
#    And  The user enters Lastname"<input>"
#    Then  user should get LastName validation "<message1>"
#    Examples:
#      | message                                        | message1                                      | input     |
#      | First Name is required!                        | Last Name is required!                        |           |
#      | First Name is n ot valid!                       | Last Name is not valid!                       | Aw12@@    |
#      | First Name is not valid!                       | Last Name is not valid!                       | Aw12555@@ |
#      | First Name must be at least 3 characters long. | Last Name must be at least 3 characters long. | at        |
#
#
#  @Email_Validations

#  Scenario Outline: check validation on Email Text input Field
#
#    Given I am on the RegistrationPage.
#    When The user enters Email"<EmailInput>"
#    Then user should get Email validation "<EmailMessage>"
#    Examples:
#      | EmailMessage                                     | EmailInput             |
#      | Email is required.                               |                        |
#      | Enter valid email address e.g\nexample@email.com | atif@231.c             |
#      | Email already Exist!                             | atif.kamal33@gmail.com |
#      | Enter valid email address e.g\nexample@email.com | atif@231zo             |
#      | Enter valid email address e.g\nexample@email.com | atif@231zo.coooo       |
#      | Enter valid email address e.g\nexample@email.com | atif231zo.coooo        |


#  @Password_Validations
#
#  Scenario Outline: check validation on Password Text input Field
#
#    Given I am on the RegistrationPage.
#    When The user enters PassWord"<PasswordInput>"
#    Then user should get PassWord"<PasswordMessage>"
#    And The user enters Confirm PassWord"<ConfirmPasswordInput>"
#    And user should get Confirm PassWord"<ConfirmPasswordMessage>"
#    Examples:
#      | PasswordMessage                                                                                               | ConfirmPasswordMessage                               | PasswordInput | ConfirmPasswordInput |
#      | Password is required!                                                                                         | Confirm Password is required!                        |               |                      |
#      | Password must have atleast 8 characters including a uppercase, a lowercase, a number and a special character. | Confirm Password must be at least 8 characters long. | atif259       | atif259              |
#      |                                                                                                               | Password does not match.                             | Atif@100259   | Atifkamal100259      |


#  @Validation_on_second_Page
#
#  Scenario: check validation on Second page Mandatory Field
#
#    Given I am on the RegistrationSecondPage.
#    When  The user click on Register button
#    And  The user will get Validation


#  @Back_btn_Validation

#  Scenario: Submitt Registration Form Functional Check with correct Input
#
#    Given I am on second page of Registration by clicking on next button
#    When  user is on second page
#    Then  user Get validation of back  button


  @Functional_Testing

  Scenario Outline: Submitt Registration Form Functional Check with correct Input

    Given I am on the RegistrationSecondPage.
    When   Then  User can Fill all the Registration Second page elements e.g "<Nationalityopt>" , "<CompleteAddress>","<Pobox>","<CountryOpt>","<Cityopt>","<CountryCode>","<MobileNO>" and "<PhoneNO>" fields
    Then   The user Successfully Receive the form Submission Messages
    And   The user will get the Resend button click validation
    Examples:
      | Nationalityopt | CompleteAddress                              | Pobox | CountryOpt           | Cityopt | CountryCode          | MobileNO   | PhoneNO    |
      | Emirati        | Mr Ahmed AlWasl, Manager ,AAW GeneralTrading | 12345 | united arab emirates | dubai    | united arab emirates | 7765766544 | 7775646544 |
#      | Canadian       | Mr Ahmed Al Wasl, Manager,AAW General Trading | 13450 | Canada               | Vancouver | Canada               | 3365446544 | 3376576654 |
#      | Pakistani      | Mr Ahmed Al Wasl, Manager,AAW General Trading | 12395 | Pakistan             | Karachi   | Pakistan             | 5116576654 | 5126576654 |
#      | Italian        | Mr Ahmed Al Wasl, Manager,AAW General Trading | 23459 | Italy                | Bologna   | Italy                | 9765766544 | 9765766544 |


