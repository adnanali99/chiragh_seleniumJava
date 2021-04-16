Feature: Forgot Password testcases
@LoginValidation

Scenario Outline: User is successfully able to use Forgot Password functionality
Given User is on the login page
When clicks on the Forgot Password link
Then verify that user is redirected to "<Forgot_Password>" Page
And when user enters an "<email>"
And clicks on Submit button
Then user opens the email and clicks on the reset password link
And verify that user is reset password screen
And enters "<Pass1>" and "<Pass2>"
And clicks on Reset Password button
Then verify that password has been changed successfully and user is redirected to Login page

Examples:
| Forgot_Password | email | Pass1 | Pass2 |
| Chiragh - Forget Password    | chiragh.e2e@gmail.com | A1122a@@ | A1122a@@ |