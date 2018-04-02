Feature: cash withdrawal
    Scenario: successful withdrawal from account in credit
        Given I have deposited $100.00 in my account
        When I request $20
        Then $20 should be dispensed
        And the balance of my account should $80.00