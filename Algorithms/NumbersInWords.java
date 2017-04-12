package com.fuse.katas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author smoola
 * 
 */
public class NumbersInWords {
	// Constructor
	private NumbersInWords() {
	}

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		long n = reader.nextInt(); // Scans the next token of the input as an
									// long.
		System.out.println("Number In Words:" + NumbersInWords.convert(n));

	}

	// Number names for tens
	private static final String[] tensNumberNames = { "", " ten", " twenty",
			" thirty", " forty", " fifty", " sixty", " seventy", " eighty",
			" ninety" };
	// Number names from 0-19
	private static final String[] singleAndTwoDigitNumberNames = { "", " one",
			" two", " three", " four", " five", " six", " seven", " eight",
			" nine", " ten", " eleven", " twelve", " thirteen", " fourteen",
			" fifteen", " sixteen", " seventeen", " eighteen", " nineteen" };

	// Converter for numbers less than thousand
	private static String converterForThreeDigitNums(int num) {
		String names;

		if (num % 100 < 20) {
			names = singleAndTwoDigitNumberNames[num % 100];
			num = num / 100;
		} else {
			names = singleAndTwoDigitNumberNames[num % 10];
			num = num / 10;

			names = tensNumberNames[num % 10] + names;
			num = num / 10;
		}
		if (num == 0)
			return names;
		return singleAndTwoDigitNumberNames[num] + " Hundred" + names;
	}

	public static String convert(long number) {
		if (number == 0) {
			return "zero";
		}

		String snumber = Long.toString(number);

		String padding = "000000000000";
		DecimalFormat df = new DecimalFormat(padding);
		snumber = df.format(number);

		int billions = Integer.parseInt(snumber.substring(0, 3));
		int millions = Integer.parseInt(snumber.substring(3, 6));
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = converterForThreeDigitNums(billions) + " billion ";
			break;
		default:
			tradBillions = converterForThreeDigitNums(billions) + " billion ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = converterForThreeDigitNums(millions) + " million ";
			break;
		default:
			tradMillions = converterForThreeDigitNums(millions) + " million ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = " one thousand";
			break;
		default:
			tradHundredThousands = converterForThreeDigitNums(hundredThousands)
					+ " thousand";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = converterForThreeDigitNums(thousands);
		result = result + tradThousand;

		return result;
	}

}
