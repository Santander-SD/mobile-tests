package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class BasePage {

	private SelenideElement objectId = $(By.id("id"));
	
	public void clickOnObject() {
		objectId.click();
	}

}
