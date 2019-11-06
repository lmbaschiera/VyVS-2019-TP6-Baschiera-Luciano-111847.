package pages;

import org.openqa.selenium.By;

import controls.Button;

public class CheckoutPageStepTwo extends BasePage{
	public CheckoutPageStepTwo() {
		super(By.xpath("//div[contains(text(),'Checkout: Overview')]"));
	}
	public Button getFinishButton() {
		return new Button(By.xpath("//div[@id='checkout_summary_container']/div/div[2]/div[8]/a[2]"));
	}

}
