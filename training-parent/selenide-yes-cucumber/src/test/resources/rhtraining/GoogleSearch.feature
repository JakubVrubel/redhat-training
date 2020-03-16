@googleSearch
Feature: Google search test
  Verifies that searched keyword appears in the first result

  Scenario Outline: Searched keyword appears in the first result
    Given I have opened google
    When I search "<keyword>"
    Then "<keyword>" appears in the first result

    Examples:
      | keyword |
      | Facebook |
      | Selenide |
      | Discord |