Feature: Use Chrome browser Search "cucumber" in baidu website
  Scenario Outline:  Search "cucumber" in baidu website
    Given Open the baidu website
    When input "<input>" in the baidu search box
    Then Show "<show>" in the website

    Examples:
      | input    | show     |
      | cucumber | cucumber |
      | java     | java     |