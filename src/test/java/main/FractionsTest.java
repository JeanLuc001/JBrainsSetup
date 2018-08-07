package main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FractionsTest
{
	@Test
	public void whenAddingTwoFractionsThenExpectCorrectResult()
	{
		// Test 1
		Fraction f1 = Fraction.of(7, 3);
		Fraction f2 = Fraction.of(4, 5);
		Fraction added = f1.add(f2);
		assertTrue("wrong numerator", added.numerator() == 47);
		assertTrue("wrong denominator",added.denominator() == 15);

		// Test 2
		Fraction f3 = Fraction.of(5, 5);
		added = f1.add(f2);
		assertTrue("wrong numerator", added.numerator() == 10);
		assertTrue("wrong denominator",added.denominator() == 3);
	}
}
