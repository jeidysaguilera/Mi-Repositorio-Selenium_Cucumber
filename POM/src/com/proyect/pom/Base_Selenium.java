package com.proyect.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Selenium {

	private WebDriver driver;
	
	//constructor de la clase
	
	public Base_Selenium(WebDriver driver) {
	
	this.driver=driver;
}
	
	
	//metodo para la cnexion con el navegador este caso el CHROME, l q hace es llamar al chrome driver
	
	public WebDriver ChromeConection() {
		
	System.setProperty("webdriver.chrome.driver", "/mnt/Data/COSAS JEI/JAVA/drivers/chromedriver-linux64/chromedriver");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	}
	
	
	// es necesario hacer un Wrapper o sea envoltorio d la mayoria d los metodos d selenium
	
	   //buscar un elemento
	
	public WebElement FindElement(By locator) {
		return driver.findElement(locator);
			}
	
	   //metodo q nos devuelve una lista de elementos
	
	public List<WebElement> FindElements(By locator){
		
		return driver.findElements(locator);
	}
	
	  //devuelve el texto del elemento q estoy pasando como parametro
	
	public String getText(WebElement element) {
		
		return element.getText();
	}
	 
	  //devuelve el texto del elemento q estoy buscando a traves d ese localizador
	public String getText(By locator) {
		
		return driver.findElement(locator).getText();
	}
	
	   //funcion para escribir vaa recibir un texto q es el q se va a escribir y un localizador q es el q va a localizar 
	// el elemento donde se quiere escribir ese texto
	
	
	public void type(String texto, By locator) {
		
		driver.findElement(locator).sendKeys(texto);
	}
	
	  //dar clic
	public void clic(By locator) {
		driver.findElement(locator).click();
		
	}
	
	   //metodo boleans para saber si elemento se enecuntra listo para ser utilizado
	public Boolean isDisplay(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
			
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	   //metodo get , es el encargado d recibir la url y abrir la pagina
	
	public void visit(String url) {
		driver.get(url);
		
	}
	
}
