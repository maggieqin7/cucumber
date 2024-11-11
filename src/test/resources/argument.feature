Feature: Open the shopping website to search phone and add it to the shop car
  Background:
    Given Open the shopping website homepage

  Scenario: add phone to shop car
    When Search "Xiaomi"
    Then Show "Xiaomi" 12 ?

  Scenario: add phone to shop car
    When Search "iphone16"
    Then Show "iphone" 16 ?

  Scenario: color balls
    When I have a blue ball

#  Examples: search
#    Given open baidu search
#    When input "<kw>"
#    Then show "<titile>"