Feature: Spyrosoft website example test

  Scenario Outline: Visit parts of the Spyrosoft website
    Given I enter the spyrosoft website
    When I click on <menuItem>
    Then I assert that I have been taken to <URI>

    Examples:
      | menuItem | URI     |
      | Careers  | career  |
      | Contact  | contact |

    Scenario Outline: find a job for an automation tester
      Given I enter the spyrosoft website
      When I click on Careers
      And I select career menu item: <CareerMenuItem>
      And I select area: <area>
      And I select the job: <job>
      Then the job offer appears
      Then I assert that I have been taken to <URI>


      Examples:
      |CareerMenuItem | area | job | URI |
      | area          | qa   | automationTestet    |  automation-tester-media  |
