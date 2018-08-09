package main;

public class Fraction
{
	public static Fraction of(int numerator, int denominator)
	{
		return new Fraction(numerator, denominator);
	}

	private Fraction(int numerator, int denominator)
	{
	}

	public Fraction add(Fraction f)
	{
		return this;
	}

	public int numerator()
	{
		return 0;
	}

	public int denominator()
	{
		return 1;
	}
}
