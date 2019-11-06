package pages;

import java.util.ArrayList;
import java.util.Random;

import controls.Label;
import org.openqa.selenium.By;
import controls.Button;

public class InventoryPage extends BasePage{
	
	private ArrayList<Button> itemList;
	private Button goToCart;
	
	public InventoryPage() {
		super(By.xpath("//div[contains(text(),'Products')]"));
		itemList = new ArrayList<>();
		goToCart = new Button(By.xpath("//span[contains(@class, 'shopping_cart_badge')]/.."));
		for(int i=1; i <= 6; i++) {
			itemList.add(new Button(By.xpath("//div[@class='inventory_list']/div["+i+"]/div[@class='pricebar']/button")));
		}
	}
	
	public Button getRandomItemButton() {
		return itemList.get(new Random().nextInt(6));
	}
	public Label getProductLabel() {
		return new Label(By.xpath("//div[contains(text(),'Products')]"));
	}
	public Button goToCartButton() {
		return goToCart;
	}
	public ArrayList<Button> getItems() {
		return itemList;
	}
	public Label howMany() {
		return new Label(By.xpath("//span[contains(@class, 'shopping_cart_badge')]/.."));
	}
}
