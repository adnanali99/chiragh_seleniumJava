Feature: As a user i should be able to validate Profile,Change password & Inbox
#@Userprofile1

#  Scenario: check validation on of two tabs
#
#    Given The user is on the user dashboard
#    When  The user click on DashBoard Profile Link
#    Then  The Three tabs  KYC application and Profile info and OD request tab are present


#@Userprofile2
#
#Scenario: check validation on of two tabs
#
#  Given The user is on the user dashboard
#  When  The user click on DashBoard Profile Link
#  Then  The user will be able to see the details
#  @Userprofile3
#
#  Scenario: check validation on of two tabs
#
#    Given The user is on the user dashboard
#    When  The user click on DashBoard Profile Link
#    Then  The user will upload an profile icon file
#  @Userprofile4
#
#  Scenario: check validation on of two tabs
#
#    Given The user is on the user dashboard
#    When  The user click on DashBoard Profile Link
#    Then  The user will see the Natinal Id or Passport no
#
    @Change_Password_Validations

  Scenario Outline: check validation on Password Text input Field

    Given The user is on the user dashboard
    When The user click on DashBoard Profile Link
    Then The user enter CURRENT PASSWORD
    And user should get CURRENT PASSWORD vaidation "<PasswordMessage>"

    Examples:
      | PasswordMessage                                                                                               | PasswordInput |
      | Password is required!                                                                                         |               |
      | Password must have atleast 8 characters including a uppercase, a lowercase, a number and a special character. |atif259       |


