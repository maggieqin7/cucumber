Feature: data tables
  Background:
    Given There are a lot of animals
      | cow   |
      | horse |
      | sheep |

  Scenario: output animals
    Then Show animals

