Feature: Allo search tests

#  TODO: write tests for ${your.site.name} as cucumber scenarios

  Scenario Outline: Simple Cucumber Scenario
    Given I load Allo page
    Given I click search
    When I search Iphone15
    Then I see goods in page
    Given I switch To Next Page
    Given I switch To Search Page By Number
    Given I switch To Prev Page
    Examples:
      |  |

