package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuntenticarPage extends Base_Selenium{

	
	By usuarLog=By.name("userName");
	By passLog=By.name("password");
	By enviaLog=By.name("submit");
	By imgLog=By.xpath("//img[@src=\"images/mast_flightfinder.gif\"]");
	By LinkFinal=By.linkText("Flights");
	
	
	
	public AuntenticarPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//metodo para autenticar el usuario
	public void Autenticar() {
		if(isDisplay(usuarLog)) {
			
			type("jeiadmin", usuarLog);
			type("pass1", passLog);
			
			clic(enviaLog);
			clic(LinkFinal);
			
		}else {
			
			System.out.print("No cargo la pagina correcta");
		}
		
	}
	
	
	
	
	//metodo para la confirmacion d mensaje d inicio d sesion exitoso
	
	public Boolean MensajeExitoso() {
		return isDisplay(imgLog);
		
	}
	
	
}
