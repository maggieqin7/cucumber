Feature:  roles
  Scenario: roles
    Given There are null in the list:
      | role    | name    | age     |
      | Manager | Dojo    | 23      |
      | Admin   | [blank] | [blank] |
      | [blank] | Joye    | 25      |

  Scenario: roles2
      Given roles method two have null value
        | role | jk   |
        | name | Kimi |
        | age  |      |