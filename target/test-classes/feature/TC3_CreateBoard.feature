Feature: Board

  Scenario: Ensure user create new list
    Given user in page Home
    When user open ones company
    Then user in page Company
    And user open ones team
    Then user in page Team
    When user click feature board
    Then user in page Board
    When user click add button
    Then user input field new list
    And user click submit
    Then user successfully add board