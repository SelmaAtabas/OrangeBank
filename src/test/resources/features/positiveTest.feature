@positiveTest
@Acceptance



Feature:

  Background:
    Given I am on the google page

   @positiveTest_001
  Scenario: Check results of search
     When I search for "Orange Bank" on goggle
     Then I accept more than 100.000 results as OK


