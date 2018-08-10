package main;

import static main.Fraction.Sign.MINUS;
import static main.Fraction.Sign.PLUS;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Fraction.Sign;

public class FractionsTest
{
	private void assertEqualFractions(Fraction f, int expectedNumerator, int expectedDenominator, Sign sign)
	{
		assertTrue("wrong numerator", f.numerator() == expectedNumerator);
		assertTrue("wrong denominator", f.denominator() == expectedDenominator);
		assertEquals("wrong sign", sign, f.sign());
	}

	@Test(expected = IllegalArgumentException.class)
	public void when_denominator_is_0_then_illegalArgumentException()
	{
		Fraction.of(5, 0);
	}

	@Test
	public void when_adding_0_over_1_to_0_over_1_expect_0_over_1()
	{
		Fraction f1 = Fraction.of(0, 1);
		Fraction f2 = Fraction.of(0, 1);
		Fraction added = f1.add(f2);
		assertEqualFractions(added, 0, 1, PLUS);
	}

	@Test
	public void when_adding_7_over_3_to_4_over_5_then_expect_47_over_15()
	{
		Fraction f1 = Fraction.of(7, 3);
		Fraction f2 = Fraction.of(4, 5);
		Fraction added = f1.add(f2);
		assertEqualFractions(added, 47, 15, PLUS);
	}

	@Test
	public void when_adding_5_over_5_to_7_over_3_then_expect_10_over_3()
	{
		Fraction f1 = Fraction.of(7, 3);
		Fraction f2 = Fraction.of(5, 5);
		Fraction added = f1.add(f2);
		assertEqualFractions(added, 10, 3, PLUS);
	}

	@Test
	public void when_adding_5_over_5_to_minus_7_over_3_then_expect_minus_4_over_3()
	{
		Fraction f1 = Fraction.of(-7, 3);
		Fraction f2 = Fraction.of(5, 5);
		Fraction added = f1.add(f2);
		assertEqualFractions(added, 4, 3, MINUS);
	}
}
