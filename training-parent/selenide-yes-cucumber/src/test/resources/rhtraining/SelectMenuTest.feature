@selectMenu
  Feature: Select menu test
    Verifies functionality of the webpage's dropdown menus

  Scenario Outline: You can select an option for "<buttton-type>"
    Given I have a "<button type>" button and I click it
    When I click "<option>"
    Then "<option>" displays as text of the button in the field "<span>"




    Examples:
      | button type | option | span |
      | speed-button | Slower | 1 |
      | speed-button | Faster | 1 |
      | files-button | ui.jQuery.js | 2 |
      | files-button | Some unknown file | 2 |
      | number-button | 6 | 3 |
      | number-button | 19 | 3 |
      | salutation-button | Mrs. | 4 |
      | salutation-button | Other | 4 |
