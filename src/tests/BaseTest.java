package tests;

import org.openqa.selenium.WebDriver;

import driver.DriverManager;

public class BaseTest {
	private WebDriver driver;
	public BaseTest() {
		this.driver=DriverManager.Instance().Driver();
		this.driver.get("https://www.saucedemo.com/");
	}
	protected WebDriver Driver() {
			return this.driver;
	}
	public void Finalize() {
		DriverManager.Instance().CloseDriver();
	}
}
