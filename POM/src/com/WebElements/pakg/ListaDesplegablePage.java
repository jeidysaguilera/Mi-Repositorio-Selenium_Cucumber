package com.WebElements.pakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.proyect.pom.Base_Selenium;

public class ListaDesplegablePage extends Base_Selenium{

	
	
	public ListaDesplegablePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//lista despegable con html clasico
	
	By Lista_Pasajeros=By.name("passCount");
	
	By Departamentos=By.name("fromPort");
	
	
	By usuarLog=By.name("userName");
	By passLog=By.name("password");
	By enviaLog=By.name("submit");
	By imgLog=By.xpath("//img[@src=\"images/mast_flightfinder.gif\"]");
	By LinkFinal=By.linkText("Flights");
	
	
	//lista despegable con REACT BOOSTRAP
	
	By lista_Boton=By.id("dropdown-basic-button");
	By seleccionado=By.cssSelector("div[class=\"dropdown-menu show\"]>a[href=\"#/action-2\"]");
	
	//metodo para autenticar el usuario
	public void Autenticar() {
		if(isDisplay(usuarLog)) {
			
					
			clic(enviaLog);
			clic(LinkFinal);
			
		}else {
			
			System.out.print("No cargo la pagina correcta");
		}
		
	}
	
	
	//metodo para seleccionar en la lista s caNTIDAD D pasajeros
	
	
	public String Cantidad_Pasajeros() {
		
		//se crea un objeto d tipo select pasandole el elemnto de la lista desplegable
		
		Select selectList=new Select(FindElement(Lista_Pasajeros));
		
		//metodo para encontrar la opcion a la q queremos ir
		selectList.selectByVisibleText("4 ");
		
		//me devuelve el texto de la opcion q esta seleccionada
		
		return getText(selectList.getFirstSelectedOption());
		
		
	}
	
	
	public String Departamento_Seleccionado() {
		
		Select listdep=new Select(FindElement(Departamentos));
		listdep.selectByVisibleText("Paris");
		
		return getText(listdep.getFirstSelectedOption());
	}
	
	
	//metodo para la lista a seleccionar de tipo react
	
	public void Boton_Seleccion() throws InterruptedException {
		
		clic(lista_Boton);
		Thread.sleep(2000);
		clic(seleccionado);
		
		
	}
	
	
}
