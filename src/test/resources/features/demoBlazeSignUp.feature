Feature:DemoBlaze



  @blaze
  Scenario Outline: Verify that User can Not sign up successful by providing empty credentials
    Given user is on demo blaze application
    And user clicks on sign up button
    When user enters  credentials "<username>" and "<password>" and clicks sign up
    Then user should see alert message "<message>"



    Examples:
    |username|password| message      |
    |        |        |Please fill out Username and Password.           |
    |aika    |        |Please fill out Username and Password.           |
    |        |12345   |Please fill out Username and Password.           |
    |test    | 1234   |This user already exist.                         |
    |mira    | 1234567|Sign up successful.                              |






