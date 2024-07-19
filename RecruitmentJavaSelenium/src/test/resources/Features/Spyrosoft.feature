Feature: Spyrosoft website example test

  Scenario Outline: Visit parts of the Spyrosoft website
    Given I enter the spyrosoft website
    When I click on <menuItem>
    Then I assert that I have been taken to <URI>

    Examples:
      | menuItem | URI     |
      | Contact  | contact |

