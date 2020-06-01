package core;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import enums.ByValue;

public class Element {

	private String map;
	private ByValue by;
	private Integer posicao;

	public Element(String map, ByValue by) {
		this.map = map;
		this.by = by;
	}
	
	public Element(String map, ByValue by, Integer posicao) {
		this.map = map;
		this.by = by;
		this.posicao = posicao;
	}
	
	public WebElement getElement(By by) { 
		if (posicao == null) {
			return Driver.getDriver().findElement(by);
		}else {
			return Driver.getDriver().findElements(by).get(posicao); 
		}
	}

	public WebElement createElement() {
		WebElement element = null;
		switch (by) {
		case id:
			element = getElement(By.id(map));
			break;
		case xpath:
			element = getElement(By.xpath(map));
			break;
		case css:
			element = getElement(By.cssSelector(map));
			break;
		}
		return element;
	}
	
	public List<WebElement> creatElements() {
		List<WebElement> elements = new ArrayList<WebElement>();
		switch (by) {
		case id:
			elements = Driver.getDriver().findElements(By.id(map));
			break;
		case xpath:
			elements = Driver.getDriver().findElements(By.xpath(map));
			break;
		case css:
			elements = Driver.getDriver().findElements(By.cssSelector(map));
			break;
			
		default:
			break;
		}
		return elements;
	}
	
	public void click() {
		createElement().click();
	}
	
	public void clickElementValue(String valor) {
		for (WebElement webElement : creatElements()) { 
			if(webElement.getAttribute("value").equals(valor)) {
				webElement.click(); 
				break;
			}
		}
	}
	
	public void clickElementText(String valor) {
		for (WebElement webElement : creatElements()) { 
			if(webElement.getText().equals(valor)) { 
				webElement.click();
				break;
			}
		}
	}
	
	public void selectText(String value) {
		Select select = new Select(createElement());
		select.selectByVisibleText(value);
	}
	
	public void sendKeys(CharSequence value) {
		createElement().sendKeys(value);
	}

	public String getText() {
		return createElement().getText();
	}
}
