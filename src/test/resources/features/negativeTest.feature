@negativeTest
@Acceptance



Feature:

  Background:
    Given I am on the google page

  @negativeTest_001 @Debug
  Scenario: Check results of search
    When I search for "Orange Bank" on goggle
    Then I accept less than 10.000 results as Not OK