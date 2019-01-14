package dev.codescreen

import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class FibonacciCalculatorHiddenTest extends TestCase {

  def testHidden1 {
    assertEquals(BigInt(377), FibonacciCalculator.calculate(14))
  }

  def testHidden2 {
    assertEquals(BigInt(610), FibonacciCalculator.calculate(15))
  }

  def testHidden3 {
    assertEquals(BigInt(2584), FibonacciCalculator.calculate(18))
  }

  def testHidden4 {
    assertEquals(BigInt(4181), FibonacciCalculator.calculate(19))
  }

}
