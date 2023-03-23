

Feature: Benefit offers

  @flower
  Scenario: Verifying the offer benefits on homepage

  Given user is on Cashwise application homepage
   When user scrolls down to four benefits on homepage
    Then user should see all four options of the offer benefits
    | Convenient infographics|
    |General access          |
    |Advanced analytics      |
    |Security                |