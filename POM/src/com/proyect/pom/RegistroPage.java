package com.proyect.pom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroPage extends Base_Selenium {

	
	//se declaran todos los localizaDORES PARA esa pagina
	
	By linkText=By.linkText("REGISTER");
	By LocalizadorImg=By.xpath("//img[@src=\"images/mast_register.gif\"]");
	By IdName=By.id("email");
	By Password=By.name("password");
	By Confirm=By.cssSelector("input[name=\"confirmPassword\"]");
	By enviar=By.name("submit");
	
	By mensajeRegistro=By.tagName("font");
	
	
	
	public RegistroPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//metodo para registra al usuario
	public void RegistroUsuario() throws InterruptedException {
		
		clic(linkText);
		Thread.sleep(2000);
		if(isDisplay(LocalizadorImg)) {
			
			type("jeiadmin", IdName);
			type("pass1", Password);
			type("pass1", Confirm);
			
			clic(enviar);
		}
		else {
			System.out.print("No registrado");
			
		}
	}
	
	
	
	
	//metodo q nos devuelve el mensaje q espera el susuario si el registro fue exitoso
	//texto del quinto eleemnto d la lista
	
	public String MensajeRegistro() {
		
		List<WebElement> listaFonts=FindElements(mensajeRegistro);
		
		return getText(listaFonts.get(5));
		
		
		
	}
	
	
}
