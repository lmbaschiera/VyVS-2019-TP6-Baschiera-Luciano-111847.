package pages;

import org.openqa.selenium.By;

import controls.Label;

public class FinishPage extends BasePage {
	public FinishPage() {
		super(By.xpath("//div[contains(text(),'Finish')]"));
	}
	public Label getThankYouLabel() {
		return new Label(By.xpath("//div[@id='checkout_complete_container']/h2"));
	}
	public Label getOrderDispatchedLabel() {
		return new Label(By.xpath("//div[@id='checkout_complete_container']/div"));
	}

}
