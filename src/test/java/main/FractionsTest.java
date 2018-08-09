package main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FractionsTest
{
	@Test
	public void when_adding_0_over_1_to_0_over_1_expect_0_over_1()
	{
		Fraction f1 = Fraction.of(0, 1);
		Fraction f2 = Fraction.of(0, 1);
		Fraction added = f1.add(f2);
		assertTrue("wrong numerator", added.numerator() == 0);
		assertTrue("wrong denominator", added.denominator() == 1);
	}

	@Test
	public void when_adding_7_over_3_to_4_over_5_then_expect_47_over_15()
	{
		Fraction f1 = Fraction.of(7, 3);
		Fraction f2 = Fraction.of(4, 5);
		Fraction added = f1.add(f2);
		assertTrue("wrong numerator", added.numerator() == 47);
		assertTrue("wrong denominator", added.denominator() == 15);
	}
	// @Test
	// public void when_adding_5_over_5_to_7_over_3_then_expect_10_over_3()
	// {
	// Fraction f1 = Fraction.of(7, 3);
	// Fraction f2 = Fraction.of(5, 5);
	// Fraction added = f1.add(f2);
	// assertTrue("wrong numerator", added.numerator() == 10);
	// assertTrue("wrong denominator", added.denominator() == 3);
	// }
}
