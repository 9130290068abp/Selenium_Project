package BusinessLab;

import org.openqa.selenium.WebDriver;

import Pages.CalculatorPage;

public class Operations {
	WebDriver driver;
	CalculatorPage calculaterPage;

	public Operations(WebDriver driver) {
		this.driver = driver;
		calculaterPage = new CalculatorPage(driver);
	}

	public String add(double... values) {

		calculaterPage.back.click();
		int counter = (values.length) - 1;
		for (double value : values) {
			String number = String.valueOf(value);

			for (int i = 0; i < number.length(); i++) {
				char digitChar = number.charAt(i);
				if (Character.isDigit(digitChar)) {
					int digit = Character.getNumericValue(digitChar);
					clickElement(digit);
				} else {
					switch (digitChar) {
					case '.':
						calculaterPage.decimal.click();
						break;
					case '-':
						calculaterPage.negative.click();
						break;
					}
				}
			}
			if (counter != 0) {
				calculaterPage.add.click();
				counter--;
			}
		}
		calculaterPage.equal.click();
		String output = calculaterPage.result.getText();
		return output;
	}

	public void clickElement(int a) {
		switch (a) {

		case 1:
			calculaterPage.num1.click();
			break;
		case 2:
			calculaterPage.num2.click();
			break;
		case 3:
			calculaterPage.num3.click();
			break;
		case 4:
			calculaterPage.num4.click();
			break;
		case 5:
			calculaterPage.num5.click();
			break;
		case 6:
			calculaterPage.num6.click();
			break;
		case 7:
			calculaterPage.num7.click();
			break;
		case 8:
			calculaterPage.num8.click();
			break;
		case 9:
			calculaterPage.num9.click();
			break;
		case 0:
			calculaterPage.num0.click();
			break;

		}
	}

	public String minus(double... values) {
		calculaterPage.back.click();
		int counter = (values.length) - 1;
		for (double value : values) {
			String number = String.valueOf(value);

			for (int i = 0; i < number.length(); i++) {
				char digitChar = number.charAt(i);
				if (Character.isDigit(digitChar)) {
					int digit = Character.getNumericValue(digitChar);
					clickElement(digit);
				} else {
					switch (digitChar) {
					case '.':
						calculaterPage.decimal.click();
						break;
					case '-':
						calculaterPage.negative.click();
						break;
					}
				}
			}
			if (counter != 0) {
				calculaterPage.minus.click();
				counter--;
			}
		}
		calculaterPage.equal.click();
		String output = calculaterPage.result.getText();
		return output;
	}

	public void clickElement1(int a) {
		switch (a) {

		case 1:
			calculaterPage.num1.click();
			break;
		case 2:
			calculaterPage.num2.click();
			break;
		case 3:
			calculaterPage.num3.click();
			break;
		case 4:
			calculaterPage.num4.click();
			break;
		case 5:
			calculaterPage.num5.click();
			break;
		case 6:
			calculaterPage.num6.click();
			break;
		case 7:
			calculaterPage.num7.click();
			break;
		case 8:
			calculaterPage.num8.click();
			break;
		case 9:
			calculaterPage.num9.click();
			break;
		case 0:
			calculaterPage.num0.click();
			break;

		}

	}



	public String multiply(double... values) {
		calculaterPage.back.click();
		int counter = (values.length) - 1;
		for (double value : values) {
			String number = String.valueOf(value);

			for (int i = 0; i < number.length(); i++) {
				char digitChar = number.charAt(i);
				if (Character.isDigit(digitChar)) {
					int digit = Character.getNumericValue(digitChar);
					clickElement(digit);
				} else {
					switch (digitChar) {
					case '.':
						calculaterPage.decimal.click();
						break;
					case '-':
						calculaterPage.negative.click();
						break;
					}
				}
			}
			if (counter != 0) {
				calculaterPage.multiply.click();
				counter--;
			}
		}
		calculaterPage.equal.click();
		String output = calculaterPage.result.getText();
		return output;
	}

	public void clickElement2(int a) {
		switch (a) {

		case 1:
			calculaterPage.num1.click();
			break;
		case 2:
			calculaterPage.num2.click();
			break;
		case 3:
			calculaterPage.num3.click();
			break;
		case 4:
			calculaterPage.num4.click();
			break;
		case 5:
			calculaterPage.num5.click();
			break;
		case 6:
			calculaterPage.num6.click();
			break;
		case 7:
			calculaterPage.num7.click();
			break;
		case 8:
			calculaterPage.num8.click();
			break;
		case 9:
			calculaterPage.num9.click();
			break;
		case 0:
			calculaterPage.num0.click();
			break;

		}

	}

	public String divide(double... values) {
		calculaterPage.back.click();
		int counter = (values.length) - 1;
		for (double value : values) {
			String number = String.valueOf(value);

			for (int i = 0; i < number.length(); i++) {
				char digitChar = number.charAt(i);
				if (Character.isDigit(digitChar)) {
					int digit = Character.getNumericValue(digitChar);
					clickElement(digit);
				} else {
					switch (digitChar) {
					case '.':
						calculaterPage.decimal.click();
						break;
					case '-':
						calculaterPage.negative.click();
						break;
					}
				}
			}
			if (counter != 0) {
				calculaterPage.divide.click();
				counter--;
			}
		}
		calculaterPage.equal.click();
		String output = calculaterPage.result.getText();
		return output;
	}

	public void clickElement3(int a) {
		switch (a) {

		case 1:
			calculaterPage.num1.click();
			break;
		case 2:
			calculaterPage.num2.click();
			break;
		case 3:
			calculaterPage.num3.click();
			break;
		case 4:
			calculaterPage.num4.click();
			break;
		case 5:
			calculaterPage.num5.click();
			break;
		case 6:
			calculaterPage.num6.click();
			break;
		case 7:
			calculaterPage.num7.click();
			break;
		case 8:
			calculaterPage.num8.click();
			break;
		case 9:
			calculaterPage.num9.click();
			break;
		case 0:
			calculaterPage.num0.click();
			break;

		}

	}

}