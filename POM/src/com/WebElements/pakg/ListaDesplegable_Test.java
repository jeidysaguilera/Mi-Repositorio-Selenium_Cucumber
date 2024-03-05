package com.WebElements.pakg;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.proyect.pom.RegistroPage;

public class ListaDesplegable_Test {
	
	
	
	//declarar el webdriver
	
		private WebDriver driver;
		
		//luego crear el objeto d la PAGE q voy a usar
		
		ListaDesplegablePage registro;

	@Before
	public void setUp() throws Exception {
		
		registro= new ListaDesplegablePage(driver);
		driver=registro.ChromeConection();
		registro.visit("https://demo.guru99.com/test/newtours/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	public void test() throws InterruptedException {
		registro.Autenticar();
		Thread.sleep(2000);
		
		//cuando me de el resultado comparo con el numero q en realidad quiero
		assertEquals(registro.Cantidad_Pasajeros(),"4");
		Thread.sleep(2000);
		assertEquals(registro.Departamento_Seleccionado(),"Paris");
	}
	
	/*

	public void test() throws InterruptedException {
		
		registro.visit("https://react-bootstrap.netlify.app/docs/components/dropdowns");
		registro.Boton_Seleccion();
		
		
	}
	*/
	
	
	
	
}
