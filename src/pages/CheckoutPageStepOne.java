package pages;

import org.openqa.selenium.By;
import controls.Button;
import controls.Input;

public class CheckoutPageStepOne extends BasePage{
	public CheckoutPageStepOne() {
		super(By.xpath("//div[contains(text(),'Checkout: Your Information')]"));
	}
	public void inputFilling(String firstName, String lastName, String zipCode) {
		new Input(By.xpath("//input[@id='first-name']")).Write(firstName);
		new Input(By.xpath("//input[@id='last-name']")).Write(lastName);
		new Input(By.xpath("//input[@id='postal-code']")).Write(zipCode);
	}
	public Button getContinueButton() {
		return new Button(By.xpath("//div[@id='checkout_info_container']/div/form/div[2]/input"));
	}
}
	