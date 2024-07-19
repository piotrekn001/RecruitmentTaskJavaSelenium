Feature: API test

  Scenario Outline: send GET requests to an API
    Given I send a GET request to the <endpoint> endpoint
    Then the response contains <content>

    Examples:
    | endpoint | content |
    | products | id      |