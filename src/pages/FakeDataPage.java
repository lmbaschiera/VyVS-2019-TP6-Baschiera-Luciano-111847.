package pages;

import org.openqa.selenium.By;

import controls.Label;

public class FakeDataPage extends BasePage {
	private Label name;
	public FakeDataPage() {
		super(By.xpath("//div[contains(text(),'Person Generator')]"));
		name= new Label(By.xpath("//div[@class='col-md-4 col-sm-6 col-xs-12']/p[@class='text-center name']"));
	}
	public String getZipCode() {
		return new Label(By.xpath("//p[5]/b")).Text().split(", ")[2];
	}
	public String getFirstName() {
		return name.Text().split(" ")[0];
	}
	public String getLastName() {
		return name.Text().split(" ")[2];
	}
	
}
