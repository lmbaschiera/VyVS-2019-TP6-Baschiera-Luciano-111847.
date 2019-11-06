package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Button extends BaseControl {
	public 	Button(By findBy) {
		super(findBy);
	}
	public void Click() {
		 this.Element().click();
	}
}
