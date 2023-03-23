Feature: demo blaze login

#  Scenario Outline: Verify that User can Not sign up successful by providing invalid credentials
#    Given user is on demo blaze application
#    And user clicks on sign up button
#    When user enters  credentials "<username>" and "<password>" and clicks sign up
#    Then user should see alert message "<message>"
#
#
#
#    Examples:
#      | username                | password      | message              |
#      | blablablablabla12345677 |               | User does not exist. |
#      | mira97084               | wrongPassword | Wrong Password.      |


  @mira1234
  Scenario: Verifying the login functionality positive
    Given user is on demo blaze application
    And user clicks on log in button for demoblaze
    When user enters credentials "mira1234" and "mira1234" and clicks login
    Then user should successfully login to application
