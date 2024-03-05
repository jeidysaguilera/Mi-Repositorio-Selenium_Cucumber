package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegistroTest {
	
	//declarar el webdriver
	
	private WebDriver driver;
	
	//luego crear el objeto d la PAGE q voy a usar
	
	RegistroPage registro;
	
	
	
	// enlace con el driver de chrome llamando al metodo d chrome

	@Before
	public void setUp() throws Exception {
		
		registro= new RegistroPage(driver);
		driver=registro.ChromeConection();
		registro.visit("https://demo.guru99.com/test/newtours/");
		
	}

	@After
	public void tearDown() throws Exception {
		
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//metdod decalarado en elpage para registra un usuario
		registro.RegistroUsuario();
		
		//compara el mensaje de exito que se espera con el q pasa la funcion de registro exitoso
		 assertEquals("Note: Your user name is jeiadmin", registro.MensajeRegistro());
		
		
	}

}
