package com.autocruit

import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class FibonacciCalculatorHiddenTest extends TestCase {

  def test_hidden_1 {
    assertEquals(FibonacciCalculator.calculate(14), 377);
  }

  def test_hidden_2 {
    assertEquals(FibonacciCalculator.calculate(15), 610)
  }

  def test_hidden_3 {
    assertEquals(FibonacciCalculator.calculate(18), 2584)
  }

  def test_hidden_4 {
    assertEquals(FibonacciCalculator.calculate(19), 4181)
  }

}