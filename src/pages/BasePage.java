package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.DriverManager;

public class BasePage {
	protected By by;
	public BasePage(By findby) {
		this.by=by;
	}
	public WebDriver Driver() {
			return DriverManager.Instance().Driver();
	}
}
