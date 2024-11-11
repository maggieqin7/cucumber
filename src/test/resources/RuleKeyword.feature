Feature: Highlander
  Rule: There can be only one

    Scenario: Only on -- More than one alive
      Given There are 3 ninjas
      And There are more than one ninja alive
      When 2 ninjas dies (but me)
      And There is one ninja less alive

    Scenario: Only one -- one alive
      Given There are more than one ninja alive
      Then He or She will live forever

  Rule: There can be Two in some cases
    Scenario: Two -- Dead and Reborn as Phoenix


    Scenario: Mutiple Givens
      Given one thing
      Given another thing
      Given yet another thing
      When I open my eyes
      Then I should see something
      Then I shouldn't see something else


    Scenario: Mutiple Givens
      Given one thing
      And another thing
      And yet another thing
      When I open my eyes
      Then I should see something
      But I shouldn't see something else
