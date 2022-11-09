Feature: To test the BMI calculator

  @Regression
  Scenario Outline: Calculate the BMI
    Given Open BMI calculator URL "https://www.calculator.net"
    Then Validate the Title "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science" of the current page
    When Click on BMI Calculator
    Then Validate the Title "BMI Calculator" of the current page
    When Enter Age "<Age>"
    And Enter Height "<Height>"
    And Enter Weight "<Weight>"
    And Tap on Calulate BMI
    Then Print the BMI Result
    And Close the browser

    Examples: 
      | Age | Height | Weight |
      |  10 |    127 |     40 |
      |  30 |    156 |     70 |
      |  25 |    152 |     55 |
      |  20 |    160 |     45 |
      |  35 |    160 |     70 |
