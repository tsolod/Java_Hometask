package ru.stqa.javahome.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {

  @Test
  public void testPrime () {
    Assert.assertTrue(Primes.isPrimes(Integer.MAX_VALUE));
  }

  @Test
  public void testPrimeWhile () {
    Assert.assertTrue(Primes.isPrimesWhile(Integer.MAX_VALUE));
  }

  @Test
  public void testNonPrime () {
    Assert.assertFalse(Primes.isPrimes(Integer.MAX_VALUE-2));
  }

  @Test (enabled = false)
  public void testPrimeLong () {
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrimes(n));
  }
  @Test
  public void testPrimeFast () {
    Assert.assertTrue(Primes.isPrimesFast(Integer.MAX_VALUE));
  }

}
