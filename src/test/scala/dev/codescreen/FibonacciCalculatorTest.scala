package dev.codescreen

import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class FibonacciCalculatorTest extends TestCase {

  def test1 {
    assertEquals(BigInt(0), FibonacciCalculator.calculate(0))
  }

  def test2 {
    assertEquals(BigInt(5), FibonacciCalculator.calculate(5))
  }

  def test3 {
    assertEquals(BigInt(6765), FibonacciCalculator.calculate(20))
  }

  def test4 {
    assertEquals(BigInt(75025), FibonacciCalculator.calculate(25))
  }

}
