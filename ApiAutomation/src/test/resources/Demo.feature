Feature: Login Page Feature
Scenario: Search Google
    When User hit Google page URL
    Then google search screen should display to user
    When User enters any keyword
    Then search results should display to user