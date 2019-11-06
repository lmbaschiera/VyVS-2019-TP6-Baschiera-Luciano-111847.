package pages;

import controls.Label;
import controls.Logo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import controls.Button;
import controls.Input;

public class LoginPage extends BasePage{
	public LoginPage() {
		super(By.cssSelector("div#main"));
	}
	public Input writeUsername() {
		return new Input(By.id("user-name"));
	}
	public Input writePassword() {
		return new Input(By.id("password"));
	}
	public Button loginButton() {
		return new Button(By.xpath("//input[@value='LOGIN']"));
	}
	public Logo getLoginLogo() {
		return new Logo(By.className("login_logo"));
	}
	public Label getErrorLabel() {
		return new Label(By.xpath("//div[@id='login_button_container']/div/form/h3"));
	}
}
