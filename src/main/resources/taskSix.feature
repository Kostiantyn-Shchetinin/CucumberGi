Feature: I want to test task 6

  Scenario: I want to test login with correct credentials
    Given I go to main page
    When I choose task "6"
    When I login as "tester" with password "123-xyz"
    Then I should see a defitine link
