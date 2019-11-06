package pages;

import org.openqa.selenium.By;
import controls.Button;

public class ShoppingCartPage extends BasePage{
	public ShoppingCartPage() {
		super(By.xpath("//div[contains(text(),'Your Cart')]"));
	}
	public Button getCartPageBtn() {
		return new Button(By.xpath("//span[contains(@class, 'shopping_cart_badge')]/.."));
	}
	public Button getCheckOutButton() {
		return new Button(By.xpath("//a[contains(@href, './checkout-step-one.html')]"));
	}
	public Button getFirstProduct() {
		return new Button(By.xpath("//div[@class='cart_item'][1]"));
	}
	public Button getSecondProduct() {
		return new Button(By.xpath("//div[@class='cart_item'][2]"));
	}
	public Button getThirdProduct() {
		return new Button(By.xpath("//div[@class='cart_item'][3]"));
	}
}
