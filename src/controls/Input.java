package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Input extends BaseControl{
	public Input(By findBy) {
		super(findBy);
	}
	public void Write(String text) {
		this.Element().clear();
		this.Element().sendKeys(text);
	}
	public String getPlaceholder() {
		return this.Element().getAttribute("placeholder");
	}
}
