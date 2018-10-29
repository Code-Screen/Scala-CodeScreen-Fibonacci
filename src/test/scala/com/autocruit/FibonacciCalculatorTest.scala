package com.autocruit

import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class FibonacciCalculatorTest extends TestCase {

  def test_1 {
    assertEquals(FibonacciCalculator.calculate(0), 0);
  }

  def test_2 {
    assertEquals(FibonacciCalculator.calculate(5), 5)
  }

  def test_3 {
    assertEquals(FibonacciCalculator.calculate(20), 6765)
  }

  def test_4 {
    assertEquals(FibonacciCalculator.calculate(25), 75025)
  }

}